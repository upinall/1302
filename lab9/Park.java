//Name: Ernesto Aguilera
//Date: March 12th 2021
//PantherID: 002-54-2302
//Title: Park
//Description: 5 Parks, 1 Answer. WHO WILL PREVAIL? (Note: Unknown whether to use random utility or not, avoided the use of it anyway).
class Park{ //Park class, avoided using multiple java files.
    public String ParkName;
    public int ParkID;
    public String ParkShape;
    private double ParkLength; //Private ParkLength

    public Park(String ParkName, int ParkID, String ParkShape, double ParkLength){ //Park method.
        this.ParkName = ParkName;
        this.ParkID = ParkID;
        if(ParkShape=="Circle" || ParkShape == "Square") //Checks to see if park is either circle or square.
        this.ParkShape = ParkShape;
        else{
            System.out.println("Invalid park shape"); //This is output if parkshape is neither circle or square.
        }
        this.ParkLength = ParkLength;
    }
    String ParkNameGetter(){ //returns park's name
        return this.ParkName;
    }
    int ParkIDGetter(){ //Returns park's ID
        return this.ParkID;
    }
    double ParkLengthGetter(){ //Returns park's length.
        return this.ParkLength;
    }
}

class ParkClient{
    public static void main(String[] args){ //main method.
        Park p1 = new Park("CSC1302",02,"Circle",5); //park 1 (02 in this and other instances from PantherID)
        Park p2 = new Park("CSC1302",02+3,"Square",6); //park 2
        Park p3 = new Park("Fun Park",02+11,"Square",3); //park 3
        Park p4 = new Park("LARGE",02+50,"Circle",20); //park 4
        Park p5 = new Park("Finale",02+02,"Square",4); //park 5
        Park ParkArray[] = {p1,p2,p3,p4,p5}; //Array to hold all the parks' values.
        int largestParkvari = 0; //Initiates a value to hold which park is the largest.
        for(int i = 0;i<ParkArray.length;i++){ //nested for loop to find largest park.
            if(ParkArray[i].ParkLengthGetter()>ParkArray[largestParkvari].ParkLengthGetter()){
                largestParkvari = i;
            }
        }
        Park largestPark = ParkArray[largestParkvari]; //Final output.
        System.out.println("Park name: " + largestPark.ParkNameGetter() + "\nPark ID: " + largestPark.ParkIDGetter() + "\nPark Shape: " + largestPark.ParkShape + "\nPark Length: " + largestPark.ParkLengthGetter());
        }
}