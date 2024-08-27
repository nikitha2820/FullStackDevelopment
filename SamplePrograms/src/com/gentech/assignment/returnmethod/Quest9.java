package com.gentech.assignment.returnmethod;
//return table for num
class Tables
{
    int[] mathTable(int num)
    {
        int a[]=new int[11];
        for(int i=0;i<=10;i++)
        {
           a[i]=i*num;
        }
        return a;
    }
}
public class Quest9 {
    public static void main(String[] args) {
        Tables t=new Tables();
        int c[]=t.mathTable(3);
        for (int i=0;i<c.length;i++)
        {
            System.out.println("3 *"+i+"="+c[i]);
        }

    }
}
