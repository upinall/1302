//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due: February 6th
//Title: RepeatedDigits
//Extra info: lol this is gonna be long huh?
import java.util.*; //Imports any utility under the java.util list.
public class RepeatedDigits {
    public static void main(String[] args) { //Main method
        Scanner inputDevice = new Scanner(System.in); //Initializes the scanner to a variable to allow user input.
        int num; //num integer is initialized.
        System.out.print("Enter a number: "); //Introduction
        num = inputDevice.nextInt(); //line that allows user to input numbers for the program, 0 would end the program from the start.
        while(num > 0){ //While loop that goes infinitly until 0 is entered.
            int digitOccur[] = new int[10]; //array initialized
            countDigitOccur(num, digitOccur); //countDigitOccur method is called to do the job of organizing digits.
            System.out.println(); //Spacer line.
            System.out.print("Enter a number: "); //Repeat of initial question.
            num = inputDevice.nextInt(); //Scanner repeat.
        }
    }
    public static void countDigitOccur(int num, int digitOccur[]){ //Method used to do equations and organize the numbers.
        int digit = 0; //Initializes the digit variable.
        while(num > 0){ //while loop to calculate the occurences of the values.
            digit = num%10;
            digitOccur[digit] += 1;
            num = (num/10);
        }
        System.out.print("Digit:          "); //prints out the digit list, spaces for clean output, probably easier alternative to this.
        for(int i=0;i<10;i++){ //loop for the numbers up to 9
            System.out.print(i + " "); //num + space.
        }
        System.out.println(); //Spacer
        System.out.print("Occurences:     "); //prints out how many times the digit occurs.
        for(int i=0;i<10;i++){ //All the way to 9.
            System.out.print(digitOccur[i] + " ");
        }
        System.out.println(); //Spacer.
    }
}
