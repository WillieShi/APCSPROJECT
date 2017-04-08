/**
 * Created by WillieShi on 4/7/2017.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
public class CourseDrawer
{
    //starting pos
    private int xStart = 50;
    private int yStart = 350;

    //Schedule Loading components
    student x;
    ArrayList<course> temp;

    public CourseDrawer(student x)
    {
        this.x= x;
    }

    public void draw(Graphics g)
    {
        //course outline
        g.drawLine(xStart, yStart, xStart+500, yStart);
        g.drawLine(xStart, yStart-70, xStart+500, yStart-70);
        g.drawLine(xStart, yStart, xStart, yStart-70);
        g.drawLine(xStart+500, yStart, xStart+500,yStart-70);

        //individual divs
        for(int i = 1; i <= 6; i++)
        {
            g.drawLine(xStart+(i*70), yStart, xStart+(i*70), yStart-70);
        }

        //course names
        temp = x.Currentcourses;
        int count = 1;
        for(int i =0; i < 8; i++)
        {

            g.drawString(temp.get(i).getName(), xStart+(count*45), yStart-35);
            count++;
        }

    }

}
