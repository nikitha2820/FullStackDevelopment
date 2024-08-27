package com.gentech.assignment.Strings;
public class Pattern1 {
        public static void main(String[] args) {
            String word = "PROGRAM";
            int length = word.length();
            for (int i = 1; i <= length; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(word.charAt(j) + " ");
                }
                System.out.println();
            }
        }
    }

