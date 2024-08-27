package com.gentech.assignment.methods;
//display table of given no
class Tab
{
    void Tab(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
public class Quest9 {
    public static void main(String[] args) {
        Tab t1=new Tab();
        t1.Tab(1);
        t1.Tab(15);

    }
}
