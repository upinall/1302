//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Date: February 5th
//Title: NameLength
import java.util.Scanner; //Imports the Scanner utility.
public class Task2 {
    public static void main(String[] args) { //Main method
        Scanner inputDevice = new Scanner(System.in); //Initializes the scanner utility
        System.out.println("Enter your name: "); //Introduction
        String name = inputDevice.nextLine(); //name variable that accepts letter inputs.
        if(name.charAt(0)>=48 && name.charAt(0)<=57){ //This checks for numbers with ASCII and returns error if numbers exist.
            System.out.println("Invalid input, please re-run program and enter a valid name."); //Error message.
        }
        else { //else statement for correct inputs.
            System.out.println("My name is " + name); //Name returned.
            System.out.println("The string length of '" + name + "' is: " + name.length()); //States how long said name is (including spaces).
        }
    }
}
