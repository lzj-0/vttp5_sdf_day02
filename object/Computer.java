package object;

public class Computer {
    private String cpu;
    private String model;
    private int ram;
    private int year;
    protected boolean start = false;

    public Computer() {
        this.cpu = "2GHz dual core";
        this.model = "Gigabyte 1000";
        this.ram = 8;
        this.year = 2020;
    }

    public Computer(String cpu, String model, int ram, int year) {
        this.cpu = cpu;
        this.model = model;
        this.ram = ram;
        this.year = year;
    }

    public String get_cpu() {
        return this.cpu;
    }

    public void set_cpu(String s) {
        this.cpu = s;
    }

    public String get_model() {
        return this.model;
    }

    public void set_model(String s) {
        this.model = s;
    }

    public int get_ram() {
        return this.ram;
    }

    public void set_ram(int i) {
        this.ram = i;
    }

    public int get_year() {
        return this.year;
    }

    public void set_year(int i) {
        this.year = i;
    }
    

    public void start() {
        if (this.start) {
            System.out.println("Computer has started");
        } else {
            this.start = true;
        }
    }

    public void shutdown() {
        if (!this.start) {
            System.out.println("Computer has shut down");
        } else {
            this.start = false;
        }
    }

    public void display_spec() {
        System.out.println("This computer specifications: ");
        System.out.printf("CPU: %s\n", this.get_cpu());
        System.out.printf("Model: %s\n", this.get_model());
        System.out.printf("RAM: %d\n", this.get_ram());
        System.out.printf("Year: %d\n", this.get_year());
    }

}
