package com.gentech.test;
class BirdsName{
    String[] getBirds(String a[])
    {
        String res[]=new String[a.length];
        for(int i=0;i<a.length;i++)
        {
          res[i]=a[i];
        }
        return res;
    }
}
public class Test11 {
    public static void main(String[] args) {
        BirdsName b1 = new BirdsName();
        String b[] = {"sparrow", "peacok", "swan"};
        String c[] = b1.getBirds(b);
        for(int j=0;j<c.length;j++)
        {
            System.out.print(c[j]+" ");
        }
    }
}
