package com.gentech.methods;
class Concat
{
    void Concat()
    {
        char a[][]={{'a','b'},{'c','d'}};
        char con=' ';

            for(int j=0;j<a.length;j++) {

                System.out.println();
                con = con;
                System.out.println(con);
            }

    }
}
public class Example4 {
    public static void main(String[] args) {
        Concat o=new Concat();
        o.Concat();

    }
}
