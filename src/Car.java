public class Car extends Vehicle {
    //Initializing new variable
    private String brand;

    //New constructors
    public Car() { }

    public Car(int inNum, String inCol, float inEn, String inFuel, String inBrand) {
        this.numberOfWheels = inNum;
        this.color = inCol;
        this.engineSize = inEn;
        this.fuelType = inFuel;
        this.brand = inBrand;
    }

    //New setter and getter
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String inBrand) {
        this.brand = inBrand;
    }

    //new methods
    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("Number of Wheels: " + this.numberOfWheels + "/nColor: " + this.color + "/nEngine Size: " + this.engineSize + "/nFuelType: " + "/nBrand: " + this.brand);
    }
}
