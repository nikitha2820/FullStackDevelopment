package com.gentech.assignment.Strings;
public class Palindrome {
    public static void main(String[] args) {
        String original = "malayalam";
        boolean isPalindrome = true;

        int left = 0;
        int right = original.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(original.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(original.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(original.charAt(left)) != Character.toLowerCase(original.charAt(right))) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
