package com.gentech.assignment.parameterisedconstructors;
class Products
{
    String productName;
    int price;
    Products(String pn,int Price)
    {
        productName = pn;
        price= Price;
        System.out.println("productName:" +productName );
        System.out.println("price :" +price);
        System.out.println("-------------------------");
    }
}

class Sales
{
    String salesName;
    int salesquantity;
    Sales(String sn, int qty)
    {
        salesName =sn;
        salesquantity =qty;
        System.out.println("Sales Name :" +salesName);
        System.out.println("Sales Quantity:" +salesquantity);
        System.out.println("-------------------------");
    }
}

class Orders
{
    String orderName;
    int orderID;
    Orders(String on, int oID)
    {
        orderName = on;
        orderID = oID;
        System.out.println("Order Name :" +orderName);
        System.out.println("Order ID:" +orderID);
        System.out.println("-------------------------");
    }
}
class Inventory{
    String inventoryName;
    int inventoryID;
    Inventory(String in,int iID)
    {
        inventoryName = in;
        inventoryID = iID;
        System.out.println("Inventory Name :" +inventoryName);
        System.out.println("Inventory ID:" +inventoryID);
        System.out.println("-------------------------");
    }
}
public class Product
{

    public static void main(String[] args) {
        Products iphone1= new Products("Iphone 15 pro",100000);
        Products samsung= new Products("Samsung galaxy",70000);

        Sales sale1= new Sales("SMART PHONES",50);
        Sales sale2 = new Sales("Air pods",20);

        Orders ord1= new Orders("Phone purchase",7809);
        Orders ord2= new Orders("airpod purchase",4787);

        Inventory inv1= new Inventory("Tech Items",670999);
        Inventory inv2= new Inventory("Tech Items",890976);
    }
}





