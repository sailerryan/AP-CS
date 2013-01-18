//Ryan Jones
//Assn2
//January 15 2013

package what;

import java.util.*;
import gpdraw.*;
import java.awt.Color;
//import java math



public class Classy
{
	static int y;
	static int x;
	static int vary;
	static int varx;
	static int z;
	static final int hey = 2 ;
	static final int sidelength = 50;
	static final int sidebig = 150;
	
public static void main (String[ ]args)
{
	DrawingTool marker;
	SketchPad poster;
	poster = new SketchPad(600,600);
	marker = new DrawingTool(poster);
        marker.home();
    for(int x = 10; x <= x; x+=5)
    		{   	
                    int soup = x;
                        //whiteout hexagon
                        marker.setColor(Color.white);
                        marker.home();
    			marker.turnRight((x/10)-5);
    			marker.up();
    			marker.forward(130);
    			marker.turnRight(90);
    			marker.forward(75);
    			marker.turnRight(180);
    			marker.down();
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
                        //inner
                        if (x >= 3241)
                        {
                            x = -10;
                        }
                        if (soup <= 360)
                        {
                                marker.setColor(Color.blue);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } else if (soup >= 361 && soup <= 720)
                        {
                                marker.setColor(Color.green);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } else if (soup >= 721 && soup <= 1080)
                        {
                                marker.setColor(Color.yellow);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } else if (soup >= 1081 && soup <= 1440)
                        {
                                marker.setColor(Color.orange);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } else if (soup >= 1441 && soup <= 1800)
                        {
                                marker.setColor(Color.red);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } else if (soup >= 1801 && soup <= 2160)
                        {
                                marker.setColor(Color.magenta);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } else if (soup >= 2161 && soup <= 2520)
                        {
                                marker.setColor(Color.pink);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } else if (soup >= 2521 && soup <= 2880)
                        {
                                marker.setColor(Color.white);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } else if (soup >= 2881 && soup <= 3240)
                        {
                                marker.setColor(Color.cyan);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } else if (soup >= 3241)
                        {
                                marker.setColor(Color.blue);
                                marker.home();
                                marker.turnRight(90 + x);
                                marker.up();
                                marker.forward(1);
                                marker.turnRight(90);
                                marker.forward(25);
                                marker.turnRight(180);
                                marker.down();
                        	marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
                		marker.turnLeft(60);
                		marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
        			marker.turnLeft(60);
        			marker.forward(sidelength);
                        } 
    			// hexagon
                        marker.setColor(Color.blue);
    			marker.home();
    			marker.turnRight(x/10);
    			marker.up();
    			marker.forward(130);
    			marker.turnRight(90);
    			marker.forward(75);
    			marker.turnRight(180);
    			marker.down();
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
    			marker.turnLeft(60);
    			marker.forward(sidebig);
                 }
}
}