/**
 * Created by WillieShi on 4/7/2017.
 */
import java.util.*;
public class course
{
    int max;
    int min;
    double gpareq;
    ArrayList<Integer> periodsO = new ArrayList<Integer>();
    String name;
    course(String name, int max, int min, double gpareq, ArrayList<Integer> periodsO)
    {
        this.max = max;
        this.min = min;
        this.gpareq = gpareq;
        this.periodsO = periodsO;
        this.name = name;
    }
    public int getmax()
    {
        return max;
    }
    public int getmin()
    {
        return min;
    }
    public double getgpareq()
    {
        return gpareq;
    }
    public ArrayList<Integer> getperiodsO()
    {
        return periodsO;
    }

    public String getName()
    {
        return name;
    }

}
