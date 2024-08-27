package com.gentech.assignment.Abstract;

abstract class AbstractClass6
{
	static void staticMethod1() 
	{
		System.out.println("This is Static Method 1 ");
	}

	static void staticMethod2() 
	{
		System.out.println("This is Static Method 2 ");
	}

	static void staticMethod3() 
	{
		System.out.println("This is Static Method 3 ");
	}
}
public class AbstractMultipleStaticMethod2
{
	public static void main(String[] args) 
	{
		AbstractClass6.staticMethod1();
		AbstractClass6.staticMethod2();
		AbstractClass6.staticMethod3();
	}

}

