package com.gentech.assignment.overloading;
class Invoices
{
    Invoices(int invoiceID)
    {
        System.out.println("Invoice ID:"+invoiceID);
    }
    Invoices(String invoiceDetails)
    {
        System.out.println("Invoice Details:"+invoiceDetails);
    }
    Invoices(double payment)
    {
        System.out.println("Payment:"+payment);
    }
}
public class Invoice {
    public static void main(String[] args) {
        Invoices inv1=new Invoices(100);
        Invoices inv2=new Invoices("ASUS Zyphrus Laptop,Ryzen,5 DD4,8GB RAM");
        Invoices inv3=new Invoices(100000.50);

    }
}
