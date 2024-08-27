package com.gentech.test;
class BooleanArray
{
    static boolean[] getArray(boolean a[])
    {
        boolean res[]=new boolean[a.length];
        for(int i=0;i<a.length;i++)
        {
           res[i]=a[i];
        }
        return res;
    }
}
public class Test1
{
    public static void main(String[] args)
    {
        BooleanArray o1=new BooleanArray();
        boolean b[]={true,false,true};
        boolean c[]=o1.getArray(b);
        for(int j=0;j<c.length;j++)
        {
            System.out.print(c[j]+" ");
        }
    }
}
