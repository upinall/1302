//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due: February 19th
//Title: NBA/NBATeam
//Generates a list of wins/losses based on random generator. (Note: Not trustworthy to gamble with).
import java.util.*; //Imports necessary utilites.
public class NBA { //Main Class
    public static void main(String[] args) { //Main Method
        Random rdm = new Random(); //Random Generator
        NBATeam heats = new NBATeam("Heats"); //Calls to the NBATeam class with the team name "Heats"
        NBATeam lakers = new NBATeam("Lakers"); //Calls to the NBATeam class with the team name "Lakers"
        for(int i=0;i<3;i++){ //For loop to keep repeating until a winner is decided.
            if(rdm.nextDouble()>0.5){ //if else statement below to decided who will be the winner this involves the heats winning.
                heats.winAGame();
                lakers.lossAGame();
            }
            else{ //Else statement involves if the lakers win.
                lakers.winAGame();
                heats.lossAGame();
            }
        }
        System.out.println("" + heats); //Output statement showing how many wins/losses the heats have
        System.out.println("" + lakers); //Output statement showing the wins/losses
        NBATeam nets = new NBATeam("Nets"); //Nets team input
        NBATeam warriors = new NBATeam("Warriors"); //Warriors team input
        nets.setWinNum(rdm.nextInt(83)+1); //Sets number of wins between 1 and 82.
        warriors.setWinNum(rdm.nextInt(83)+1); //Same as above line.
        System.out.println(""+nets); //Nets output
        System.out.println(""+warriors); //Warriors Output.
    }
}
class NBATeam{
    private String teamName; //Variable for name of team
    private int NumberOfWin = 0; //Initiates value of Win
    private int NumberOfLoss = 0; //Initiates value of losses
    public NBATeam(String teamName){
        this.teamName = teamName;
    }
    public void winAGame(){ //method to count up number of wins
        NumberOfWin++;
    }
    public void lossAGame(){ //method to count up number of losses.
        NumberOfLoss++;
    }
    public void setWinNum(int n){ //Sets win number.
        this.NumberOfWin = n;
    }
    public int getWinNum(){ //Gets the win number
        return NumberOfWin;
    }
    public String toString(){ //Return statement.
        return teamName + " Wins: " + NumberOfWin + " Losses: " + NumberOfLoss;
    }
}
