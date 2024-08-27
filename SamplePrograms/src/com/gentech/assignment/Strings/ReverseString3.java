package com.gentech.assignment.Strings;
public class ReverseString3 {
    public static void main(String[] args) {
        String str = "Hello World!";
        String reversed = "";

        for(int i = str.length(); i > 0; i--) {
            reversed += str.substring(i - 1, i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}

