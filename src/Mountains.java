
import java.awt.*;

/**
 * Created by student on 10/13/17.
 */
public class Mountains {

    //===============instance fields=================

    //n/a

    //==================constructor==================

    public Mountains(){

    }//end Grass

    //===================method======================

    public void draw1(Graphics2D g2){

        int x = -200;
        int y = 430;
        int mountLength = 400;
        int mountHeight = 200;

//        g2.setColor(new Color(210, 210, 210));

        //----------drawing the mountains in the middle----------

        for(int i = 0; i < 10; i++){

            //SCRAPPER WATERFALL PROJECT
//            if(i == 3){
//
//                GradientPaint gp3 = new GradientPaint(x, y - mountHeight, new Color(166, 166, 166), x, y, new Color(101, 101, 101));
//
//                g2.setPaint(gp3);
//
//                Tri tri1 = new Tri(x, y, x + mountLength, y, x + (mountLength / 2), y - mountHeight);
//                tri1.fillTri(g2);
//
////              g2.setColor(new Color(240, 240, 240));
//
//                GradientPaint gp2 = new GradientPaint(x, y - mountHeight, new Color(225, 225, 225), x, y, new Color(167, 167, 167));
//
//                g2.setPaint(gp2);
//
//                Tri tri2 = new Tri(x + mountLength / 3, y - mountHeight / 3 * 2, x + mountLength / 3 * 2, y - mountHeight / 3 * 2, x + (mountLength / 2), y - mountHeight);
//                tri2.fillTri(g2);
//
//                mountLength = (int) (Math.random() * 201 + 200);
//                mountHeight = (int) (Math.random() * 101 + 100);
//
//                //---------------------WATERFALL--------------
//
//                g2.setColor(new Color(4, 4, 4));
//
//                g2.drawOval(x + (mountLength / 2), y - (mountHeight / 4 * 3), 10, 20);
//
//                //drawing the water
//
//                GradientPaint gp4 = new GradientPaint(x, y, new Color(165, 197, 255), x, y, new Color(105, 131, 255));
//
//                g2.setPaint(gp4);
//
//                g2.fillRect(x + (mountLength / 2), y - (mountHeight / 4 * 3), 100, 100);
//
//                //tester, if black circle shows up, this works.
//
////                g2.setColor(new Color(1, 1, 1));
////
////                g2.fillRect(430, 320, 100, 100);
//
//                x = x + mountLength / 2;
//
//            }//end if
//
//            else {

                GradientPaint gp3 = new GradientPaint(x, y - mountHeight, new Color(166, 166, 166), x, y, new Color(101, 101, 101));

                g2.setPaint(gp3);

                Tri tri1 = new Tri(x, y, x + mountLength, y, x + (mountLength / 2), y - mountHeight);
                tri1.fillTri(g2);

                GradientPaint gp2 = new GradientPaint(x, y - mountHeight, new Color(225, 225, 225, 127), x, y, new Color(167, 167, 167, 127));

                g2.setPaint(gp2);

                Tri tri2 = new Tri(x + mountLength / 3, y - mountHeight / 3 * 2, x + mountLength / 3 * 2, y - mountHeight / 3 * 2, x + (mountLength / 2), y - mountHeight);
                tri2.fillTri(g2);

                x = x + mountLength / 2;

                mountLength = (int) (Math.random() * 101 + 300);
                mountHeight = (int) (Math.random() * 51 + 150);

        }//end for

    }//end draw

