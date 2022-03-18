package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Objective
Today, we're getting started with Exceptions by learning how to parse an integer from a string and print a custom error message. Check out the Tutorial tab for learning materials and an instructional video!

Task
Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.

Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a  score.

Input Format
A single string, S.

Constraints
1 <= |S| <= 6, where |S| is the length of string S.
S is composed of either lowercase letters (a to z) or decimal digits (0 - 9).

Output Format
Print the parsed integer value of S, or Bad String if S cannot be converted to an integer.
 */

public class atividade13 {
    public static class Solution {
        public void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String S = bufferedReader.readLine();

            try{
                Integer.parseInt(S);
                System.out.println(S);

            } catch (NumberFormatException e) {
                System.out.println("Bad String");
                bufferedReader.close();
            }

        }
    }

}
