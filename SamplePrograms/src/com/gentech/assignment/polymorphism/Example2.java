package com.gentech.assignment.polymorphism;
abstract class Shapes
{
    abstract void drawshapes();
}

class Circle extends Shapes
{
    void drawshapes()
    {
        System.out.println("Draw Circle");
    }
}

class Square extends Shapes
{
    void drawshapes()
    {
        System.out.println("Draw Square");
    }
}

class Triangle extends Shapes
{
    void drawshapes()
    {
        System.out.println("Draw Triangle");
    }
}

class Rectangle extends Shapes
{
    void drawshapes()
    {
        System.out.println("Draw Rectangle");
    }
}

public class Example2
{
    public static void main(String[] args)
    {
        Shapes draw=null;
        Circle circle=new Circle();
        Square square=new Square();
        Triangle triangle=new Triangle();
        Rectangle rectangle=new Rectangle();
        draw=circle;
        draw.drawshapes();

        draw=square;
        square.drawshapes();

        draw=triangle;
        draw.drawshapes();

        draw=rectangle;
        draw.drawshapes();

    }
}

