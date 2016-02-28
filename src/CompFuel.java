class CarsVehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String[] args) {
        CarsVehicle minivan = new CarsVehicle();
        CarsVehicle sportscar = new CarsVehicle();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan " +
                "needs " + gallons + " gallons of fuel.");
        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " miles sportscar" +
                " needs " + gallons + " gallons of fuel.");
    }
}
