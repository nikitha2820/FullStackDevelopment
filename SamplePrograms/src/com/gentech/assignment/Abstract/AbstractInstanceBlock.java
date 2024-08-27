package com.gentech.assignment.	Abstract;
abstract class AbstractClass1 {
	// Instance block
	{
		System.out.println("Instance block in AbstractClass executed");
	}
}

class Common extends AbstractClass1 {
	// Constructor
	Common() 
	{
		System.out.println("Constructor in  executed");
	}
}

public class AbstractInstanceBlock {
	public static void main(String[] args) {
		Common obj = new Common();
	}
}
