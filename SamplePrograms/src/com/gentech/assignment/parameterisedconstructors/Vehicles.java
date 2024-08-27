package com.gentech.assignment.parameterisedconstructors;
class TwoWheelers{
    String VehicleName;
    int noofwheels;
    TwoWheelers(String vn, int nw)
    {
        VehicleName = vn;
        noofwheels = nw;
        System.out.println("Vehicle Name:" + VehicleName);
        System.out.println("no of wheels:" + noofwheels);
        System.out.println("-------------------------");
    }
}
class FourWheelers
{
    String VehicleName;
    int noofwheels;
    FourWheelers(String vn, int nw)
    {
        VehicleName = vn;
        noofwheels = nw;
        System.out.println("Vehicle Name :" + VehicleName);
        System.out.println("No of Wheels:" + noofwheels);
        System.out.println("-------------------------");
    }
}
class HeavyVehicles
{
    String VehicleName;
    int noofwheels;
    HeavyVehicles(String vn, int nw)
    {
        VehicleName =vn;
        noofwheels = nw;
        System.out.println("Vehicle Name :" + VehicleName);
        System.out.println("No of Wheels:" +noofwheels);
        System.out.println("-------------------------");
    }
}
public class Vehicles
{
    public static void main(String[] args)
    {
        TwoWheelers bike1 = new TwoWheelers("Royal Enfield",2);
        TwoWheelers bike2 = new TwoWheelers("Royal Enfield",2);

        FourWheelers car1 = new FourWheelers("Ritz",4);
        FourWheelers car2 = new FourWheelers("Swift",4);

        HeavyVehicles truck = new HeavyVehicles("TATA",6);
        HeavyVehicles plane = new HeavyVehicles("Air Indigo",3);
    }
}

