package com.gentech.assignment.Strings;
public class ReplaceString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String oldString = "World";
        String newString = "Java";
        String result = "";

        int i = 0;
        int len = oldString.length();

        while (i <= original.length() - len) {
            if (original.substring(i, i + len).equals(oldString)) {
                result += newString;
                i += len;
            } else {
                result += original.charAt(i);
                i++;
            }
        }
        result += original.substring(i);

        System.out.println("Original string: " + original);
        System.out.println("Modified string: " + result);
    }
}

