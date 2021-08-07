package vn.codegym.config;

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
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import vn.codegym.service.security.impl.MyUserDetailServiceImpl;

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
        http.csrf().disable().cors();

        //         Các trang không yêu cầu login
        http.authorizeRequests().antMatchers("/", "/login", "/logout", "/service/list").permitAll();

        //         Trang chỉ dành cho giám đốc và quản lý
        http.authorizeRequests().antMatchers("/employee/create", "/employee/view/**", "/employee/update/**",
                "/employee/delete/**").access("hasAnyRole('ROLE_QUANLY', 'ROLE_GIAMDOC')");

        //         Trang dành cho nhân viên, quản lý, giám đốc
        http.authorizeRequests().antMatchers("/employee/list","/customer/list", "/customer/create", "/customer/update",
                "/customer/view", "/customer/delete", "/service/create", "/contract/list",
                "/contract/create", "/contractDetail/list", "/contractDetail/create")
                .access("hasAnyRole('ROLE_QUANLY', 'ROLE_NHANVIEN', 'ROLE_GIAMDOC')");

        // Khi người dùng đăng nhập với username là A,
        // Nhưng lại muốn đăng nhập vào trang không được phân quyền
        // Ngoại lệ AccessDeniedException sẽ ném ra.
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

        // Cấu hình cho Login Form.
        http.authorizeRequests().and().formLogin()//
                .loginProcessingUrl("/j_spring_security_check")
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .failureUrl("/login?error=true")
                .usernameParameter("username")
                .passwordParameter("password")
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/");

        /* cấu hình remember me*/
        http.authorizeRequests().and().rememberMe()
                /* câu hình nơi lưu thông tin remember me và thời gian lưu cookie tại client*/
                .tokenRepository(this.persistentTokenRepository()).tokenValiditySeconds(60 * 60 * 10);
    }

    /* Cấu hình nơi lưu thông tin remember me*/
    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        /* dang cấu hình lưu tại memory của server */
        InMemoryTokenRepositoryImpl memoryTokenRepository = new InMemoryTokenRepositoryImpl();
        return memoryTokenRepository;
    }
}
