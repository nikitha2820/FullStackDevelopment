package com.gentech.assignment.noargs;
class Country{
    String countryName;
    String capital;
    int area;
    Country()
    {
        countryName = "India";
        capital= "New Delhi";
        area=10000;
        System.out.println("Country Name:" +countryName );
        System.out.println("Country capital:" +capital);
        System.out.println("Area:"+area);
        System.out.println("-------------------------");
    }

}
class State
{
    String stateName;
    int stateArea;
    State()
    {
        stateName = "Karnataka";
        stateArea = 40000;
        System.out.println("State Name :" +stateName);
        System.out.println("Area of State:" +stateArea);
        System.out.println("-------------------------");
    }
}
class District
{
    String districtName;
    int districtArea;
    District()
    {
        districtName = "Bangalore";
        districtArea = 600;
        System.out.println("District Name :" + districtName);
        System.out.println("Area of District:" +districtArea);
        System.out.println("-------------------------");
    }
}
class Village
{
    String villageName;
    int villageArea;
    Village()
    {
        villageName = "RPC lAYOUT";
        villageArea = 50;
        System.out.println("Village Name :" +villageName);
        System.out.println("Area of Village:" +villageArea);
    }
}
public class Locations
{

    public static void main(String[] args)
    {
        Country con = new Country();
        State sta = new State();
        District dis= new District();
        Village vil= new Village();
    }
}


