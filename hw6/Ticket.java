//Name: Ernesto Aguilera
//Date: 4/19/2021
//PantherID: 002-54-2302
//Title: Campus Ticket Event
//Description: How much does the ticket cost?
import java.util.*; //Imports utilities.
public class Ticket { //Main method/Client.
    private int number; //Variables
    protected double price;
    public Ticket(int number){ //Sets number.
        this.number = number;
    }
    public double getPrice(){ //Price output.
        return price;
    }
    public String toString(){ //Final Output.
        return "Number: " + number + ", Price: " + price;
    }
    public static void main(String [] args){ //Main method with scanner and if scenarios based on ticket.
        int x;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Which type of ticket?");
        System.out.println("1. Walk-up Ticket \n2. Advance Ticket \n3. Student Advance Ticket");
        System.out.print("Enter either 1, 2, or 3: ");
        x = inputDevice.nextInt();
        if(x==1){
            int num = (int)(Math.random()*99); //Each instance of rdm*99 is what determines the ticket number.
            Ticket wt = new WalkupTicket(num);
            System.out.println(wt); //Walkup ticket output.
        }
        if(x==2){
            int num = (int)(Math.random()*99);
            Ticket at = new AdvanceTicket(num,11); //11 represents value of days for later statement.
            System.out.println(at); //Advance ticket output.
        }
        if(x==3){
            int num = (int)(Math.random()*99);
            Ticket sat = new StudentAdvanceTicket(num,11);
            System.out.println(sat + " (ID Required)"); //Student advance ticket, ID required part added to verify student identity.
        }
    }
}
class WalkupTicket extends Ticket{ //Walkup ticket class with normal price (50).
    public WalkupTicket(int number){
        super(number);
        price = 50;
    }
}
class AdvanceTicket extends Ticket{ //Advance ticket.
    public AdvanceTicket(int number, int daysinAdvance){
        super(number);
        if(daysinAdvance<10){ //if purchased less than 10 days of the event.
            price = 40;
        } else{ //if purchased 10 days or more before the event.
            price = 30;
        }
    }
}
class StudentAdvanceTicket extends AdvanceTicket{ //Student prices.
    public StudentAdvanceTicket(int number, int daysinAdvance){
        super(number, daysinAdvance);
        price = price/2; //Half off.
    }
}