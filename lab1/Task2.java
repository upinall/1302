//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due Date: January 15th
//===========================================
public class Task2 {
    public static void main(String[] args){
        int n = 02 + 5; //Used my own PantherID, assignment also fails to clarify which number of digits from PantherID used but I went with 2 like the previous task.
        LFSide(n); //first side of Xs is drawn here.
        //The following loop is used to draw the middle area.
        for(int i = 1; i <= n - 2; i++){
            MSide(n);
        }
        //This is the other side of Xs.
        LFSide(n);
        //Calculates and prints the area of the square.
        Area(n);
    }
    //This next method draws the x-filled lines on the first and last sides.
    public static void LFSide(int n){
        for (int i=1; i<=n; i++){
            System.out.print("x");
        }
        System.out.println();
    }
    //This method fills the middle side with Xs and As.
    public static void MSide(int n){
        System.out.print("x");
        for(int i=1;i<= n - 2; i++){
            System.out.print("a");
        }
        LFSide(1);
    }
    //This method calculates the area of the square based on the pantherID value.
    public static void Area(int n){
        System.out.println("The area of the square is: " + n * n);
    }
}
