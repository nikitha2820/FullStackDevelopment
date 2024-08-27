package com.gentech.programs;
//employee dept insurance
class TwoWheelers{
    String VehicleName;
    int noofwheels;

}

class FourWheelers
{
    String VehicleName;
    int noofwheels;

}

class HeavyVehicles
{
    String VehicleName;
    int noofwheels;

}
public class Vehicles
{

    public static void main(String[] args)
    {
        TwoWheelers bike = new TwoWheelers();
        bike.VehicleName = "Royal Enfield";
        bike.noofwheels = 2;
        System.out.println("Vehicle Name:" + bike.VehicleName);
        System.out.println("no of wheels:" + bike.noofwheels);
        System.out.println("-------------------------");
        FourWheelers car = new FourWheelers();
        car.VehicleName = "Lamborgini Gallado";
        car.noofwheels = 4;
        System.out.println("Vehicle Name :" + car.VehicleName);
        System.out.println("No of Wheels:" + car.noofwheels);
        System.out.println("-------------------------");

        HeavyVehicles truck = new HeavyVehicles();
        truck.VehicleName = "TATA";
        truck.noofwheels = 6;
        System.out.println("Vehicle Name :" + truck.VehicleName);
        System.out.println("No of Wheels:" + truck.noofwheels);
        System.out.println("-------------------------");
    }
}

