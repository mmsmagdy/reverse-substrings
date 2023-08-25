package com.java.reversesubstrings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.reversesubstrings.service.ReverseSubstringsService;


@SpringBootApplication
public class ReverseSubstringsApplication {


    public static void main(String[] args) {
        SpringApplication.run(ReverseSubstringsApplication.class, args);

        String[] testCases = {"abd(jnb)asdf", "abdjnbasdf", "dd(df)a(ghhh)"};

        for (String test : testCases) {
            String output = ReverseSubstringsService.reverseParentheses(test);
            System.out.println("Input: " + test);
            System.out.println("Output: " + output);
            System.out.println();
        }

    }

}
