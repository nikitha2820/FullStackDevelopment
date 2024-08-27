package com.gentech.assignment.overloading;
class Products
{
    Products(String productName)
    {
        System.out.println("Software Product Name:"+productName);
    }
    Products(int productID)
    {
        System.out.println("Software Product ID:"+productID);
    }
    Products(double price)
    {
        System.out.println("price:"+price);
    }
}
public class SoftwareProduct {
    public static void main(String[] args) {
        Products p1=new Products("Anti Virus");
        Products p2=new Products(100);
        Products p3=new Products(799.99);
    }
}
