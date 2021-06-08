//Name: Ernesto Aguilera
//Date: 4/5/2021
//PantherID: 002-54-2302
//Title: YourFirstNameLine(Who knows if I should've changed that).
//Description: This program will WOW your friends as you see that there be a.... line? yeah! (note: this hurt my head).

import java.awt.*; //Gets utilities.
class Point{ //Holds point, finds distance as well.
    private int x;
    private int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        return x + "," + y;
    }
    public double distTo(Point a, Point b){
        double d = Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y)); //using sqrt we find the distance of the two points. sqrt((x1-x2)^2+(y2-y1)^2)
        return d; //returns value.
    }
}
public class YourFirstNameLine{ //lol I don't know if I had to change this to my name.
    private Point p1; //point1
    private Point p2; //point2
    public YourFirstNameLine(Point p1, Point p2){ //assigns the points.
        this.p1 = p1;
        this.p2 = p2;
    }
    public Point getStartPoint(){ //reports first point.
        return p1;
    }
    public Point getEndPoint(){ //reports second point.
        return p2;
    }
    public String toString(){ //outputs the point.
        return "[(" + p1 + "," + p2 + ")]";
    }
    public double getSlope(){ //finds slope through math.
        if(p1.getX()==p2.getX()){
            return 0;
        } else {
            return(p2.getY()-p1.getY())/(p2.getX()- p1.getX());
        }
    }
    public void draw(Graphics g){ //uses graphics utility.
        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
class FirstNameLineTest{ //Main method class.
    public static void main(String[] args){
        YourFirstNameLine line2302 = new YourFirstNameLine(new Point(2,3), new Point(0,2)); //2 points using pantherID: 2302
        DrawingPanel panel = new DrawingPanel(100,100); // creates window size.
        Graphics g = panel.getGraphics();
        line2302.draw(g); //draws the line.
    }
}