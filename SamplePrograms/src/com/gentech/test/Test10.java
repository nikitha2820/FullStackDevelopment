package com.gentech.test;
class Factorail {
    int getFactorial(int num) {
        int fact = 1;
        for (int i = num; i >=1; i--)
        {
            fact = fact * i;
        }
        return fact;
    }
}
public class Test10
{
    public static void main(String[] args)
    {
        Factorail f=new Factorail();
        int val= f.getFactorial(5);
        System.out.println(val);
}
}
