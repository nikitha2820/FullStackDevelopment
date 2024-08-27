package com.gentech.assignment.methods;
class Evens
{
    void Evens()
    {
       for(int i=0;i<10;i++)
       {
           if(i%2==0)
           {
               System.out.println(i);
           }
       }
    }
}
public class Even {
    public static void main(String[] args) {
        Evens e=new Evens();
        e.Evens();

    }
}
