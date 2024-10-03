package object;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.set_cpu("50Hz 8 core");
        com.set_model("Asus 8000");
        com.set_ram(32);
        com.set_year(2024);

        com.start();
        com.display_spec();
        com.shutdown();

        Computer com2 = new Computer();
        com2.start();
        com2.display_spec();
        com2.shutdown();

        Laptop lt = new Laptop();
        lt.set_cpu("10GHz 128 core");
        lt.set_model("Asus 12000");
        lt.set_ram(64);
        lt.set_year(2024);
        lt.set_battery("11.1V 3S LIPO");
        lt.set_weight(3);
        lt.set_operating_system("Windows 11 Professional");
        lt.set_screen_size("15.4 inch OLED");
        lt.start();
        lt.display_spec();
        lt.shutdown();

        Desktop desktop01 = new Desktop("4GHz 8 core", "Alibaba", 16, 2024, "Ubuntu 20.4 LTS", 5, true);
        desktop01.start();
        desktop01.display_spec();
        desktop01.shutdown();

        ArrayList<Computer> machines = new ArrayList<>();
        machines.add(desktop01);
        machines.add(com);
        machines.add(com2);
        machines.add(lt);

        for(int i = 0; i < machines.size(); i++) {
            System.out.println("Machine " + i + " : ");
            machines.get(i).display_spec();
        }
    }
}
