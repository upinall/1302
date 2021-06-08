//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Date: February 12th
//Title MinGap

import java.util.*; //This line imports the necessary utilities.
public class MinGap {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in); //Scanner is initialized under the variable "inputDevice"
        int x, gap = 0,i = 0; //Integer variables are initialized.
        System.out.println("Enter an array of integers\nHow many elements: "); //Intro & Question to ask user.
        x = inputDevice.nextInt(); //User number input line.
        System.out.println("What are the elements: "); //Based on the previous answer this asks what the numbers are.
        int num[] = new int[x]; //Array is initialized to take the numbers.
        for(i=0;i<num.length;i++){ //for loop to take inputs until the x is reached.
            num[i]=inputDevice.nextInt();
        }
        gap = minGap(num); //Method is called.
        System.out.println("Minimum gap is " + gap); //Final output.
    }
    public static int minGap(int[] num){ //Method to find lowest gap.
        int min, i, diff=0; //Variables initialized.
        if(num.length<2) //if statement for values less than 2.
        return(0);
        else{
            min = 100; //Initialize min value.
            for(i=0;i<num.length-1;i++){ //for loop to do subtraction and to find the minimum gap.
                diff = num[i]-num[i+1];
                if(diff<0)
                diff = diff * -1;
                if(diff < min)
                min = diff;
            }
        }
        return min; //returns back to the method recall.
    }
}
