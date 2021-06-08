//Name: Ernesto Aguilera
//Date: March 22nd, 2021
//PantherID: 002-54-2302
//Title: NBA/NBATeam
//Description: WATCH AS THE NBA CHAMPIONS DUKE IT OUT, CREATE YOUR TEAM, SEE WHO WINS OUT OF 7 GAMES.
import java.util.*; //importing utilities.
public class NBA { //NBA Class, user input is done in this class.
    public static void main(String[] args){ //Main method.
        Scanner inputDevice = new Scanner(System.in); //Scanner used.
        String ifAddPlayer; //Adding a player
        String playerName; //Name of player.

        System.out.println("Create the NBA team of Heats ...... "); //Intro statement
        NBATeam heat = new NBATeam("Heats"); //Team name.
        System.out.print("Add a play to Heats? (yes/no): "); //Question for user, expected output yes/no.
        ifAddPlayer = inputDevice.next(); //user input.

        while(ifAddPlayer.equalsIgnoreCase("yes")){ //while statement to ignore any variation of yes. (can be YES or yes or YeS).
            System.out.print("What is the name to be added? "); //Player name question.
            playerName = inputDevice.next(); //user input.
            heat.addAPlayer(playerName); //adds player to team list.

            System.out.print("Add one more play to Heats? (yes/no): "); //re-ask questions.
            ifAddPlayer = inputDevice.next(); //user input.
        }
        System.out.println("Create the NBA team of Spurs ...... "); //Spurs team.
        NBATeam spurs = new NBATeam("Spurs"); //Team name.
        System.out.print("Add a play to Spurs? (yes/no): "); //Question. expected "yes" or "no".
        ifAddPlayer = inputDevice.next(); //user response.

        while(ifAddPlayer.equalsIgnoreCase("yes")){ //ignores yes caps.
            System.out.print("What is the name to be added? "); //asks user for player name.
            playerName = inputDevice.next();
            spurs.addAPlayer(playerName); //adds player to team list.

            System.out.print("Add one more play to Spurs? (yes/no): "); //repeats question for the user.
            ifAddPlayer = inputDevice.next();
        }
        System.out.println("Game on now ...... "); //Game starts.
        for(int i=0;i<7;i++){ //loop for 7 random games.
            double g = Math.random(); //use of Random.
            if(g>0.5){ //if a random number is larger than 0.5 the team wins/loses.
                heat.winGame();
                spurs.loseGame();
            } else{
                heat.loseGame();
                spurs.winGame();
            }
        }
        if(heat.winNumber()>spurs.winNumber() || spurs.winNumber()>heat.winNumber()){ //Output.
            if(heat.winNumber()>spurs.winNumber()){
                System.out.println("\n" + heat.teamName() + " ***WIN the series***");
            } else{
                System.out.println("\n" + spurs.teamName() + " ***WIN the series***");
            }
        }
        System.out.println(heat.toString());
        System.out.println(spurs.toString());
    }
}
class NBATeam{ //NBATeam class which adds the wins and losses to a team.
    private String sTeamName; //teamname.
    private int nWin, nLoss, count = 0; //variables are called.
    private String [] playerArray = new String[1]; //array one
    private String [] temp = new String[1]; //array two
    public NBATeam(String name){ // sTeamname and name are equal.
        sTeamName = name;
    }
    public String teamName(){ //returns sTeamname.
        return sTeamName;
    }
    public void addAPlayer(String playerName){ 
        count++; //adds one to count variable.
        if(count==1){
            playerArray [count-1] = playerName;
        for(int i=0;i<playerArray.length;i++){
            temp[i] = playerArray[i];
        }
    } else {
        playerArray = new String[count];
        for(int i = 0;i<temp.length;i++){
            playerArray[i] = temp[i];
        }
        playerArray[count-1] = playerName;
        temp = new String[count];
        for(int i = 0;i<playerArray.length;i++){
            temp[i] = playerArray[i];
        }
    }
    }
    public void winGame(){ //adds to win
        nWin++;
    }
    public int winNumber(){ //sends win number.
        return nWin;
    }
    public void loseGame(){ //adds to loss.
        nLoss++;
    }
    public String toString(){ //outputs win and loss numbers.
        return sTeamName + " " + Arrays.toString(temp) + " Win #: " + nWin + " Lose #: " + nLoss;
    }
}