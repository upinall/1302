//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due: January 23rd
//Christmas Tree - Produces images of christmas trees based on numbers input by the user.
//Note: Christmas tree go wooooooo, I hope these extra comments don't make me lose points.
import java.util.Scanner;
public class ChrisTree {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in); //Using a scanner to ask the user for how many 
        System.out.println("Please input number of segments");
        int num1 = inputDevice.nextInt();
        System.out.println("Please enter the height number (number of rows in each segment)");
        int num2 = inputDevice.nextInt();
        drawTree(num1, num2); //Method with loops and equation that draws the tree.
    }
    public static void drawTree(int num1, int num2){
        int a = num1; //Variable for the last parts of the tree ~base/feet~
        int b = num2; //This line does the same job as the first line of this method.
        int start = 1; //Starting variable for the rows and the overall tree.
        for(int seg = 1;seg <= num1;seg++){ //The next few lines are the for-loop equation for printing the tree segments.
            for(int i = start; i <= num2;i++){
                int x = seg;
                while(x < num1){
                    System.out.print(" ");
                    x++;
                }
                for (int j = num2 - 1;j >= i; j--)
                System.out.print(" ");
                for (int j = 1; j <= i; j++)
                System.out.print("*");
                for (int k = 1;k < i; k++)
                System.out.print("*");
                System.out.println();
            }
            start += 1; //Resets the variable
            num2 += 1; //Resets the variable
        }
        for(int i = 1; i <= (a*b-1)/2;i++) //For-loop equation for the Stem
        System.out.print(" ");
        System.out.println("*");
        for(int i = 1;i <= (a*b-1)/2;i++)
        System.out.print(" ");
        System.out.println("*");
        for(int i = 1; i <= ((a*b-1)/2)-3; i++) //another for-loop equation for the base.
        System.out.print(" ");
        for(int j = 1;j<=7;j++)
        System.out.print("*");
    }
}
