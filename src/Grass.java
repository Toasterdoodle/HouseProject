import java.awt.*;

//Put your name in this comment.

public class Grass {

    //===============instance fields=================

    //n/a

    //==================constructor==================

    public Grass(){

    }//end Grass

    //===================method======================

    public void draw(Graphics2D g2){
        int gRandom;//controls color (makes it slightly random)

        for(int i = 0; i < 25001; i++){

            int x = (int)(Math.random()*1201);
            int y = (int)(Math.random()*(370)+430);
            gRandom = 149 + (int)(Math.random()* 50 - 25);

            g2.setColor(new Color(40, gRandom, 24));

            g2.setStroke(new BasicStroke((int)(Math.random()*3 + 1)));

            g2.drawLine(x, y, x + (2 - (int)(Math.random()*5)), y-(int)(Math.random()*20+10));

        }//end for

    }//end draw

    public void borderOfHouse(Graphics2D g2){
        //this code is designed to draw grass on the border of my box to give it a more 3d feel.

        int x, y;
        x = 430;
        y = x/3 + 435;
        int gRandom;

        for(int i = 0; i < 25; i++){

            gRandom = 149 + (int)(Math.random()* 50 - 25);

            g2.setColor(new Color(40, gRandom, 24));

            g2.setStroke(new BasicStroke((int)(Math.random()*3 + 1)));

            g2.drawLine(x, y, x + (2 - (int)(Math.random()*5)), y-(int)(Math.random()*20+10));

            x = x + 5;
            y = x/3 + 435;

        }//end for

        x = 430;
        y = x/3 + 475;

        for(int i = 0; i < 50; i++){

            gRandom = 149 + (int)(Math.random()* 50 - 25);

            g2.setColor(new Color(40, gRandom, 24));

            g2.setStroke(new BasicStroke((int)(Math.random()*3 + 1)));

            g2.drawLine(x, y, x + (2 - (int)(Math.random()*5)), y-(int)(Math.random()*20+10));

            x = x + 5;
            y = x/3 + 480;

        }//end for

        x = 680;
        y = 700;

        for(int i = 0; i < 25; i++){

            gRandom = 149 + (int)(Math.random()* 50 - 25);

            g2.setColor(new Color(40, gRandom, 24));

            g2.setStroke(new BasicStroke((int)(Math.random()*3 + 1)));

            g2.drawLine(x, y, x + (2 - (int)(Math.random()*5)), y-(int)(Math.random()*20+10));

            x = x + 5;

        }//end for

        x = 800;
        y = x/3 + 435;

        for(int i = 0; i < 25; i++){

            gRandom = 149 + (int)(Math.random()* 50 - 25);

            g2.setColor(new Color(40, gRandom, 24));

            g2.setStroke(new BasicStroke((int)(Math.random()*3 + 1)));

            g2.drawLine(x, y, x + (2 - (int)(Math.random()*5)), y-(int)(Math.random()*20+10));

            x = x + 5;
            y = x/3 + 435;

        }//end for

        x = 920;
        y = 745;

        for(int i = 0; i < 50; i++){

            gRandom = 149 + (int)(Math.random()* 50 - 25);

            g2.setColor(new Color(40, gRandom, 24));

            g2.setStroke(new BasicStroke((int)(Math.random()*3 + 1)));

            g2.drawLine(x, y, x + (2 - (int)(Math.random()*5)), y-(int)(Math.random()*20+10));

            x = x + 5;

        }//end for

        x = 1040;
        y = 700;

        for(int i = 0; i < 25; i++){

            gRandom = 149 + (int)(Math.random()* 50 - 25);

            g2.setColor(new Color(40, gRandom, 24));

            g2.setStroke(new BasicStroke((int)(Math.random()*3 + 1)));

            g2.drawLine(x, y, x + (2 - (int)(Math.random()*5)), y-(int)(Math.random()*20+10));

            x = x + 5;

        }//end for

    }//end borderOfHouse

}//end class
