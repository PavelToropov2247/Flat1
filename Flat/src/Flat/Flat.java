package Flat;

public class Flat {
    Rooms livingRoom = new Rooms();
    Rooms bedRoom = new Rooms();
    Rooms kitchen = new Rooms();
    Rooms bathRoom = new Rooms();
    public String address = "Flat address is Minsk city, Lenina str., 12. ";
    public int sizeFlat = 63;
    public String numbersRoom = "This is a two-bedroom flat. ";
     public void showInfo() {
         System.out.println(numbersRoom + address + "The size of flat is " + sizeFlat + "m^2. Please select a number from 1 to 4 to see information about the rooms.");
     }






}
