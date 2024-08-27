package com.gentech.assignment.parameterisedconstructors;

import java.util.SplittableRandom;

class Country{
    String countryName;
    String capital;
    int area;
    Country(String cn, String cap, int Area)
    {
        countryName = cn;
        capital= cap;
        area=Area;
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
    State(String sn, int sa)
    {
        stateName = sn;
        stateArea = sa;
        System.out.println("State Name :" +stateName);
        System.out.println("Area of State:" +stateArea);
        System.out.println("-------------------------");
    }
}
class District
{
    String districtName;
    int districtArea;
    District(String dn,int da)
    {
        districtName = dn;
        districtArea = da;
        System.out.println("District Name :" + districtName);
        System.out.println("Area of District:" +districtArea);
        System.out.println("-------------------------");
    }
}
class Village
{
    String villageName;
    int villageArea;
    Village(String vn,int va)
    {
        villageName = vn;
        villageArea = va;
        System.out.println("Village Name :" +villageName);
        System.out.println("Area of Village:" +villageArea);
        System.out.println("-------------------------");
    }
}
public class Locations
{

    public static void main(String[] args)
    {
        Country con1 = new Country("India","New Delhi",10000);
        Country con2 = new Country("Japan","Tokyo",25670);

        State sta1 = new State("Karnataka",2090);
        State sta2 = new State("Tamil Nadu",2080);

        District dis1= new District("Bengaluru",109);
        District dis2= new District("Mysore",100);

        Village vil1= new Village("RPC Layout",22);
        Village vil2= new Village("RR Nagar",11);
    }
}


