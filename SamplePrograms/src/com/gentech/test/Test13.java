package com.gentech.test;
class Average
{
    int getavg(int a,int b,int c)
    {

        return (a+b+c)/3;
    }
}
public class Test13 {
    public static void main(String[] args) {
        Average a1 = new Average();
        int val = a1.getavg(2, 4, 4);
        System.out.println(val);
    }
}
