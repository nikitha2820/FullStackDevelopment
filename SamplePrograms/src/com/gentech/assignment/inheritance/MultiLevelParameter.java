package com.gentech.assignment.inheritance;
class Shop
{
	String shopname;
	Shop(String shop)
	{
		this.shopname=shop;
	}
	void display()
	{
		System.out.println("Shope name:"+ shopname);
	}
}
class Customer extends  Shop{
	String cname;
	Customer(String Cusname,String ShopName)
	{
		super(ShopName);
		this.cname= Cusname;
	}
	void displayCust()
	{
		super.display();
		System.out.println("Customer name:"+cname);
	}
}
class Items extends Customer
{
	Items(String Cusname,String ShopName,String[] items)
	{
		super(Cusname,ShopName);
		super.displayCust();
		for(String i: items)
		{
			System.out.println("Items: "+i);
		}
	}
}
public class MultiLevelParameter {
	public static void main(String[] args) {
		Items i = new Items("Sunila","ZARA",new String[]{"Pant","Shirt","Socks"});

	}

}

