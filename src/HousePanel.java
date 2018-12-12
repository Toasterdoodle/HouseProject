import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *

  ██████╗ █████╗ ██████╗ ██████╗ ██████╗  ██████╗  █████╗ ██████╗ ██████╗       ██████╗  ██████╗ ██╗  ██╗     ██╗████████╗███╗   ███╗██╗
 ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔═══██╗██╔══██╗██╔══██╗██╔══██╗      ██╔══██╗██╔═══██╗╚██╗██╔╝    ██╔╝╚══██╔══╝████╗ ████║╚██╗
 ██║     ███████║██████╔╝██║  ██║██████╔╝██║   ██║███████║██████╔╝██║  ██║█████╗██████╔╝██║   ██║ ╚███╔╝     ██║    ██║   ██╔████╔██║ ██║
 ██║     ██╔══██║██╔══██╗██║  ██║██╔══██╗██║   ██║██╔══██║██╔══██╗██║  ██║╚════╝██╔══██╗██║   ██║ ██╔██╗     ██║    ██║   ██║╚██╔╝██║ ██║
 ╚██████╗██║  ██║██║  ██║██████╔╝██████╔╝╚██████╔╝██║  ██║██║  ██║██████╔╝      ██████╔╝╚██████╔╝██╔╝ ██╗    ╚██╗   ██║   ██║ ╚═╝ ██║██╔╝
  ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝       ╚═════╝  ╚═════╝ ╚═╝  ╚═╝     ╚═╝   ╚═╝   ╚═╝     ╚═╝╚═╝

 ██╗   ██╗███████╗██████╗ ███████╗██╗ ██████╗ ███╗   ██╗     ██╗    ██████╗
 ██║   ██║██╔════╝██╔══██╗██╔════╝██║██╔═══██╗████╗  ██║    ███║   ██╔═████╗
 ██║   ██║█████╗  ██████╔╝███████╗██║██║   ██║██╔██╗ ██║    ╚██║   ██║██╔██║
 ╚██╗ ██╔╝██╔══╝  ██╔══██╗╚════██║██║██║   ██║██║╚██╗██║     ██║   ████╔╝██║
  ╚████╔╝ ███████╗██║  ██║███████║██║╚██████╔╝██║ ╚████║     ██║██╗╚██████╔╝
   ╚═══╝  ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝ ╚═════╝ ╚═╝  ╚═══╝     ╚═╝╚═╝ ╚═════╝

 */

/**
 * Created by BOXMAN on 10/2/17.
 */

public class HousePanel extends JPanel{

    //---------------timer-----------------

    private int delay = 50;

    public HousePanel(int width, int height){
        setSize(width,height);

        ActionListener taskPerformer = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                //repaint();

            }//end actionPerformed
        };
        new Timer(delay, taskPerformer).start();


        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + ", " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

                repaint();

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }//end HousePanel

    //----------------Paint Component!!------------------

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //============background=============

        //--------sky--------
        GradientPaint gp = new GradientPaint(0, 0, new Color(88, 107, 159), 0, 430, new Color(109, 163, 223));
        g2.setPaint(gp);
        g2.fillRect(0, 0, getWidth(), getHeight());
        //-------------------

        //----------------mountains-----------
        Mountains mount1 = new Mountains();
        mount1.draw3(g2);
        mount1.draw1(g2);
        mount1.draw2(g2);
        //-------------------------------

        //-------------------rain-------------------
        Rain rain1 = new Rain();
        rain1.draw(g2);
        //------------------------------------------

        //-------------------ground------------------
        GradientPaint gp2 = new GradientPaint(0 ,300, new Color(172, 196, 119), 0, 800, new Color(85, 196, 22));
        g2.setPaint(gp2);
        g2.fillRect(0, 430, getWidth(), getHeight()-430);
        //-------------------------------------------

        //==============foreground==============

        //----------grass------------
        Grass grass1 = new Grass();
        grass1.draw(g2);
        //---------------------------

        //---------------trees-----------
        Tree tree1 = new Tree();
        tree1.drawTree(g2);
        tree1.drawTree(g2);
        tree1.drawTree(g2);
        //-------------------------------

        //-------------house (box)----------
        House gloriousHouse = new House(800, 540);
        gloriousHouse.draw(g2);
        //--------------------------------

        //draws grass on the border of the house
        grass1.borderOfHouse(g2);

        //---------clouds--------
        Cloud cloud1 = new Cloud();
        cloud1.draw(g2);
        //-----------------------

//        g2.setColor(new Color(180, 119, 25));
//
//        g2.fillRect(710, 400, 240, 160);
//
//        g2.setColor(new Color(145, 91, 24));
//
//        Quad quad1 = new Quad(710, 560, 460, 500, 460, 340, 710, 400);
//        quad1.fillQuad(g2);
//
//        g2.setColor(new Color(213, 146, 25));
//
//        Quad quad2 = new Quad(460, 340, 690, 340, 950, 400, 710, 400);
//        quad2.fillQuad(g2);
//
//        g2.setColor(new Color(128, 75, 24));
//
//        Quad quad3 = new Quad(460, 500, 710, 560, 590, 560, 340, 500);
//        quad3.fillQuad(g2);
//
//        g2.setColor(new Color(239, 169, 25));
//
//        Tri tri1 = new Tri(950, 520, 1070, 560, 950, 560);
//        tri1.fillTri(g2);
//
//        g2.setColor(new Color(23, 23, 23));
//
//        g2.fillArc(810, 440, 40, 40, 0, 180);
//
//        g2.setColor(new Color(0, 0, 0));
//
//        int x = 0;
//
//        g2.fillRect(730, 535, 20, 5);
//
//        g2.fillRect(738, 520, 4, 20);
//
//        Tri tri2 = new Tri(740, 500, 730, 520, 750, 520);
//        tri2.fillTri(g2);
//
//        g2.fillRect(760, 535, 20, 5);
//
//        g2.fillRect(768, 520, 4, 20);
//
//        Tri tri3 = new Tri(770, 500, 760, 520, 780, 520);
//        tri3.fillTri(g2);

        //------Bob Ross!------
        g2.setColor(new Color(27, 27, 27));
        String bobross = new String("Bob Ross");
        g2.setFont(new Font("James Fajardo", Font.LAYOUT_LEFT_TO_RIGHT, 40));
        g2.drawString(bobross, 20, 50);
        //-----------------------


    }//end paintComponent

}//end class