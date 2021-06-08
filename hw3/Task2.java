//Name: Ernesto Aguilera
//PantherID: 002-54-2302
//Due: Feb 20th
//Title: Boom, drawing.
//Description: BOOM! drawing.
import java.awt.*; //Imports from awt utilties.
import javax.swing.JFrame; //JFrame utility.
public class Task2 extends JFrame {
    public static void main(String[] args){ //Main method
        Task2 app = new Task2(); //app variable
        app.setSize(400,400); //size of window
        app.setVisible(true); //Program shows in a visible window.
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits/ends program using exit button on the window.
    }
    public void paint(Graphics gfx){ //Colors the application elements.
        int circleNum, size = 40; //variables initialized.
        gfx.setColor(Color.cyan); //Cyan color.
        gfx.fillRect(0, 0, 400, 400);
        circleNum = 5;
        drawPiece(0,0,100,circleNum,gfx); //calls on drawing method, draws a part of the application.
        circleNum = 5;
        for(int i = 0;i<6;i++){ //for loop for the biggest square element.
            for(int j = 0;j<6;j++){
                drawPiece(135+i*size,j*size,size,circleNum,gfx); //calls on draw method and uses variables to calculate the size.
            }
        }
        size = 24; //the next few lines apply to the area under the circle.
        circleNum = 5;
        for(int i = 0; i<5; i++){
            for(int j = 0;j<5;j++){
                drawPiece(5+i*size,120+j*size,size,circleNum,gfx);
            }
        }
        size = 36; //Under the largest element.
        circleNum = 3;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                drawPiece(135+i*size, 243+j*size, size, circleNum, gfx);
            }
        }
    }
    public void drawPiece(int x, int y, int size, int circleNum, Graphics gfx){ //Draws the pieces of the application.
        y+= 40;
        x+= 10;
        gfx.setColor(Color.green); //Colors
        gfx.fillRect(x, y, size, size); //Fills the shape with color.
        gfx.setColor(Color.yellow);
        gfx.fillOval(x, y, size, size);
        gfx.setColor(Color.black);
        gfx.drawRect(x, y, size, size);
        gfx.drawLine(x, y, x+size, y+size);
        gfx.drawLine(x, y+size, x+size, y);
        gfx.drawLine(x, y+size/2, x+size, y+size/2);
        int size2 = size/circleNum;
        for(int i = 0;i<circleNum;i++){ //for statement for the circles inside the rectangles.
            gfx.drawOval(x+size2*i/2, y+size2*i/2, size-size2*i, size-size2*i);
        }
    }
}
