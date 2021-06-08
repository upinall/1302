//Name: Ernesto Aguilera
//Date: 4/5/2021
//PantherID: 002-54-2302
//Title: Bank
//Description: This program creates a bank and based on user input it can create up to 1000 random accounts.

import java.util.*; //Utilities imported.

public class Bank { //Main class
    public static void main(String[] args) { //Variables are initialized and pantherID is stated (under GSUCampusID).
        int numOfAccount;
        Random rdm = new Random(); //Random generator.
        double bal = 0; //balance.
        Scanner inputDevice = new Scanner(System.in); //to allow user input.
        System.out.print("Enter the number of accounts to create: ");
        numOfAccount= inputDevice.nextInt();
        if (numOfAccount > 1000) { //sets max number of accounts.
            System.out.println("ERROR MAX: Number of account should be less than 1000");
        }
        PaypalAccount[] paypalAccArr = new PaypalAccount[numOfAccount];
        for (int i = 0; i < numOfAccount; i++) {
            bal = rdm.nextDouble() * (1000.0 - 0.0) + 0.0;
            paypalAccArr[i] = new PaypalAccount(i, bal);
        }
        String GSUcampusID = "002-54-2302";
        System.out.print("\nMy Panther ID is " + GSUcampusID);
        int myAcc = Integer.parseInt(GSUcampusID.substring(0, 3));
        double balancTotal = 0, largeBal = paypalAccArr[0].balance, lowBal = paypalAccArr[0].balance;
        int lpb = 0, hpb = 0;
        boolean accFound = false;
        int i;
        for (i = 0; i < numOfAccount; i++) { //Validates if the panther id/account id is in the bank.
            if (paypalAccArr[i].accountID == myAcc) { //if true.
                accFound = true;
                i = numOfAccount + 1;
                System.out.print("\nmy bank account ID is " + myAcc);
                System.out.print(" and the balance is: $");
                System.out.printf("%.1f", paypalAccArr[numOfAccount - 1].balance);
            }
        }
        if (!accFound) { //if false.
            paypalAccArr[numOfAccount - 1].accountID = myAcc;
            paypalAccArr[numOfAccount - 1].balance = Double.parseDouble(GSUcampusID.substring(4, 6) + GSUcampusID.substring(8, GSUcampusID.length())) / 100.00;
            System.out.print("\nMy bank account ID is " + myAcc);
            System.out.print(" and the balance is: $");
            System.out.printf("%.1f", paypalAccArr[numOfAccount - 1].balance);
        }
        for (i = 0; i < numOfAccount; i++) { //finds largest balance
            if (paypalAccArr[i].balance > largeBal) {
                largeBal = paypalAccArr[i].balance;
                hpb = i;
            }
            if (paypalAccArr[i].balance < lowBal) { //finds lowest balance.
                lowBal = paypalAccArr[i].balance;
                lpb = i;
            }
            balancTotal += paypalAccArr[i].balance;
        }
        System.out.print("\nThe average balance is: $"); //average balance.
        double avg=(balancTotal / numOfAccount);
        System.out.printf("%.1f", avg);
        System.out.print("\nThe account with the largest balance: accountID = " + paypalAccArr[hpb].accountID);
        System.out.printf(", balance = %.1f ",paypalAccArr[hpb].balance);
        System.out.print("\nThe account with the lowest balance: accountID = " + paypalAccArr[lpb].accountID);
        System.out.printf(", balance = %.1f ",paypalAccArr[lpb].balance);
    }
}

class PaypalAccount{ //client program.
    double balance;
    int accountID;
    public PaypalAccount() {
        super();
    }
    public PaypalAccount(int inAccID, double inBal) {
        super();
        this.accountID = inAccID;
        this.balance = inBal;
    }
}