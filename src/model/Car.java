package model;

public class Car {

    private String brand;
    private String color;

    public Car() {
        this.brand = "BMW";
        this.color = "black";
    }
    
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public String toString(){
        System.out.println("New car!!");
        return "This car is made by: " + this.brand + " and is: " + this.color + "\n" + "-------------------";

        
    }

}
