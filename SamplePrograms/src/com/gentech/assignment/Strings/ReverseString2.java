package com.gentech.assignment.Strings;
public class ReverseString2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        String reversed = "";

        for(int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        System.out.println("Reversed string: " + reversed);
    }
}
