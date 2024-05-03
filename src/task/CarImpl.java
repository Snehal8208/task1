package task;
//Implementation of Car class
class CarImpl extends Car {
	//Constructor invoking superclass constructor
    public CarImpl(Region region, double price) {
        super(region, price);
    }
  //Implementation of calculateTax method based on region tax rate
    @Override
    public double calculateTax() {
        return price * region.getTaxRate();
    }
}