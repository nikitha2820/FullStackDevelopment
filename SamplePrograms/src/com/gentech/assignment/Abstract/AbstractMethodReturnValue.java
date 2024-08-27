package com.gentech.assignment.Abstract;
abstract class AbstractClass4 {
	abstract int getValue();
}

class Comman extends AbstractClass4 {

	int getValue() 
	{
		return 42;
	}
}
public class AbstractMethodReturnValue {
	public static void main(String[] args) {
		Comman obj = new Comman();

		int value = obj.getValue();
		System.out.println("The value returned by getValue() is: " + value);

	}

}


