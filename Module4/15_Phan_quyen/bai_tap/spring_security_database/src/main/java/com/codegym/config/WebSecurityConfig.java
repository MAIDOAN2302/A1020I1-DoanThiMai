package com.codegym.config;

import com.codegym.service.impl.MyUserDetailServiceImpl;
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
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailServiceImpl myUserDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/customer").permitAll()

                .and()
                .authorizeRequests().antMatchers("/hello").permitAll()
                .antMatchers("/customer/create").hasRole("ADMIN")
                .antMatchers("/customer").hasAnyRole("ADMIN", "USER")
                .anyRequest().authenticated();


        http.authorizeRequests().and().rememberMe()
                .tokenRepository(this.persistentTokenRepository()).tokenValiditySeconds(60 * 60 * 10);


    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        InMemoryTokenRepositoryImpl memoryTokenRepository = new InMemoryTokenRepositoryImpl();
        return memoryTokenRepository;
    }
}
