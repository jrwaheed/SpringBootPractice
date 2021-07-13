package FirstLayer;

import FirstLayer.Car;

public class Truck extends Car implements Vehicles {
    public Truck(String brand, String model, int price) {
        super(brand, model, price);
    }

    @Override
    public void honk() {
        System.out.println("BEEP BEEEEEP!!!!!");
    }

    @Override
    public void driving() {

    }
}
