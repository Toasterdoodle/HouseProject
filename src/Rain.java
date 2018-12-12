import java.awt.*;

//Put your name in this comment.

public class Rain {

    //===============instance fields=================

    //n/a

    //==================constructor==================

    public Rain(){

    }//end Grass

    //===================method======================

    public void draw(Graphics2D g2){

        int random;//makes color slightly random
        int change;

        g2.setStroke(new BasicStroke(1));

        for(int i = 0; i < 2000; i++){

            int x = (int)(Math.random()*1201);
            int y = (int)(Math.random()*(500));
            random = (int)(Math.random()* 50 - 25);
            change = (int)(Math.random() * 10 + 5);

            g2.setColor(new Color(148 + random, 176 + random, 188 + random, 150));

            g2.drawLine(x, y, x - change, y + (2 * change));

        }//end for

    }//end draw

}//end class
