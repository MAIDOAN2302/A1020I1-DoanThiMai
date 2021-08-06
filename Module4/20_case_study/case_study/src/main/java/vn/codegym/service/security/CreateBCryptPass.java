package vn.codegym.service.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CreateBCryptPass {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123"));/*admin*/
        System.out.println(passwordEncoder.encode("user123"));/*user*/
        System.out.println(passwordEncoder.encode("abc123"));/*nhân viên*/
        System.out.println(passwordEncoder.encode("root123"));/*quản lý*/
        System.out.println(passwordEncoder.encode("dba123"));/*giám đốc*/
    }
}
