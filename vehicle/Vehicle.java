package vehicle;

public class Vehicle implements IVehicle {
    private String model;
    private String make;
    private Integer year;
    private Integer speed = 0;

    public Vehicle(String model, String make, Integer year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String get_model() {
        return this.model;
    }

    public void set_model(String model) {
        this.model = model;
    }

    public String get_make() {
        return this.make;
    }

    public void set_make(String make) {
        this.make = make;
    }

    public Integer get_year() {
        return this.year;
    }

    public void set_year(Integer year) {
        this.year = year;
    }

    public Integer get_speed() {
        return this.speed;
    }

    public void set_speed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public void start() {
        System.out.println("Vehicle started...");
    }

    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("Vehicle stopped...");
    }

    @Override
    public void accelerate(Integer increment) {
        this.speed += increment;
    }

    @Override
    public void brake(Integer decrement) {
        this.speed -= decrement;
    }

    @Override
    public void honk() {
        System.out.println("Vehicle honked...");
    }

    

    
}
