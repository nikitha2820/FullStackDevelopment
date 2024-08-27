package com.gentech.assignment.returnmethod;
//return factorial of num
class Factorial
{
    int getFact(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
           fact=fact*i;
        }
        return fact;
    }
}
public class Quest5 {
    public static void main(String[] args) {
        Factorial f=new Factorial();
        int c=f.getFact(5);
        System.out.println("factorial is "+c);
    }
}
