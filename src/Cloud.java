import java.awt.*;

//Put your name in this comment.

public class Cloud {

    //===============instance fields=================

    //n/a

    //==================constructor==================

    public Cloud(){

    }//end Cloud

    //===================method======================

    public void draw(Graphics2D g2){
        int gradientChange;//again, makes colors slightly random
        int ovalSize;
        int x;
        int y;

        for(int i = 0; i < 251; i++){

            x = (int)(Math.random()*1251 - 50);
            y = (int)(Math.random()*101 - 50);
            gradientChange = (int)(Math.random() * 25 + 25);
            ovalSize = (int)(Math.random() * 70 + 25);

            GradientPaint gp2 = new GradientPaint(x, y, new Color(225, 225, 225), x + ovalSize, y + ovalSize, new Color(225 - gradientChange, 225 - gradientChange, 225 - gradientChange));

            g2.setPaint(gp2);

            g2.fillOval(x, y, ovalSize, ovalSize);

        }//end for

    }//end draw

}//end class
