package vehicle;

public class Truck extends Vehicle {
    private double cargo_capacity;

    public Truck(String model, String make, Integer year, double cargo_capacity) {
        super(model, make, year);
        this.cargo_capacity = cargo_capacity;
    }

    public double get_cargo_capacity() {
        return this.cargo_capacity;
    }

    public void set_cargo_capacity(double cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    @Override
    public void start() {
        System.out.println("Truck started...");
    }

    @Override
    public void stop() {
        this.set_speed(0);
        System.out.println("Truck stopped...");
    }

    @Override
    public void accelerate(Integer increment) {
        this.set_speed(this.get_speed() + increment + 2);
    }

    // @Override
    // public void brake(Integer decrement) {
    //     this.set_speed(this.get_speed() - decrement);
    // }

    @Override
    public void honk() {
        System.out.println("Honk...Honk...");
    }
    
}
