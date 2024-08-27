package com.gentech.assignment.returnmethod;
//display 1st half from 1d int array
class IntArray
{
   int[] getFirstHalf(int a[])
   {
       int res[]= new int[a.length/2];
       for(int i=0;i<a.length/2;i++)
       {
           res[i]=a[i];
       }
       return res;
   }
}
public class Quest1 {
    public static void main(String[] args) {
        IntArray a1=new IntArray();
        int a[]={1,2,3,4,5,6};
        //assigning return value to c[]
        int c[]=a1.getFirstHalf(a);
        //printing return value
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i] + " ");
        }

    }
}
