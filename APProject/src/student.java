/**
 * Created by WillieShi on 4/7/2017.
*/
import java.util.*;
public class student
{
    double gpa;
    ArrayList<course> Pastcourses;
    ArrayList<course> Currentcourses;
    String name; //Firstname_Lastname

    public student(String name, double gpa, ArrayList<course> Pastcourses,ArrayList<course> Currentcourses)
    {
        this.gpa = gpa;
        this.Pastcourses = Pastcourses;
        this.Currentcourses = Currentcourses;
        this.name = name;
    }

    public double returngpa()
    {
        return gpa;
    }

    public ArrayList<course> returnPastcourses()
    {
        return Pastcourses;
    }
    public ArrayList<course> returnCurrentcourses()
    {
        return Currentcourses;
    }
    public String returnname()
    {
        return name;
    }

}
