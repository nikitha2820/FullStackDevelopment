package com.gentech.assignment.returnmethod;
//return sum of all elements from given 1d array
class IntegerArray
{
    int sumAll(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
}
public class Quest2 {
    public static void main(String[] args)
    {
        IntegerArray a1=new IntegerArray();
        int a[]={10,20,30,40};
        int res=a1.sumAll(a);
        System.out.println("sum off all elements is:"+res);
    }
}
