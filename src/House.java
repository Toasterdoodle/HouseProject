import java.awt.*;

//Put your name in this comment.

public class House {

    //===============instance fields=================

    private int x, y, b, c, d, e, f, g, h, j, k, l, m, n;

    //==================constructor==================

    public House(int x, int y){

        this.x = x;
        this.y = y;

        //=======x related=======

        this.b = x + 240;
        this.j = x - 240;
        this.e = x + 360;
        this.l = x - 360;
        this.n = x - 120;
        this.g = x + 120;


        //=====y related=====

        this.h = y - 80;
        this.m = y + 40;
        this.k = y + 80;
        this.f = y + 200;
        this.d = y + 160;
        this.c = y + 120;

    }//end House

    //===================method======================

    public void draw(Graphics2D g2){
        //this code draws the cardboard box.

        g2.setColor(new Color(180, 119, 25));

        g2.fillRect(x, y, 240, 160);

        g2.setColor(new Color(145, 91, 24));

        Quad quad1 = new Quad(x, d, j, k, j, h, x, y);
        quad1.fillQuad(g2);

        g2.setColor(new Color(213, 146, 25));

        Quad quad2 = new Quad(j, h, x, h, b, y, x, y);
        quad2.fillQuad(g2);

        g2.setColor(new Color(128, 75, 24));

        Quad quad3 = new Quad(l, k, j, k, x, d, n, d);
        quad3.fillQuad(g2);

        Tri tri4 = new Tri(l, m, j, m, j, k);
        tri4.fillTri(g2);

        g2.setColor(new Color(239, 169, 25));

        Tri tri1 = new Tri(b, c, e, d, b, d);
        tri1.fillTri(g2);

        Quad quad4 = new Quad(x, d, b, d, e, f, g, f);
        quad4.fillQuad(g2);

        //-------code below draws the "this side up" sign------

        g2.setColor(new Color(0, 0, 0));

        g2.fillArc(x+100, y+40, 40, 40, 0, 180);

        g2.fillRect(x+20, y+135, 20, 5);

        g2.fillRect(x+28, y+120, 4, 20);

        Tri tri2 = new Tri(x+30, y+100, x+20, y+120, x+40, y+120);
        tri2.fillTri(g2);

        g2.fillRect(x+50, y+135, 20, 5);

        g2.fillRect(x+58, y+120, 4, 20);

        Tri tri3 = new Tri(x+60, y+100, x+50, y+120, x+70, y+120);
        tri3.fillTri(g2);

        g2.setFont(new Font("Arial", Font.BOLD, 15));

        g2.drawString("THIS SIDE UP", 805, 557);

    }//end draw

}//end class
