package com.stayasleep.ch01;
import javax.swing.JApplet;//all applets use this class
import java.awt.Graphics; //use the class Graphics, many applets use this package

//an example of inheritance
public class HappyFace extends JApplet{

    //specifies what graphics are drawn in the applet
    public void paint(Graphics canvas){
        //tells java to apply the default drawing ops to this applet
        super.paint(canvas);
        //outline of face
        canvas.drawOval(100,50,200,200);
        //next two lines draw the eyes
        canvas.fillOval(155,100,10,20);
        canvas.fillOval(230,100,10,20);
        //some smiley boi
        canvas.drawArc(150,160,100,50,180,180);
    }
}
