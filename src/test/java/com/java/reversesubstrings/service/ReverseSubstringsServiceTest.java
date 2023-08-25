package com.java.reversesubstrings.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseSubstringsServiceTest {

    @Test
    public void testReverseSubstrings() {
        String[] inputs = {"abd(jnb)asdf", "abdjnbasdf", "dd(df)a(ghhh)"};

        String[] expectedOutputs = {"abd(bnj)asdf", "abdjnbasdf", "dd(fd)a(hhhg)"};

        for (int i = 0; i < inputs.length; i++) {
            String output = ReverseSubstringsService.reverseParentheses(inputs[i]);
            assertEquals(expectedOutputs[i], output);

        }
    }
}
