package com.gentech.assignment.polymorphism;
abstract class Driving{
    abstract void driving();

}
class Car extends Driving{
    void driving()
    {
        System.out.println("Driving Car");
    }
}

class Truck extends Driving{
    void driving()
    {
        System.out.println("Driving Truck");
    }
}

class Bus extends Driving{
    void driving()
    {
        System.out.println("Driving Bus");
    }
}
public class Example4 {
    public static void main(String[] args) {
        Driving drive=null;
        Car car = new Car();
        Bus bus = new Bus();
        Truck truck = new Truck();

        drive=car;
        drive.driving();

        drive=truck;
        drive.driving();

        drive=bus;
        drive.driving();

    }
}

