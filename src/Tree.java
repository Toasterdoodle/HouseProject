import java.awt.*;

//Put your name in this comment.

public class Tree {

    //===============instance fields=================

    //n/a

    //==================constructor==================

    public Tree(){

    }//end tree

    //===================method======================

    public void drawTree(Graphics g2) {

        int x = 10;
        int ydiff = 30;
        int y = 430 - ydiff;
        int rectLength = 10;
        int rectHeight = 30;
        int triHeight1 = 30;
        int triLength1 = 20;
        int triInterval = 15;
        int treeInterval = 50;
        double randomProp;//all the other ints will be divided by this double to make certain trees smaller or larger.

        for (int i = 0; i < 50; i++) {

            int randColor = (int)(Math.random() * 31 - 15);

            g2.setColor(new Color(149 + randColor, 100 + randColor, 28 + randColor));
            g2.fillRect(x, y, rectLength, rectHeight);

            g2.setColor(new Color(54 + randColor, 137 + randColor, 41 + randColor));
            Tri tri1 = new Tri(x - triLength1, y, x + (rectLength / 2), y - triHeight1, x + rectLength + triLength1, y);
            tri1.fillTri(g2);

            g2.setColor(new Color(63 + randColor, 161 + randColor, 48 + randColor));
            Tri tri2 = new Tri(x - (triLength1 - 5), y - triInterval, x + (rectLength / 2), y - triHeight1 - triInterval, x + rectLength + (triLength1 - 5), y - triInterval);
            tri2.fillTri(g2);

            g2.setColor(new Color(71 + randColor, 181 + randColor, 54 + randColor));
            Tri tri3 = new Tri(x - (triLength1 - 10), y - triInterval * 2, x + (rectLength / 2), y - triHeight1 - triInterval * 2, x + rectLength + (triLength1 - 10), y - triInterval * 2);
            tri3.fillTri(g2);

            x = x + treeInterval;

            randomProp = Math.random() * 2 + 1;

            rectLength = (int)(10 / randomProp);
            rectHeight = (int)(30 / randomProp);
            triHeight1 = (int)(30 / randomProp);
            triLength1 = (int)(20 / randomProp);
            triInterval = (int)(15 / randomProp);
            treeInterval = (int)(50 / randomProp);
            ydiff = (int)(30 / randomProp);
            y = 430 - ydiff + (int)(Math.random() * 10 - 5);

        }//end for loop

    }//end drawTree

}//end class
