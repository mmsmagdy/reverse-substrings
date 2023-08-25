package com.java.reversesubstrings.service;

import java.util.Stack;

import org.springframework.stereotype.Service;

@Service
public class ReverseSubstringsService {

    public static String reverseParentheses(String inboundString) {
        Stack<Integer> stringStack = new Stack<>();
        StringBuilder reversedString = new StringBuilder(inboundString);

        for (int i = 0; i < inboundString.length(); i++) {
            if (inboundString.charAt(i) == '(') {
                stringStack.push(i);
            } else if (inboundString.charAt(i) == ')') {
                reverseSubstring(reversedString, stringStack.pop() + 1, i - 1);
            }
        }

        return reversedString.toString();
    }

    private static void reverseSubstring(StringBuilder reversedString, int startChar, int endChar) {
        while (startChar < endChar) {
            char helperChar = reversedString.charAt(startChar);
            reversedString.setCharAt(startChar, reversedString.charAt(endChar));
            reversedString.setCharAt(endChar, helperChar);
            startChar++;
            endChar--;
        }
    }
}
