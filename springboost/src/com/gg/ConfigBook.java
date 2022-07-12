package com.gg;

@Configuration
public class ConfigBook {
    @Bean
    public Book getbook(){

        return new Book(12,"geetanjali",12);
    }
    @Bean
    public Category getC(){

        return new Category("programming",getbook());
    }




}
