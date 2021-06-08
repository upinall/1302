//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due: Feb 20th
//Title TicTacToe
//Description: A game of TicTacToe! (Note: this took too long and the visually looks similar to the examples in the assignment.)
import java.util.*; //Utilities.
public class TicTacToe {
    public static void main(String[] args) { //Main method, outputs are here.
        TicTacToe object = new TicTacToe(); //Creates object variable.
        Scanner inputDevice = new Scanner(System.in); //User input.
        int x = 0; //x variable initialized.
        System.out.println("Welcome to play TicTacToe game! We have the following 3x3 board"); //Introduction.
        object.drawboard(); //Draws the 3x3 board.
        while(x<9){ //while loop to keep board going until a winner is decided.
            object.playermove(inputDevice,object.player1); //Player 1 moves.
            x++;
            if(x>4){ //If statement to check for victory.
                if(object.winnercheck(player1)){
                    System.out.println("We have a winner! Congrats!");
                    break;
                }
            }
            object.drawboard(); //redraws the board.
            object.playermove(inputDevice, object.player2); //Player 2.
            x++;
            if(x > 4){ //Win check
                if(object.winnercheck(player2)){
                    System.out.println("We have a winner! Congrats!");
                    break;
                }
            }
            object.drawboard(); //redraw of board.
        }
    }
    private String[][] board;
    static String player1 = "X"; //Player one is X
    static String player2 = "O"; //Player two is O
    public TicTacToe(){ //TTT method
        board = new String[3][3];
    }
    public void drawboard(){ //This method draws the 3x3 grid.
        System.out.println();
        System.out.println("|----------------|"); //top part.
        for(int i = 0;i<board.length;i++){ //In between parts.
            System.out.print("| ");
            for(int j = 0; j<board[i].length;j++){
                if(board[i][j] == null){
                    System.out.print(" - "); //Where X/O goes in.
                } else {
                    System.out.print(board[i][j]);
                }
                if(j<2){
                    System.out.print(" | "); //Between each x/o
                } else {
                    System.out.println();
                    System.out.println("|----------------|"); //End of board.
                }
            }
        }
        System.out.println();
    }
    public Boolean winnercheck(String play){ //Checks for a victory between the players.
        int playRow = 0; //Row check variable.
        int p1 = 0, p2 = 0; //players
        int[] boardwin = new int[board[0].length]; //array for the board.
        for(int i = 0;i<board.length;i++){
            playRow = 0;
            for(int j = 0;j<board[i].length;j++){
                if(null == board[i][j]){
                    continue;
                }
                if(board[i][j].equals(play)){
                    playRow++;
                    boardwin[j]++;
                    if(i == j) {
                        p1++;
                    } else if(2 == i+j){
                        p2++;
                    }
                }
            }
            if(playRow == 3){
                return true; //if three in a row then victory.
            }
        }
        if(3 == p1 || 3 == p2){ //If p1 or p2 get 3 in a row, victory.
            return true;
        }
        for(int i = 0;i<boardwin.length;i++){ //3 in a row = win.
            if(boardwin[i] == 3){
                return true;
            }
        }
        return false; //No victory/keep game going.
    }
    public void playermove(Scanner inputDevice, String play){ //Tracks userinput/where each mark is placed.
        int row, col;
        Boolean flag = false;
        while(!flag){
            row = -1;
            col = -1;
            System.out.print("Enter the row index: "); //Row
            if(inputDevice.hasNextInt()){
                row = inputDevice.nextInt();
            }
            System.out.print("Enter the column index: "); //Column
            if(inputDevice.hasNextInt()){
                col = inputDevice.nextInt();
            }
            else{ //If no number is input.
                inputDevice.nextLine();
                System.out.println("Both inputs must be numbers between 0 and 2");
                continue;
            }
            if((row<0)||(row>2)||(col<0)||(col>2)){ //if number less than 0 or greater than 2.
                System.out.println("Both inputs must be numbers between 0 and 2");
                continue;
            } else if(board[row][col] != null) { //If space is used by other player.
                System.out.println("That space is taken");
                continue;
            } else {
                board[row][col]=play;
                return; //called back
            }
        }
        return; //called back.
    }
}
