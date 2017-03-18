import org.junit.BeforeClass;

/**
 * Created by fatimam on 18/03/2017.
 */

public class Question2
{
    //Declare variables
    int num1,num2;
    String signs;
    int total=0;

    //Default constructor
    public Question2()
    {

    }

    //Contruct Overloaded constructor

     public Question2(int num1,int num2, String signs)
    {
        this.num1=num1;
        this.num2=num2;
        this.signs=signs;
    }

    //accept integer input

    public int number1(int num1)
    {
        return num1;
    }
    public int number2(int num2)
    {
        return num2;
    }
    //input for sign
    public String sign(String signs)
    {
        return signs;
    }
    //calculate total and sign

    public int totalCalc(int value1,int value2,String value3)
    {
        if(value3.equals("+"))
            total=value1+value2;
        else if(value3.equals("-"))
            total=value1-value2;
        if(value3.equals("*"))
            total=value1*value2;
        if(value3.equals("/"))
            total=value1/value2;
        return total;
    }




}
