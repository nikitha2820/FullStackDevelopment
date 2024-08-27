package com.gentech.methods;
class Array1D
{
    void Array1D()
    {
        String a[]={"hi","heloo","key","bye"};
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
public class Example3 {
    public static void main(String[] args) {
        Array1D o=new Array1D();
        o.Array1D();
    }
}
