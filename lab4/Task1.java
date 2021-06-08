//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Date: February 5th
//Title: CountDigits
import java.util.Scanner; //Imports the Scanner utility
public class Task1 {
    public static void main(String[] args) { //Main method
        Scanner inputDevice = new Scanner(System.in); //initializes the Scanner utility.
        int n; //n variable to hold the number.
        System.out.print("Please input a number: "); //Introduction sentence to ask for a number input.
        n = inputDevice.nextInt(); //Scanner line to allow for user input and the input is stored onto the n variable.
        System.out.println("There are " + countDigit(n) + " digits in the number of " + n); //Final output, states how many digits are in the number, plus the given number.
    }
    public static int countDigit (int n){ //countDigit method, this does the counting.
        int count = 0; //Count variablet to hold how many digits have been counted.
        while(n > 0){ //while loop to calculate the number of digits.
            n /= 10; //equation for finding number of digits.
            count++; //adds to count variable.
        }
        return count; //return statement for the final output.
    }
}