package com.gentech.assignment.returnmethod;
//return diagonl ele of 2 short array
class Short2D{
    short[] diagonalElements(short a[][])
    {
        short res[]=new short[a[0].length];
        for(int i=0;i<a.length;i++)
        {
            res[i]=a[i][i];
        }
        return res;
    }
}
public class Quest10 {
    public static void main(String[] args) {
        Short2D s=new Short2D();
        short a[][]={{1,2},{3,4}};
        short c[]=s.diagonalElements(a);
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]+" ");
        }
    }
}
