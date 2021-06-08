//Name: Ernesto Aguilera
//PantherID: 002542302
//Date: 3/26/2021
//Title: Fraction
//Description: It calculates a lot of fractions.

import java.util.*; //Imports any needed tools
public class Fraction { //Fraction class
    private int numerator, denominator; //private variables
    public Fraction(int numerator, int denominator){ //defines numerator and denominator.
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNum(){ //returns the numerator value.
        return numerator;
    }
    public void setNum(int numerator){ //sets the value.
        this.numerator = numerator;
    }
    public int getDnom(){ //returns denominator value.
        return denominator;
    }
    public void setDnom(int denominator){ //sets denominator value.
        this.denominator = denominator;
    }
}
class MultiplyClient{ //Client class.
    public static Fraction FractionMultiply(Fraction Example1, Fraction Example2){ //Example 1 and 2 are the variables.
        return new Fraction(Example1.getNum()*Example2.getNum(), Example1.getDnom()*Example2.getDnom()); //multiplies for fraction.
    }
    public static void main(String[] args){ //Final output.
        Random rdm = new Random(); //Random tool used.
        Fraction[] fractionArray = new Fraction[2+3]; //Array with last pantherid digit(2) + 3.
        for(int i = 0;i<fractionArray.length;i++){ //Randomly created fractions in range of 1 to 10.
            int num = rdm.nextInt(10)+1; //numerator
            int dnom = rdm.nextInt(10)+1; //denominator
            fractionArray[i] = new Fraction(num,dnom); //Fraction output.
        }
        for(int i = 0;i<fractionArray.length-1;i++){
            Fraction product = FractionMultiply(fractionArray[i], fractionArray[i+1]);//Multiply over adjacent
            System.out.println("Fraction = " + product.getNum()+"/"+product.getDnom()); //Final output.
        }
    }
}