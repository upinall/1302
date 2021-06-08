//Name: Ernesto Aguilera
//Date: 4/19/2021
//PantherID: 002-54-2302
//Title: ColoredPoint
//Description: Input values to check if two points are the same!
public class ColoredPoint extends Point{ //Class implementing all classes given.
    private String color; //Color variable.
    public ColoredPoint(){ //Color default value.
        super();
        color = "unknown";
    }
    public ColoredPoint(int x, int y, String color){ //Inputs are directed to this.
        super(x,y);
        this.color=color;
    }
    public String getColor(){ //returns color
        return color;
    }
    public void setColor(String color){ //sets new color value.
        this.color = color;
    }
    public boolean equals(Object o){ //decides if colors and points are the same.
        if(o instanceof ColoredPoint){
            ColoredPoint c = (ColoredPoint) o;
            return super.equals(c) && this.color.equalsIgnoreCase(c.color);
        } else{
            return false;
        }
    }
    public String toString(){ //Output.
        return super.toString() + ", Color = " + color;
    }
}
class Point{ //Point class given.
    private int x,y;
    public Point(){
        this(0,0);
    }
    public Point(int x, int y){
        setLocation(x,y);
    }
    public boolean equals(Object o){
        if(o instanceof Point){
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
    }
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
class ColoredClient{ //Client with inputs.
    public static void main(String[]args){
        ColoredPoint p1 = new ColoredPoint(102, 102, "Purple");
        ColoredPoint p2 = new ColoredPoint(64, 32, "Red");
        ColoredPoint p3 = new ColoredPoint(102, 102, "Purple");
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Point 3: " + p3);
        System.out.println("Are Point 1 and 2 equals? Results say: " + p1.equals(p2) + "\nWhat about Point 1 and 3?: " + p1.equals(p3) + "\nHow about 2 and 3? " + p2.equals(p3));
    }
}