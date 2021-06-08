//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due Date: January 29th
//Number Pyramid
//==========================================
public class Task1 {
    public static void main(String[] args) {
        int num = 5; //"num" variable initiated to create the number pyramid
        for(int i = num;i>=1;i--){ //descending for-loop
            for(int j=i;j<=5;j++){ //number increase for-loop. "5, 4-5, 3-4-5, etc."
                System.out.print(j+""); //This outputs the pyramid using print to avoid new line for every number.
            }
            System.out.println(); //This line needed to space out each pyramid line.
            if(i<=5 && i>=3){ //This if loop does the last line of numbers
                System.out.println(); //Spacer line
            }
        }
    }
}