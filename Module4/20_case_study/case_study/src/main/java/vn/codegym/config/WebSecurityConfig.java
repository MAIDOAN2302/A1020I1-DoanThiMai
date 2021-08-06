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
        http.csrf().disable()
                .formLogin()
//                .loginPage() /*Khai bao URL pattern cua man hinh login*/
                .defaultSuccessUrl("/").permitAll()

                .and()
                /* Khai báo URL ai cũng có thể vào mà k cần xác thực */
                .authorizeRequests().antMatchers("/", "/css/**", "/images/**", "/jquery/**", "/service/list").permitAll()

                /* nhân viên sẽ được vào tạo, thêm, sửa,xoá khách hàng, tạo hợp đồng, xoá , sửa, xem,
                 * tạo dịch vụ, xem; tạo-xem hợp đồng chi tiết*/
                .antMatchers("/employee/list", "/customer/list", "/customer/create", "/customer/view", "/customer/update",
                        "/contract/list", "/contract/create", "/contractDetail/list", "/contractDetail/create")
                .hasAnyRole("ROLE_QUANLY", "ROLE_GIAMDOC", "ROLE_NHANVIEN")

                /*URL chỉ có quản lý và giám đốc được vào tạo, thêm, xem nhân viên*/
                .antMatchers("/employee/create", "/employee/update/**", "employee/view/**", "employee/delete/**").
                hasAnyRole("ROLE_QUANLY", "ROLE_GIAMDOC")

                /* tất cả request ngoài những URL pattern trên sẽ bắt buộc xác thực - login */
                .anyRequest().authenticated();


        /*URL trả về khi không có quyền truy cập vào URL nào đó*/
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/accessDenied");

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
