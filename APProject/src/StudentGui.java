/**
 * Created by WillieShi on 4/7/2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class StudentGui extends JFrame
{
    Container contents;

    //GUI components
    private JButton add,delete,trackreqs;
    private ImageIcon studentphoto;
    private JLabel studentname;
    private CourseDrawer courseDrawer;


    //test student
    ArrayList<course> Past = new ArrayList<>();
    ArrayList<course> current = new ArrayList<>();
    ArrayList<Integer> bob2 = new ArrayList<>();



    public StudentGui()
    {

        super("Student Course Scheduler");
        contents = getContentPane();
        contents.setLayout(new FlowLayout());

        add = new JButton("Add new Course");
        contents.add(add);
        delete = new JButton("delete course");
        contents.add(delete);
        trackreqs = new JButton("track reqs");
        contents.add(trackreqs);

        course x = new course("math", 5, 10, 10.0, bob2 );
        course y = new course("english", 5, 10,10.0, bob2);
        student bob = new student("bob", 4.0, Past, current );
        current.add(x);
        current.add(y);

        courseDrawer = new CourseDrawer(bob);



    }

    public void paint( Graphics g )
    {

        super.paint( g );
        courseDrawer.draw( g );
    }



}
