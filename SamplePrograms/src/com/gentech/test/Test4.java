package com.gentech.test;
//5)multiple static blocks

class MultipleStatic
{
    static
    {
        System.out.println("this is first line");//1
    }

    static
    {
        System.out.println("this is second line");//2
    }

    static
    {
        System.out.println("this is third line");//3
    }

}
public class Test4
{
    public static void main (String args[])
    {

    }
}
// it will execute in sequential manner
