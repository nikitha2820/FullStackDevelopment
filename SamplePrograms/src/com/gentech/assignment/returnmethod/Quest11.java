package com.gentech.assignment.returnmethod;
// Return string concatenation
class Concate
{
    String returnString(String[] a)
    {
        String s="";
        for(String val : a)
          s = s + val + " ";//for each value in a :val
        return s;
    }
}
public class Quest11 {
    public static void main(String[] args) {
        String[] s = {"juice","tea","tree","coffee"};
        Concate o =new Concate();
        String ans = o.returnString(s);
        System.out.println("Concatenated  string :"+ans);
    }
}