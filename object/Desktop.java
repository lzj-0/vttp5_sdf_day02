package object;

public class Desktop extends Computer {
    private String operating_system;
    private Integer weight;
    private Boolean watering_cooling;

    public Desktop() {}

    public Desktop(String cpu, String model, int ram, int year) {
        super(cpu, model, ram, year);
    }

    public Desktop(String cpu, String model, int ram, int year, String operating_system, Integer weight,
            Boolean watering_cooling) {
        super(cpu, model, ram, year);
        this.operating_system = operating_system;
        this.weight = weight;
        this.watering_cooling = watering_cooling;
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

    public Boolean get_watering_cooling() {
        return this.watering_cooling;
    }

    public void set_watering_cooling(Boolean watering_cooling) {
        this.watering_cooling = watering_cooling;
    }

    @Override
    public void display_spec() {
        System.out.println("This desktop specifications:");
        System.out.println(this.get_model());
        System.out.println(this.get_cpu());
        System.out.println(this.get_ram());
        System.out.println(this.get_year());
        System.out.println(this.get_operating_system());
        System.out.println(this.get_weight());
        System.out.println("Water cooling System:" + this.get_watering_cooling());
    }


}
