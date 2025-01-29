//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creating objects
        Vehicle truck1 = new Vehicle(18, "Blue", 600, "Diesel");
        Car car1 = new Car(4, "Red", 150, "Gasoline", "Toyota");

        //testing getters for the Vehicle class
        System.out.println(truck1.getNumberOfWheels());
        System.out.println(truck1.getColor());
        System.out.println(truck1.getEngineSize());
        System.out.println(truck1.getFuelType());

        //testing getters for the Car class
        System.out.println(car1.getNumberOfWheels());
        System.out.println(car1.getColor());
        System.out.println(car1.getEngineSize());
        System.out.println(car1.getFuelType());
        System.out.println(car1.getBrand());

        //testing setters for the Truck class
        truck1.setNumberOfWheels(12);
        truck1.setColor("Yellow");
        truck1.setEngineSize(550);
        truck1.setFuelType("Gasoline");

        //testing setters for the Car class
        car1.setNumberOfWheels(6);
        car1.setColor("Black");
        car1.setEngineSize(200);
        car1.setFuelType("Diesel");
        car1.setBrand("Honda");

        //making sure the changes worked
        System.out.println(truck1.getNumberOfWheels());
        System.out.println(truck1.getColor());
        System.out.println(truck1.getEngineSize());
        System.out.println(truck1.getFuelType());

        //testing methods for the Car class
        car1.honk();
        car1.displayInfo();
    }
}