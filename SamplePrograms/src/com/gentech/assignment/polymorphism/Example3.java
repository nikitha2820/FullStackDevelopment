package com.gentech.assignment.polymorphism;
abstract class Cooks{
    abstract void cooking();
}
class Soup extends Cooks{
    void cooking()
    {
        System.out.println("Cooking Soup");
    }
}

class Biryani extends Cooks{
    void cooking()
    {
        System.out.println("Cooking Biryani");
    }
}

class Rice extends Cooks{
    void cooking()
    {
        System.out.println("Cooking Rice");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Cooks cook=null;
        Soup soup=new Soup();
        Rice rice=new Rice();
        Biryani biryani=new Biryani();

        cook=soup;
        cook.cooking();

        cook=biryani;
        cook.cooking();
        cook=rice;
        cook.cooking();
    }
}
