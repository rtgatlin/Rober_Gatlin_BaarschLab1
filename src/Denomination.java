import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public record Denomination(String name, double amt, String form, String img){
    public static Denomination penny = new Denomination("Penny", .01, "coin", "Images/penny.png");public static Denomination nickel = new Denomination("Nickel", .05, "coin", "nickel.png");
    public static Denomination dime = new Denomination("Dime", .10, "coin", "Images/dime.png");
    public static Denomination quarter = new Denomination("Quarter", .25, "coin", "Images/quarter.png");
    public static Denomination ones = new Denomination("One dollar bill", 1.0, "bill", "Images/one_note.png");
    public static Denomination fives = new Denomination("Five dollar bill", 5.0, "bill", "Images/five_note.png");
    public static Denomination tens = new Denomination("Ten dollar bill", 10.0, "bill", "Images/ten_note.png");
    public static Denomination twenties = new Denomination("Twenty dollar bill", 20.0, "bill", "Images/twenty_note.png");
    public static Denomination fifties = new Denomination("Fifty dollar bill", 50.0, "bill", "Images/fifty_note.png");
    public static Denomination hundreds = new Denomination("Hundred dollar bill", 100.0, "bill", "Images/hundred_note.png");

    public record Denominations() {

    }
}



