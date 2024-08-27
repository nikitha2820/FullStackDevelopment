package com.gentech.assignment.returnmethod;
//display 2nd half from 1d int array
class Array
{
    int[] getSecHalf(int a[])
    {
        int res[]= new int[a.length-a.length/2];
        for(int i=a.length/2;i<a.length;i++)
        {
            res[i-a.length/2]=a[i];
        }
        return res;
    }
}
public class Quest3 {
    public static void main(String[] args) {
        Array a1=new Array();
        int a[]={1,2,3,4,5,6};
        //assigning return value to c[]
        int c[]=a1.getSecHalf(a);
        //printing return value
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i] + " ");
        }

    }
}
