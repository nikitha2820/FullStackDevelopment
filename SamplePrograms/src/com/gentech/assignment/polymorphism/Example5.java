package com.gentech.assignment.polymorphism;
abstract class Dancing{
    abstract void dancing();
}
class Bhartanatyam extends Dancing
{
    void dancing()
    {
        System.out.println("bharthanatyam");
    }
}

class HipHop extends Dancing
{
    void dancing()
    {
        System.out.println("HipHop");
    }
}

class Yakshagana extends Dancing
{
    void dancing()
    {
        System.out.println("Yakshagana");
    }
}
public class Example5 {
    public static void main(String[] args) {
        Dancing dance=null;
        Bhartanatyam bhartanatyam=new Bhartanatyam();
        HipHop hipHop=new HipHop();
        Yakshagana yakshagana=new Yakshagana();

        dance=bhartanatyam;
        dance.dancing();

        dance=hipHop;
        dance.dancing();

        dance=yakshagana;
        dance.dancing();
    }
}
