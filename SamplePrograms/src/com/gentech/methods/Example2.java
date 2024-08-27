package com.gentech.methods;
class Div6
{
    void Div6()
    {
            int count=1;
            for(int i=50;i<=150;i++)
            {
                if(i%6==0)
                {
                    count++;
                 }
            }
        System.out.println("count:"+count);
    }
}


public class Example2 {
    public static void main(String[] args) {
        Div6 o=new Div6();
        o.Div6();
    }
}
