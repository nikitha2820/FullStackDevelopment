package com.gentech.assignment.noargs;
//product sales order inventory
class Products
{
    String productName;
    int price;
    Products()
    {
        productName = "Iphone 15 pro";
        price= 100000;
        System.out.println("productName:" +productName );
        System.out.println("price :" +price);
        System.out.println("-------------------------");
    }
}

class Sales
{
    String salesName;
    int salesquantity;
    Sales()
    {
        salesName = "SMART PHONES";
        salesquantity =100;
        System.out.println("Sales Name :" +salesName);
        System.out.println("Sales Quantity:" +salesquantity);
        System.out.println("-------------------------");
    }
}

class Orders{
    String orderName;
    int orderID;
    Orders()
    {
        orderName = "Phone purchase";
        orderID = 78900;
        System.out.println("Order Name :" +orderName);
        System.out.println("Order ID:" +orderID);
        System.out.println("-------------------------");
    }
}
class Inventory{
    String inventoryName;
    int inventoryID;
    Inventory()
    {
        inventoryName = "Tech Items";
        inventoryID = 5010;
        System.out.println("Inventory Name :" +inventoryName);
        System.out.println("Inventory ID:" +inventoryID);
    }
}
public class Product
{

    public static void main(String[] args) {
        Products  iphone= new Products();
        Sales sale = new Sales();
        Orders ord= new Orders();
        Inventory inv= new Inventory();
    }
}




