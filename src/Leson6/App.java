package Leson6;

public class App {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        minivan.passengers=7;
        minivan.fuelCap = 16;
        minivan.milesPerGallon = 21;

        int range;

        range = minivan.fuelCap*minivan.milesPerGallon;
        System.out.println("Minivan can take"+minivan.passengers+"passengers at distance of" + range);

        Vehicle sportscar = new Vehicle();
        sportscar.passengers = 2;
        sportscar.fuelCap = 14;
        sportscar.milesPerGallon = 12;

        System.out.println("Sportscar can take"+sportscar.passengers+"passengers at distance of" + range);
    }



}
