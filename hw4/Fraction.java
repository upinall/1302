//Name: Ernesto Aguilera
//Date: March 22nd, 2021
//PantherID: 002-54-2302
//Title: Fraction
//Description: Enter a fraction and this will scale up by however much the user enters.
import java.util.Scanner; //Imported for user input, used in class FractionScale.

public class Fraction { //Fraction class, does the scaling and work.
        private int numerator, denominator; //private numerator and denominator
        public Fraction(int num, int dnom){ //Constructors
            numerator = num;
            denominator = dnom;
        }
        public Fraction(){
            numerator = 0;
            denominator = 1;
        }
        public Fraction(int num){
            numerator = num;
            denominator = 1;
        }
        public int getNum(){ //returns numerator value
            return numerator;
        }
        public int getDnom(){ //returns value of denominator
            return denominator;
        }
        public Fraction add(Fraction x){ //add method, 
            int num = numerator*x.denominator + x.numerator*denominator;
            int dnom = denominator*x.denominator;
            return new Fraction(num,dnom); //return values.
        }
        public Fraction divide(Fraction x){ //divide method
            int num = numerator*x.denominator, dnom = denominator*x.numerator;
            return new Fraction(num, dnom);
        }
        public Fraction scaleup(int factor){ //scales up by factor value.
            int num = numerator;
            if(factor==0){ //if the factor entered is 0 it will return the following error.
                System.out.println("Error 0: Cannot Scale");
            }
            else{ //if else it will scale.
                num = numerator*factor;
            }
            return new Fraction(num, denominator); //return values.
        }
        public Fraction scaledown(int factor){ //scales down.
            int dnom = denominator;
            if(factor == 0){ //if 0, returns error.
                System.out.println("Error 0: Cannot Scale");
            }
            else{ //will factor down.
                dnom = denominator*factor;
            }
            return new Fraction(numerator, dnom); //return value.
        }
        public Fraction scale(int factor, boolean flag){ //scale check method, will check if scaleup or scaledown is wanted.
            if(flag){ //if 1 (yes) then it will do scaleup
                return scaleup(factor);
            }
            else{ //otherwise this value will scale down.
                return scaledown(factor);
            }
        }
    }
class FractionScale{ //I suppose this is the main class no?
    public static void main(String [] args){ //Main method
        System.out.println("This program performs the scaling operations on a fraction"); //opening statement
    Scanner inputDevice = new Scanner(System.in); //User input.
    System.out.print("Enter a fraction: "); //Question for the user.
    String frac = inputDevice.next(); //User response
    frac = frac.replace(" ",""); //this allows as many spaces
    int indexOfSlash = frac.indexOf("/");
    String numStr = frac.substring(0, indexOfSlash); //getting numerator
    String dnomStr = frac.substring(indexOfSlash+1, frac.length()); //getting denominator
    int num = Integer.parseInt(numStr), dnom = Integer.parseInt(dnomStr); //converting both to integer values.
    Fraction x1 = new Fraction(num,dnom), x2 = new Fraction(); //creating fractions.
    System.out.print("Scale up or down? (1: up, 0: down): "); //Scale up or down?
    int scale = inputDevice.nextInt(); //User response. 1 or 0.
    System.out.print("Enter factor: "); //Enter factor to scale up or down by.
    int factor = inputDevice.nextInt(); //User response (12000 hahah).
    if(scale==1){ //if 1 then scale up
        x2 = x1.scaleup(factor);
    } else if(scale==0){ //if 0 scale down.
        x2 = x1.scaledown(factor);
    }
    System.out.println("Scaled fraction is " + x2.getNum()+"/"+x2.getDnom()); //Final Output!
}
}