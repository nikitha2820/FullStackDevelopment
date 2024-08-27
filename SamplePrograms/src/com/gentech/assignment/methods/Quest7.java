package com.gentech.assignment.methods;
//find no of digit
class findDigit
{
    void findDigit(int dig)
    {
       if(dig>=0&&dig<=9)
       {
           System.out.println(dig+" is a single digit");
       }
       else if(dig>=10&&dig<=99)
       {
           System.out.println(dig+" is a two digit");
       }
       else if(dig>=100&&dig<=999)
       {
           System.out.println(dig+" is a three digit");
       }
       else {
           System.out.println(dig+"is greater than four digits");
       }
    }
}
public class Quest7 {
    public static void main(String[] args) {
        findDigit fd=new findDigit();
        fd.findDigit(10);
        fd.findDigit(200);
        fd.findDigit(3);
        fd.findDigit(20000);
    }
}
