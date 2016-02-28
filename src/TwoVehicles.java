class Vehicles {
    int passengers;
    int fuelcap;
    int mpg;
    int range(){
        // System.out.println("Range is " + fuelcap * mpg);
        return fuelcap * mpg;
    }
}

class AddMeth {
    public static void main(String[] args) {
        Vehicles minivan = new Vehicles();
        Vehicles sportscar = new Vehicles();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Minivan can carry " +
                minivan.passengers + " with ragne of " +
                minivan.range() +
                " Miles");
        System.out.println("Sportscar can carry " +
                sportscar.passengers + " with range of " +
                sportscar.range() + " Miles");
        sportscar.range();
    }
}
