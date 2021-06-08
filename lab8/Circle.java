//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Date: March 5th 2021
//Title/Description: Circle, this program calculates the area, circumference, and checks to see if a certain point lies in a given circle. (NOTE: Inputs already inputted.)
public class Circle { //Circle Class
    private int r; // private radius initialized.
    private Point c; //Private center initialized.
    public Circle(Point c, int r){ //New circle created based on the points given.
        this.r = r;
        this.c = c;
    }
    public Point getCenter(){ //Returns center
        return c;
    }
    public int getRadius(){ //returns radius
        return r;
    }
    public double getArea(){ //Calculates the area based on pi r squared formula. returns the result.
        return (Math.PI*r*r);
    }
    public double getCircumference(){ //Circumference formula used, 2pi*r. returns result.
        return (2*Math.PI*r);
    }
    public String toString(){ //Output method.
        return "Circle[center=(" + c + "), radius=" + r + "]";
    }
    public boolean contains(Point p){ //Boolean method to determine if point lies within circle.
        if(Point.distance(c, p)<=r){
            return true;
        }
        else{
            return false;
        }
    }
}
class Point{ //Point Class.
    private int x, y; //Two private x and y variables stored to memory.
    public Point(int x, int y){ //X and Y variables intialized.
        this.x = x;
        this.y = y;
    }
    public String toString(){ //returns points in string format.
        return x + "," + y;
    }
    public static double distance(Point a, Point b){ //Calculates distance of point and circle to determine if point is within circle.
        return Math.sqrt((a.x - b.x)*(a.x - b.x) +  (a.y - b.y)*(a.y - b.y));
    }
}
class CircleClient{ //Runs whole program.
    public static void main(String [] args){
        Point p = new Point(10,5); //places circle
        Circle c = new Circle(p,7); //gives it a radius of 7.
        System.out.println(c); //Circle class output.
        System.out.println("Area: " + c.getArea()); //Area output.
        System.out.println("Circumference: " + c.getCircumference()); //Circumference output.
        Point pp = new Point(5,7); //Point to determine if within circle.
        if(c.contains(pp)){ //checks for point status.
            System.out.println("(" + pp + ") lies within the circle"); //output 1.
        }
        else{
            System.out.println("(" + pp + ") does not lie within the circle"); //output 2.
        }
    }
}