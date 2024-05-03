package task;
//Factory class to create Car objects
class CarFactory {
	//Static method to create Car objects based on country and price
    public static Car createCar(String country, double price) {
        Region region = getRegion(country);//Get region based on country
        
        return new CarImpl(region, price);//create and return CarImpl object
    }

     // Method to get region based on country
    private static Region getRegion(String country) {
    	//Determine region based on country
        if (country.equals("India")) {
            return Region.R3;
        } else if (country.equals("Germany")) {
            return Region.R2;
        } else if (country.equals("USA")) {
            return Region.R1;
        } else if (country.equals("South Africa")) {
            return Region.R4;
        } else {
            throw new IllegalArgumentException("Invalid country");
        }
    }
}