package FirstLayer;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Car implements Vehicles {
    private String brand;
    private String model;
    private int price;
    private List<Owner> owners;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.owners = owners;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public void honk(){
        System.out.println("beep beep");;
    }

    @Override
    public void driving() {

    }
}
