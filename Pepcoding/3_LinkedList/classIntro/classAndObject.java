package classIntro;
import java.util.*;

public class classAndObject {

    public static class phone {
        String brand;
        String model;
        String color;
        int ram;
        int storage;
        int battery;

        phone(String brand, String model, String color, int ram, int storage, int battery) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.ram = ram;
            this.storage = storage;
            this.battery = battery;
        }

        public String display() {
            StringBuilder sb = new StringBuilder();
            sb.append("Brand :" + this.brand + "\n");
            sb.append("Model :" + this.model + "\n");
            sb.append("Color :" + this.color + "\n");
            sb.append("Ram :" + this.ram + "GB\n");
            sb.append("Storage :" + this.storage + "GB\n");
            sb.append("Battery :" + this.battery + "mAH\n");
            sb.append("\n");
            return sb.toString();

        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Brand :" + this.brand + "\n");
            sb.append("Model :" + this.model + "\n");
            sb.append("Color :" + this.color + "\n");
            sb.append("Ram :" + this.ram + "GB\n");
            sb.append("Storage :" + this.storage + "GB\n");
            sb.append("Battery :" + this.battery + "mAH\n");
            sb.append("\n");
            return sb.toString();
        }
    }

    // public static String display(phone ph) {
    // StringBuilder sb = new StringBuilder();
    // sb.append("Brand :" + ph.brand + "\n");
    // sb.append("Model :" + ph.model + "\n");
    // sb.append("Color :" + ph.color + "\n");
    // sb.append("Ram :" + ph.ram + "GB\n");
    // sb.append("Storage :" + ph.storage + "GB\n");
    // sb.append("Battery :" + ph.battery + "mAH\n");
    // sb.append("\n");
    // return sb.toString();
    // }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        phone ph1 = new phone("maruti", "s1", "black", 8, 32, 4500);

        phone ph2 = new phone("mercedes", "Spro", "white", 12, 64, 5000);

        // phone[] arr = new phone[100000];

        // for (int i = 0; i < 100000; i++) {
        //     String brand = scn.nextLine();
        //     String model = scn.nextLine();
        //     String color = scn.nextLine();
        //     int ram = scn.nextInt();
        //     int storage = scn.nextInt();
        //     int battery = scn.nextInt();

        //     arr[i] = new phone(brand, model, color, ram, storage, battery);
        // }

        System.out.println(ph2);

    }
}