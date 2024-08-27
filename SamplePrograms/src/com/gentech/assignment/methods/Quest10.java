package com.gentech.assignment.methods;
//display cube of each element for 1 d array
class Cube
{
    void Cube(int c[])
    {
        int cube=1;
        for(int i=0;i<c.length;i++)
        {
            cube=c[i]*c[i]*c[i];
            System.out.print(cube+" ");
        }

    }
}
public class Quest10 {
    public static void main(String[] args) {
        Cube c1=new Cube();
        int c[]={1,2,3,4,5};
        c1.Cube(c);

    }
}
