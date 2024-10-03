package object;

public class Laptop extends Computer {
    private String operating_system;
    private Integer weight;
    private String battery;
    private String screen_size;

    public Laptop() {}

    public Laptop(String cpu, String model, int ram, int year) {
        super(cpu, model, ram, year);
    }

    public Laptop(String cpu, String model, Integer ram, Integer year, String operating_system, Integer weight,
            String battery, String screen_size) {
        super(cpu, model, ram, year);
        this.operating_system = operating_system;
        this.weight = weight;
        this.battery = battery;
        this.screen_size = screen_size;
    }

    public String get_operating_system() {
        return this.operating_system;
    }

    public void set_operating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public Integer get_weight() {
        return this.weight;
    }

    public void set_weight(Integer weight) {
        this.weight = weight;
    }

    public String get_battery() {
        return this.battery;
    }

    public void set_battery(String battery) {
        this.battery = battery;
    }

    public String get_screen_size() {
        return this.screen_size;
    }

    public void set_screen_size(String screen_size) {
        this.screen_size = screen_size;
    }

    // Override not needed for implemeneting interfaces
    @Override
    public void start() {
        if (this.start) {
            System.out.println("Laptop has started");
        } else {
            System.out.println("Laptop powered up...");
            this.start = true;
        }
    }

    @Override
    public void shutdown() {
        if (!this.start) {
            System.out.println("Laptop has shut down");
        } else {
            System.out.println("Shutting down laptop...");
            this.start = false;
        }
    }

    @Override
    public void display_spec() {
        System.out.println("This laptop specifications: ");
        System.out.printf("CPU: %s\n", this.get_cpu());
        System.out.printf("Model: %s\n", this.get_model());
        System.out.printf("RAM: %d\n", this.get_ram());
        System.out.printf("Year: %d\n", this.get_year());
        System.out.printf("OS: %s\n", this.get_operating_system());
        System.out.printf("Battery: %s\n", this.get_battery());
        System.out.printf("Screen size: %s\n", this.get_screen_size());
        System.out.printf("Weight: %d\n", this.get_weight());
    }

}
