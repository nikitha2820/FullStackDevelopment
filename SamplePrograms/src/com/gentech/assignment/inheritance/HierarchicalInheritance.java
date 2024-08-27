package com.gentech.assignment.inheritance;

class Animal1
{
    void eat()
    {
        System.out.println("This animal eats the food.");
    }
}
class Mammals extends Animal1
{
    void breathe()
    {
        System.out.println("This mammal breathes .");
    }
}
class Cat extends Animal1
{
    void meow()
    {
        System.out.println("this Cat will meows");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {

        Cat oj = new Cat();
        oj.meow();
        oj.eat();
        Mammals o=new Mammals();
        o.breathe();
        o.eat();
    }

}
