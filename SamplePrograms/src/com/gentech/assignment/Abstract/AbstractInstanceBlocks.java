package com.gentech.assignment.Abstract;
abstract class AbstractClass5 {
	// Instance block
	{
		System.out.println("Instance block in AbstractClass executed");
	}
}

class Common1 extends AbstractClass5 {
	// Constructor
	Common1()
	{
		System.out.println("Constructor in  executed");
	}
}

public class AbstractInstanceBlocks {
	public static void main(String[] args) {
		Common obj = new Common();
	}
}
