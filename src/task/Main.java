package task;
//Main Class to demonstrate car creation and tax calculation
public class Main {
	   public static void main(String[] args) {
			Car car = CarFactory.createCar("India", 10000);//Create Car object for India with price 10000
	        double tax = car.calculateTax();//Calculate tax for the car
	        System.out.println("Tax: " + tax);//print tax
	    }
	}




