package com.gentech.assignment.Strings;
public class NoChar
{
    public static void main(String[] args)
    {
        String str = "Hello";
        int count = 0;
        for(char c : str.toCharArray())
        {
            count++;
        }
        System.out.println("Number of characters in the string: " + count);
    }
}

