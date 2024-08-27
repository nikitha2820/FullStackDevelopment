package com.gentech.assignment.noargs;
//employee dept insurance
class TwoWheelers{
    String VehicleName;
    int noofwheels;
    TwoWheelers()
    {
        VehicleName = "Royal Enfield";
        noofwheels = 2;
        System.out.println("Vehicle Name:" + VehicleName);
        System.out.println("no of wheels:" + noofwheels);
        System.out.println("-------------------------");
    }
}
class FourWheelers
{
    String VehicleName;
    int noofwheels;
    FourWheelers()
    {
        VehicleName = "Lamborgini Gallado";
        noofwheels = 4;
        System.out.println("Vehicle Name :" + VehicleName);
        System.out.println("No of Wheels:" + noofwheels);
        System.out.println("-------------------------");
    }
}
class HeavyVehicles
{
    String VehicleName;
    int noofwheels;
    HeavyVehicles()
    {
        VehicleName = "TATA";
        noofwheels = 6;
        System.out.println("Vehicle Name :" + VehicleName);
        System.out.println("No of Wheels:" +noofwheels);
        System.out.println("-------------------------");
    }
}
public class Vehicles
{
    public static void main(String[] args)
    {
        TwoWheelers bike = new TwoWheelers();
        FourWheelers car = new FourWheelers();
        HeavyVehicles truck = new HeavyVehicles();
    }
}

