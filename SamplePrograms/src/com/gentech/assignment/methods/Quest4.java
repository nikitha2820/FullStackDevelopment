package com.gentech.assignment.methods;
class Transpose
{
    void Transpose(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }

    }
}
public class Quest4 {
    public static void main(String[] args) {
        int e[][]={{1,2},{3,4}};
        Transpose t1=new Transpose();
        t1.Transpose(e);
    }
}
