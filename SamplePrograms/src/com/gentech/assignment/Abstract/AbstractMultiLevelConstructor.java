package com.gentech.assignment.Abstract;

abstract class Hotel
{
	String type;
	String address;
	abstract void details();
	Hotel(String address)
	{
		this.address = address;
		System.out.println(" Attiguppe near to "+ address);
	}
	Hotel(String address,String type)
	{
		this.address = address;
		this.type=type;
		System.out.println("Type: "+ type+"  Attiguppe near to "+ address );
	}

}
class Food extends Hotel
{
	void details()
	{
		System.out.println("Hotel details : ");
		System.out.println("Hotel name: Brahamin");
		System.out.println("Type veg");
	}
	Food(String address)
	{
		super(address);
	}
	Food(String address,String type)
	{
		super(address,type);
	}

}
class Items extends Food
{
	Items(String address,String type)
	{
		super(address,type);
		super.details();
	}
	Items(String address)
	{
		super(address);
		super.details();
	}

}
public class AbstractMultiLevelConstructor {
	public static void main(String[] args) {
		Items i = new Items("Gulbarga"," veg");

	}

}


