//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Date: January 22nd
//Title: BMI, Lab 2 - Task 2
//============================================
import java.util.Scanner; //Imports the scanner feature, which allows for user input.
public class BMI {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in); //This takes user inputs.
        String iD = "002-54-2302"; //PantherID asked by the instructions.
        String name = "Ernesto Aguilera"; // Name asked by the instructions.
        System.out.println("Hello there " + name + " with ID " + iD + "! \nPlease enter your weight and height."); //Introduction.
        System.out.println("Enter weight in lbs: "); //weight
        double num1 = inputDevice.nextDouble();
        System.out.println("Enter height in inches: "); //height
        double num2 = inputDevice.nextDouble();
        double bmi = bmi(num1, num2); //This line takes the two num values and calculates them to find the bmi.

        System.out.printf("BMI = %.2f, You are ", bmi); //The next few lines are used to determine where the user stands as far as weight goes.
        if(bmi < 18.5){
            System.out.println("underweight");
        } else if(bmi < 25){
            System.out.println("normal");
        } else if(bmi < 30){
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
    }
    public static double bmi(double num1, double num2){ //This method is used for the bmi equation.
        return num1/(num2*num2) * 703;
    }
}
