package com.gentech.assignment.methods;
//all table from 1-20
class Tables
{
    void Tables()
    {
        for(int num=1;num<=20;num++)
        {
            for (int i=1; i<=10; i++)
            {
                System.out.println(num + "*" + i + "="+num * i);
            }
        }
    }
}
public class Quest6 {
    public static void main(String[] args) {
        Tables t=new Tables();
        t.Tables();

    }
}
