package com.gentech.assignment.Strings;

public class Pattern2 {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int length = word.length();
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }

        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}