    public void draw2(Graphics2D g2){

        int x = -100;
        int y = 430;
        int mountLength = 200;
        int mountHeight = 75;

//        g2.setColor(new Color(210, 210, 210));

        //----------drawing the that are closest to us----------

        for(int i = 0; i < 20; i++){

            //SCRAPPER WATERFALL PROJECT
//            if(i == 3){
//
//                GradientPaint gp3 = new GradientPaint(x, y - mountHeight, new Color(166, 166, 166), x, y, new Color(101, 101, 101));
//
//                g2.setPaint(gp3);
//
//                Tri tri1 = new Tri(x, y, x + mountLength, y, x + (mountLength / 2), y - mountHeight);
//                tri1.fillTri(g2);
//
////              g2.setColor(new Color(240, 240, 240));
//
//                GradientPaint gp2 = new GradientPaint(x, y - mountHeight, new Color(225, 225, 225), x, y, new Color(167, 167, 167));
//
//                g2.setPaint(gp2);
//
//                Tri tri2 = new Tri(x + mountLength / 3, y - mountHeight / 3 * 2, x + mountLength / 3 * 2, y - mountHeight / 3 * 2, x + (mountLength / 2), y - mountHeight);
//                tri2.fillTri(g2);
//
//                mountLength = (int) (Math.random() * 201 + 200);
//                mountHeight = (int) (Math.random() * 101 + 100);
//
//                //---------------------WATERFALL--------------
//
//                g2.setColor(new Color(4, 4, 4));
//
//                g2.drawOval(x + (mountLength / 2), y - (mountHeight / 4 * 3), 10, 20);
//
//                //drawing the water
//
//                GradientPaint gp4 = new GradientPaint(x, y, new Color(165, 197, 255), x, y, new Color(105, 131, 255));
//
//                g2.setPaint(gp4);
//
//                g2.fillRect(x + (mountLength / 2), y - (mountHeight / 4 * 3), 100, 100);
//
//                //tester, if black circle shows up, this works.
//
////                g2.setColor(new Color(1, 1, 1));
////
////                g2.fillRect(430, 320, 100, 100);
//
//                x = x + mountLength / 2;
//
//            }//end if
//
//            else {

            GradientPaint gp3 = new GradientPaint(x, y - mountHeight, new Color(166, 166, 166), x, y, new Color(101, 101, 101));

            g2.setPaint(gp3);

            Tri tri1 = new Tri(x, y, x + mountLength, y, x + (mountLength / 2), y - mountHeight);
            tri1.fillTri(g2);

            GradientPaint gp2 = new GradientPaint(x, y - mountHeight, new Color(225, 225, 225), x, y, new Color(167, 167, 167));

            g2.setPaint(gp2);

            Tri tri2 = new Tri(x + mountLength / 3, y - mountHeight / 3 * 2, x + mountLength / 3 * 2, y - mountHeight / 3 * 2, x + (mountLength / 2), y - mountHeight);
            tri2.fillTri(g2);

            x = x + mountLength / 2;

            mountLength = (int) (Math.random() * 101 + 150);
            mountHeight = (int) (Math.random() * 101 + 50);

        }//end for

    }//end draw

    public void draw3(Graphics2D g2){

        int x = -400;
        int y = 430;
        int mountLength = 200;
        int mountHeight = 75;

//        g2.setColor(new Color(210, 210, 210));

        //----------drawing the mountains that are farthest away from us----------

        for(int i = 0; i < 10; i++){

            //SCRAPPER WATERFALL PROJECT
//            if(i == 3){
//
//                GradientPaint gp3 = new GradientPaint(x, y - mountHeight, new Color(166, 166, 166), x, y, new Color(101, 101, 101));
//
//                g2.setPaint(gp3);
//
//                Tri tri1 = new Tri(x, y, x + mountLength, y, x + (mountLength / 2), y - mountHeight);
//                tri1.fillTri(g2);
//
////              g2.setColor(new Color(240, 240, 240));
//
//                GradientPaint gp2 = new GradientPaint(x, y - mountHeight, new Color(225, 225, 225), x, y, new Color(167, 167, 167));
//
//                g2.setPaint(gp2);
//
//                Tri tri2 = new Tri(x + mountLength / 3, y - mountHeight / 3 * 2, x + mountLength / 3 * 2, y - mountHeight / 3 * 2, x + (mountLength / 2), y - mountHeight);
//                tri2.fillTri(g2);
//
//                mountLength = (int) (Math.random() * 201 + 200);
//                mountHeight = (int) (Math.random() * 101 + 100);
//
//                //---------------------WATERFALL--------------
//
//                g2.setColor(new Color(4, 4, 4));
//
//                g2.drawOval(x + (mountLength / 2), y - (mountHeight / 4 * 3), 10, 20);
//
//                //drawing the water
//
//                GradientPaint gp4 = new GradientPaint(x, y, new Color(165, 197, 255), x, y, new Color(105, 131, 255));
//
//                g2.setPaint(gp4);
//
//                g2.fillRect(x + (mountLength / 2), y - (mountHeight / 4 * 3), 100, 100);
//
//                //tester, if black circle shows up, this works.
//
////                g2.setColor(new Color(1, 1, 1));
////
////                g2.fillRect(430, 320, 100, 100);
//
//                x = x + mountLength / 2;
//
//            }//end if
//
//            else {

            GradientPaint gp3 = new GradientPaint(x, y - mountHeight, new Color(206, 206, 206, 200), x, y, new Color(101, 101, 101, 230));

            g2.setPaint(gp3);

            Tri tri1 = new Tri(x, y, x + mountLength, y, x + (mountLength / 2), y - mountHeight);
            tri1.fillTri(g2);

            GradientPaint gp2 = new GradientPaint(x, y - mountHeight, new Color(225, 225, 225, 200), x, y, new Color(167, 167, 167, 230));

            g2.setPaint(gp2);

            Tri tri2 = new Tri(x + mountLength / 3, y - mountHeight / 3 * 2, x + mountLength / 3 * 2, y - mountHeight / 3 * 2, x + (mountLength / 2), y - mountHeight);
            tri2.fillTri(g2);

            x = x + mountLength / 2;

            mountLength = (int) (Math.random() * 300 + 300);
            mountHeight = (int) (Math.random() * 100 + 200);

        }//end for

    }//end draw

}//end class
