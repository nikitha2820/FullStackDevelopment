package com.gentech.assignment.Abstract;
abstract class Subjects
{

	static
	{
		System.out.println("Static block executed");
	}
}
class Library extends Subjects
{

}

public class AbstractAloneStaticBlock {
	public static void main(String[] args)
	{
		Library o=new Library();
	}
}

