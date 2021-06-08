//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Date: January 22nd
//Title: Loop Equation, Lab 2 - Task 1
//============================================
public class Task1 {
    public static void main(String[] args) { //This seems straightforward.
        int n, m, i; //This line initialized the three variables as integers.
        double sum1 = 0, sum2 = 0; //Initializes the 2 double values to be later used in the equations.
        n = 02; // Last two digits of my PantherID as there is no mention of user input I did not implement this feature.
        m = n + 5; // Equation asked to use from the Lab instructions.
        if(m%2==0){ //The next few lines are the equation loops. One for odd numbers and the other for even numbers.
            for(i=2;i<=m;i+=2){ //For-loop for even numbers.
                sum1 += (1.0/i);
                sum2 += (1.0/(3*i-1)); //3*i-1 is the equation used to find the output, it is divided by a double to get a decimal result.
            }
        }
        else{
            for(i=1;i<=m;i+=2){ //if not an even number, this for loop is used for odd numbers.
                sum1 += (1.0/i);
                sum2 += (1.0/(2*i+1)); //Like 3*i-1, 2*i+1 is used to find the output result.
            }
        }
        System.out.println("The result of Eq (1) is: " + sum1); //Output line
        System.out.println("The result of Eq (2) is: " + sum2); //Output line
    }
}
