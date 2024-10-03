package vehicle;

public class Car extends Vehicle {
    private String car_type;
    private Integer no_of_passenger;


    public Car(String model, String make, Integer year, String car_type, Integer no_of_passenger) {
        super(model, make, year);
        this.car_type = car_type;
        this.no_of_passenger = no_of_passenger;
    }


    public String get_car_type() {
        return this.car_type;
    }


    public void set_car_type(String car_type) {
        this.car_type = car_type;
    }


    public Integer get_no_of_passenger() {
        return this.no_of_passenger;
    }


    public void set_no_of_passenger(Integer no_of_passenger) {
        this.no_of_passenger = no_of_passenger;
    }

    @Override
    public void start() {
        System.out.println("Car started...");
    }

    @Override
    public void stop() {
        this.set_speed(0);
        System.out.println("Car stopped...");
    }

    @Override
    public void accelerate(Integer increment) {
        this.set_speed(this.get_speed() + increment + 10);
    }

    // @Override
    // public void brake(Integer decrement) {
    //     this.set_speed(this.get_speed() - decrement);
    // }

    @Override
    public void honk() {
        System.out.println("Beep...Beep...");
    }
    
}
