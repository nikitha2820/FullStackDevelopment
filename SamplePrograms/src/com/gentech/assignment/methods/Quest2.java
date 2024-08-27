package com.gentech.assignment.methods;
class Sums
{
    void Sums(int a[])

    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
          sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
public class Quest2 {
    public static void main(String[] args) {
        int b[]={1,2,3,4};
        Sums s1=new Sums();
        s1.Sums(b);
    }
}
