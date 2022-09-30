package com.example.demo;

import com.example.demo.Basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplicationBasic {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(DemoApplicationBasic.class, args);
        var binarySearch = appContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{1, 2, 3}, 4);
        System.out.println(result);

    }

}
