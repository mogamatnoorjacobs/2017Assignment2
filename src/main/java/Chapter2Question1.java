/**
 * Created by fatimam on 16/03/2017.
 */
public class Chapter2Question1
{
    double total=0.00;
    int obj;
    int integer;

    //Testing Floating point
    public double Divide()
    {
        return total= 213.0256/5;
    }

    //testing Integers
    public int IntergerTesting()
    {
        return 1;
    }

    //Testing Object equality
public String name()
{
    return "Noor";
}
public String name2()
{
    return "Noor";
}
//Testing Object Identity
    public String surname(String sname)
    {
            return sname;
    }

    public Boolean returnValue(Object obj,Object obj2)
    {
        if(obj==obj2)
            return true;
        else
            return false;
    }

//Testing Truth
    public Boolean age(int a,int b)
    {
        boolean answer;
        if(a==b)
        return true;
        else
            return false;
    }
    //Testing false
    public Boolean houseNumber(int a,int b)
    {
        boolean answer;
        if(a!=b)
            return false;
        else
            return true;
    }


    //Testing Nullness
    public String Nullness(String nullness)
    {
        if(nullness=="")

        return null;
        else
            return "Not Null";
    }

    //Testing Nullness and failed test, Timeout, DisablingTest
    public String NotNullness(String nullness)
    {
            return nullness;
    }

    public int[] numbers()
    {
        int[] num={1,2,3};
        return num;
    }

}