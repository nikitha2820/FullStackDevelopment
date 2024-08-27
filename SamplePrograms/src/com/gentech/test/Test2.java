package com.gentech.test;
class Laptop
{
    static String getLaptop(String l)
    {
        return l;
    }

}
public class Test2 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        String val=l.getLaptop("ASUS");
        System.out.println(val);
    }
}
