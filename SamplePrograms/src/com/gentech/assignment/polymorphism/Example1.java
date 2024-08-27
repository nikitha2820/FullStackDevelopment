package com.gentech.assignment.polymorphism;
abstract class Animal
{
  abstract void animalSound();
}

class Dog extends Animal
{
    void animalSound()
    {
        System.out.println("The dog says: bow bow");
    }
}

class Cat extends Animal
{
    void animalSound()
    {
        System.out.println("The cat says: meow meow");
    }
}

class Cow extends Animal
{
    void animalSound()
    {
        System.out.println("The cow says: moo moo");
    }
}

public class Example1
{
    public static void main(String[] args)
    {
        Animal sound=null;
        Dog dog=new Dog();
        Cat cat=new Cat();
        Cow cow=new Cow();
        sound=dog;
        sound.animalSound();

        sound=cat;
        sound.animalSound();

        sound=cow;
        sound.animalSound();

    }
}
