package FirstLayer;

import FirstLayer.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Carl", "Johnson");
        Owner owner2 = new Owner("Amy", "Boe");
        Owner owner3 = new Owner("John", "Wilks");
        Owner owner4 = new Owner("Don", "Trump");
        Owner owner5 = new Owner("Abe", "Lincoln");
        Owner owner6 = new Owner("Sly", "Stallone");
        Owner owner7 = new Owner("Luke", "Sander");
        Owner owner8 = new Owner("Molly", "Ringwall");

        List<Owner> car1Owners = new ArrayList<>();
        car1Owners.add(owner2);
        car1Owners.add(owner4);
        car1Owners.add(owner5);

        List<Owner> car2Owners = new ArrayList<>();
        car2Owners.add(owner3);

        List<Owner> car3Owners = new ArrayList<>();
        car3Owners.add(owner8);

        List<Owner> truck1Owners = new ArrayList<>();
        truck1Owners.add(owner6);
        truck1Owners.add(owner7);
        truck1Owners.add(owner1);


        Truck truck1 = new Truck("Ford", "Bronco", 50000);
        Car car1 = new Car("Mercedes","C Class", 100000);
        Car car2 = new Car("Honda", "Accord", 30000);
        Car car3 = new Car("Mazda", "Miata", 20000);

        car1.setOwners(car1Owners);
        car2.setOwners(car2Owners);
        car3.setOwners(car3Owners);
        truck1.setOwners(truck1Owners);
/*
        car1.honk();
        truck1.honk();


        for (FirstLayer.Owner owner: car1.getOwners()) {
            System.out.println(owner.getLastName());
            System.out.println(owner.getFirstName());
            System.out.println("\n");
        };
 */   }
}
