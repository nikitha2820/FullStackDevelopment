package com.gentech.assignment.methods;
//display 2nd half
class Arrays
{
   void Arrays(String a[])
   {
       for(int i=a.length/2;i<a.length;i++)
       {
           System.out.println(a[i]);
       }

   }

}
public class String1D {
    public static void main(String[] args) {

        String e[]={"hi","cat","mat","bat"};
        Arrays a1=new Arrays();
        a1.Arrays(e);
}
}

