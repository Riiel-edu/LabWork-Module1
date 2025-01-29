public class Vehicle {
    //creating the variables
    protected int numberOfWheels;
    protected String color;
    protected float engineSize;
    protected String fuelType;

    //Initializing the empty class constructor
    public Vehicle() { }

    //Class constructor with all attributes
    public Vehicle(int inNum, String inCol, float inEn, String inFuel) {
        this.numberOfWheels = inNum;
        this.color = inCol;
        this.engineSize = inEn;
        this.fuelType = inFuel;
    }

    //Getter methods
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public String getColor() {
        return this.color;
    }

    public float getEngineSize() {
        return this.engineSize;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    //Setter methods
    public void setNumberOfWheels(int inNum) {
        this.numberOfWheels = inNum;
    }

    public void setColor(String inCol) {
        this.color = inCol;
    }

    public void setEngineSize(float inEn) {
        this.engineSize = inEn;
    }

    public void setFuelType(String inFuel) {
        this.fuelType = inFuel;
    }
}
