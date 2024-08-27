package com.gentech.test;
class Largest{
    int getLarge(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
public class Test12 {
    public static void main(String[] args) {
        Largest o=new Largest();
        int val=o.getLarge(10,20);
        System.out.println(val);
    }
}
