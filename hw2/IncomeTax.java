//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due: February 6th
//Title: IncomeTax
//Extra info: YO! A NEW UTILITY.
import java.util.*; //Initializes all util libraries or utilities.
public class IncomeTax {
    public static void main(String[] args){ //Main method.
        Scanner inputDevice = new Scanner(System.in); //Scanner is initialized.
        int num; //integer variables initialized.
        double tax, amount, max = 0; //double variables initialized.
        Random ppl = new Random(); //Random is initialized.
        num = ppl.nextInt(15)+1; //using random and num variable this was able to create a randomly generated number of people from 1 to 15.
        for(int i = 1;i<=num;i++){ //for loop in determining tax rates/amount to tax.
            System.out.println("Enter the amount of taxable income of person " + i); //Intro statement.
            amount = inputDevice.nextDouble();
            if(amount <= 750){ //if-else used multiple times to meet the income separations.
                tax = (1/100.0)*amount;
                System.out.println("Tax due is $" + tax);
                if(max < tax)
                max = tax;
            }
            else if (amount>750 && amount<=2500){ //same lines with different values
                tax = 7.5 + (2/100.0)*(amount-750);
                System.out.println("Tax due is $" + tax);
                if(max < tax)
                max = tax;
            }
            else if(amount>2500 && amount<=5000){ //part 3 of same lines.
                tax = 82.5+(4/100.0)*(amount-2500);
                System.out.println("Tax due is $" + tax);
                if(max < tax)
                max = tax;
            }
            else if(amount>5000 && amount<=8000){ //part 4 of same lines but different values.
                tax = 142.5+(5/100.0)*(amount-5000);
                System.out.println("Tax due is $" + tax);
                if(max < tax)
                max = tax;
            }
            else {
                tax = 230.00 + (6/100.0)*(amount-8000); //part 5 of same lines different values.
                System.out.println("Tax due is $" + tax);
                if(max < tax)
                max = tax;
            }
        }
        System.out.println("The max value of taxes is $" + max); //End statement.
    }
}