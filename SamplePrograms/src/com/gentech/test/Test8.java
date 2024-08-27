package com.gentech.test;
class ByteArray
{
    byte[] getArray(byte a[])
    {
        byte res[]= new byte[a.length];
        for(int i=0;i<a.length;i++)
        {
            res[i]=a[i];
        }
        return res;
    }
}
public class Test8
{
    public static void main(String[] args)
    {
        ByteArray o=new ByteArray();
        byte a[]={1,2,3,4,5,6};
        byte c[]=o.getArray(a);
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i] + " ");
        }

    }
}
