//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due Date: January 29th
//Average
//======================================================
import java.util.Scanner; //Imports scanner to allow user input
public class Task2 {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in); //Initiates Scanner to allow user input.
        int count = 0; //initiates count variable
        double sum = 0; //initiates sum variable that is a double to allow for decimal outputs.
        System.out.println("Enter your integer (use 'return' key to seperate each, when you're done type '-1'"); //Introduction line.
        while (true){ //while-loop to take all values to average.
            int num = inputDevice.nextInt(); //This asks for user input values.
            if(num < 0) //if value for negative numbers. (aka to end).
            break; //this ends the code if a negative number is input.
            sum+=num; //variable to add all numbers and call it the sum.
            count++; //count variable to add the total number of values input.
        }
        System.out.println("The average is: " + (sum/count)); //Output statement with the average found with sum and count variables.
    }
}
