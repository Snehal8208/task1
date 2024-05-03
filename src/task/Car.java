package task;
//Abstract class representing a Car
abstract class Car {
    protected double price;//Price of the car
    protected Region region;//Region where the car is sold
    
    
//Constructor to initialize region and price
    public Car(Region region, double price) {
        this.region = region;
        this.price = price;
    }

    //Abstract method to calculate tax,implementation differs based on the subclass
    public abstract double calculateTax();
}
