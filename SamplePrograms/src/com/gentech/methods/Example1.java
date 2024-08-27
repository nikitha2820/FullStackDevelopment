package com.gentech.methods;

class Sum
{
    void Sum()
    {
        int sum=0;
        for(int i=1;i<=50;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum:"+sum);
    }
}
public class Example1 {
    public static void main(String[] args) {

        Sum s=new Sum();
        s.Sum();
    }
}
