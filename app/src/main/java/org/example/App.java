package org.example;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Converter converter = new Converter();
    System.out.println("Welcome to the Ounce Conversion Program!");
    System.out.print("How many ounces do you have? ");
    int ounces = input.nextInt();
    System.out.println("You enetred " + ounces + " ounces.");
    System.out.println(ounces + " oz is equivlent to " + converter.toPoundsAndOunces(ounces) + ".");
    System.out.println(ounces + " oz is equivlent to " + converter.toPounds(ounces) + ".");
    System.out.println("Thank you for using the program. Goodbye!");
    input.close();
  }
}
