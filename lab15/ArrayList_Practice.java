//Name: Ernesto Aguilera
//Date: 04/23/2021
//PantherID: 002542302
//Title: ArrayList_Practice
//Description: HAHAH I DIDNT EVEN SEE tHE GIVEN CODE AFJOAIFJOAIF okok! So this program prints name twice in an array and outputs what position each character is at.
import java.util.*; //utilities (notably arraylist and arrays)
public class ArrayList_Practice { //Class
    public static String redundantCharacterMatch(ArrayList<Character> ernesto){ //RCM method.
        String str = "", position = ""; //Two variables one to store the name and another to store what position the characters are in.
        ArrayList<Character> temp = new ArrayList<Character>(); //ArrayList temp variable
        int length = ernesto.size(); //Finds the length of the string.
        char c; //Holds character.
        for(int i=0;i<length;i++){ //loop to find the position and print it.
            c = ernesto.get(i);
            position = c + ": " + i;
            if(temp.indexOf(c) == -1){
                temp.add(c); //if not in list then adds to temp list.
                for(int j = i+1;j<length;j++){ //This loop then takes the first loop's position to see if it matches with any other.
                    if(ernesto.get(j) == c)
                    position += ", " + j; //if so the character is added to the position list.
                }
            }
            if(position.length()>6) //prints out the string with new lines.
            str += position + "\n";
        }
        return str; //output.
    }
    public static void main(String[] args) {
        String name = "ernesto"; //Name to be processed.
        name += name;
        char[] cArray = name.toCharArray(); //String to charArray
        ArrayList<Character> ernestoExample = new ArrayList<Character>(); //adds to list.
        for(char c : cArray){
            ernestoExample.add(c);
        }
        System.out.println(redundantCharacterMatch(ernestoExample)); //Final output.
    }
}
