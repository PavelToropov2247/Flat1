import Flat.Flat;
import Flat.Rooms;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome! Now you see your future flat. Please enter any button to see information about the flat.");
        Rooms livingRoom = new Rooms();
        Rooms bedRoom = new Rooms();
        Rooms kitchen = new Rooms();
        Rooms bathRoom = new Rooms();
        Scanner scanner = new Scanner(System.in);
        Flat info = new Flat();

        String anyChar   = scanner.nextLine();
               if (anyChar != null) {
            info.showInfo();

        }
               int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("This number does not exist. Try again!");
        } else if (number > 4) {
            System.out.println("This number does not exist. Try again!");
        } else if (number == 1) {
            livingRoom.title = "Living Room";
            livingRoom.sizeRoom = 10;
            livingRoom.type = "Residential";
            livingRoom.design = "Loft";
            livingRoom.showTitle();
            livingRoom.showSize();
            livingRoom.showDesign();
            livingRoom.showType();
            return;
        } else if (number == 2) {
            bedRoom.title = "Bedroom";
            bedRoom.sizeRoom = 20;
            bedRoom.design = "Classic";
            bedRoom.type = "Residential";
            bedRoom.showTitle();
            bedRoom.showSize();
            bedRoom.showDesign();
            bedRoom.showType();
            return;
        } else if (number == 3) {
            kitchen.title = "Kitchen";
            kitchen.sizeRoom = 15;
            kitchen.design = "Modern";
            kitchen.type = "Non-residential";
            kitchen.showTitle();
            kitchen.showSize();
            kitchen.showDesign();
            kitchen.showType();
            return;
        } else if (number == 4) {
            bathRoom.title = "Bathroom";
            bathRoom.sizeRoom = 18;
            bathRoom.design = "High Tech";
            bathRoom.type = "Residential";
            bathRoom.showTitle();
            bathRoom.showSize();
            bathRoom.showDesign();
            bathRoom.showType();
            return;
        }
        System.out.println("Welcome! Now you see your future flat. Please enter any button to see information about the flat.");


    }
}