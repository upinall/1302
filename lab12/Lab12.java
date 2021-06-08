//Name: Ernesto Aguilera
//Date: 4/2/2021
//PantherID: 002-54-2302
//Title: Cat.
//Description: This program tells you characteristics of a cat!
public class Lab12 { //Main class
    public static void main(String[] args) { //Main class
        Cat c = new Cat(false,"meat",4,"white"); //Variables to input to cat class.
        System.out.println("Is the cat vegetarian? " + c.isVegetarian()); //Output 1
        System.out.println("Cat eats: " + c.getEats()); //Output 2
        System.out.println("Cat has: " + c.getnumLegs()+ " legs."); //Output 3
        System.out.println("Cat color is " + c.getColor()); //Output 4
    }
}
class Animal{ //Animal class, sets and returns variables.
    private boolean vegetarian; //boolean
    private String eats; //eats variable
    private int numLegs; //number of legs variable
    public Animal(boolean vegetarian, String eats, int numLegs){
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.numLegs = numLegs;
    }
    public boolean isVegetarian() { //returns true/false (could've added statement where "no animal is not vegetarian etc.")
        return vegetarian;
    }
    public void setVegetarian(boolean vegetarian){ //sets the true/false
        this.vegetarian = vegetarian;
    }
    public String getEats(){ //returns the string given for eats.
        return eats;
    }
    public void setEats(String eats){ //sets the eats variable
        this.eats = eats;
    }
    public int getnumLegs(){ //return number of legs given.
        return numLegs;
    }
    public void setnumLegs(int numLegs){ //sets the variable
        this.numLegs = numLegs;
    }
}
class Cat extends Animal{ //Cat class, where the cat's characteristics are given.
    private String color; //color of the animal.
    public Cat(boolean vegetarian, String eats, int numLegs, String color){ //variables are set.
        super(vegetarian,eats,numLegs);
        this.color = color; //color is initialized
    }
    public String getColor(){ //returns color string.
        return color;
    }
    public void setColor(String color){ //sets color string.
        this.color = color;
    }
}