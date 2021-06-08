//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due Date: January 15th
//===========================================
public class Lab {
    public static void main(String[] args){
        int iD = 02; //Last two digits of my PantherID
        int sum = 0; //The number 0 is used to initialize the sum value
        //For-loop used in the next few lines
        for(int count = 0; count<30; count++){
            sum += iD + 2*count;
        }
        //The next few lines are the result lines that is shown in the output console.
        System.out.println("The result of for-loop is: " + sum); //for-loop result.
        System.out.println("The result of the method is: " + Arithmetic_sequence(30, iD)); //Equation result.
    }
    //This is the method for calculating sum of Arithmetic Sequence. iD and num are taken from the main method and used as variables in this method.
    public static int Arithmetic_sequence(int iD, int num){ 
        return iD * (2 * num + (iD - 1) * 2)/2; //The equation is returned to the main method to then be called.
    }
}
