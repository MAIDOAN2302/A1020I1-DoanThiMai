package com.codegym.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    CustomSuccessHandler customSuccessHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("bill").password(passwordEncoder().encode("abc123")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder().encode("root123")).roles("ADMIN")
                .and()
                .withUser("dba").password(passwordEncoder().encode("root123")).roles("ADMIN", "DBA");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/home").access("hasRole('USER')")
                .antMatchers("/admin/**").access("hasRole('ADMIN')")
                .antMatchers("/dba/**").access("hasRole('ADMIN') and hasRole('DBA')")
                .and().formLogin().successHandler(customSuccessHandler)
                .usernameParameter("ssoId").passwordParameter("password")
                .and().csrf()
                .and().exceptionHandling().accessDeniedPage("/Access_Denied");
    }

    /* Cấu hình nơi lưu thông tin remember me*/
    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        /* dang cấu hình lưu tại memory của server */
        InMemoryTokenRepositoryImpl memoryTokenRepository = new InMemoryTokenRepositoryImpl();
        return memoryTokenRepository;
    }
}