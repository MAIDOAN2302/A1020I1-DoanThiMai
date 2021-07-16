package com.codegym;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AopConfig {
    @Bean
    public BookLogger bookLogger(){
        return new BookLogger();
    }
    @Bean
    public LibraryLogger libraryLogger(){
        return new LibraryLogger();
    }
}
