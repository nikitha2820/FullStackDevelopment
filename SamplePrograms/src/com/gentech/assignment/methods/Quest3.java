package com.gentech.assignment.methods;
class Reverse
{
    void Reverse()
    {
        boolean g[]={true,false,false,true,true};
        for(int i=g.length-1;i>=0;i--)
        {
            System.out.println(g[i]);
        }
    }
}
public class Quest3 {
    public static void main(String[] args) {

        Reverse r1=new Reverse();
        r1.Reverse();
    }
}
