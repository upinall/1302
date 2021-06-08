//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due: January 23rd
//Swap - It swaps digits, in this code it swaps digits from my PantherID, this program does not change any numerical values, they are shuffled.
//Note: I hate the amount of time looking through my old work to understand arrays again.
import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        int num; //variable for the number the user will input.
        System.out.println("Hello! This program swaps input.\nPlease enter a set of numbers to be swapped! (Try your PantherID!): "); 
        //Introduction and asking the user for number input.
        num = Integer.parseInt(inputDevice.nextLine()); //User input, would be a number.
        int numresult = swapDigitPairs(num); //This line calls on the swapDigitPairs method to do the number swapping.
        System.out.println("The swapped result is " + numresult); //Result output.
        System.out.println("Please enter a string to be swapped! (Try your name!): "); //Introduction for the string input swapping.
        String str = inputDevice.nextLine(); //User input line
        String strResult = swapLetterPairs(str); //Line calls for the swapLetterPairs method where letters will be shuffled.
        System.out.println("The swapped result is " + strResult); //Result output.
    }
    public static int swapDigitPairs(int num){ //Method that shuffles the Digits.
        int[] digits = new int[10]; //Array used to hold the numbers.
        int reverse = 0; //Line to initiate the reversed variable.
        int count = 0; //Line to initiate the count variable.
        while(num!=0) //While loop for array digits.
        {
            int lastdigit = num % 10;
            num = num/10;
            digits[count] = lastdigit;
            count++;
        }
        if(count%2 == 0){ //checks to see if an even number is input.
            for(int i = count-1;i>=0;i=i-2){
                reverse += digits[i-1];
                reverse = (reverse*10)+digits[i];
                if(i!=1)
                reverse *= 10; //Goes through all the digits and reverse *= 10 is used to check how many digits are left. (same applies to all other lines with this instruction)
            }
        }
        else { //Used when odd number of digits input.
            for(int i = count-2;i >= 0; i = i-2){
                if(i == count-2){
                    reverse = digits[count-1];
                    reverse *= 10;
                }
                reverse += digits[i-1];
                reverse = (reverse*10)+digits[i];
                if(i!=1)
                reverse *= 10;
            }
        }
        return reverse;
    }
    public static String swapLetterPairs(String str){ //Method swapLetterPairs is similar to swapDigitPairs yet it uses .length() and .charAt() for determining the shuffling of letters.
        String result = "";
        if(str.length()%2 == 0){ //For loop for even number of letters.
            for(int i=0;i < str.length();i=i+2){
                result += str.charAt(i+1);
                result += str.charAt(i);
            }
        }
        else { //Odd numbered letters
            for(int i = 1; i<str.length(); i=i+2) {
                if(i==1)
                result += str.charAt(0);
                result += str.charAt(i+1);
                result += str.charAt(i);
            }
        }
        return result;
    }
}
