import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fatimam on 18/03/2017.
 */
public class Question2Test {
    @Before
    public void setUp() throws Exception
    {
        Question2 construct=new Question2();
    }

    @After
    public void tearDown() throws Exception
    {
        Question2 construct=new Question2(1,2,"+");
    }

    @Test
    public void number1() throws Exception
    {
        Question2 num1=new Question2();
        int expected = 1;

        assertEquals("Incorrect value",expected,num1.number1(1));
    }

    @Test
    public void number2() throws Exception
    {
        Question2 num2=new Question2();
        int expected = 1;

        assertEquals("Incorrect value",expected,num2.number2(1));

    }

    @Test
    public void sign() throws Exception
    {
        Question2 signs= new Question2();

        String expected="+";
        assertEquals("Incorrect value",expected,signs.sign("+"));
    }

    @Test
    public void totalCalc() throws Exception
    {
        Question2 total= new Question2();
        int expected=2;
        int result=total.totalCalc(1,1,"+");
        assertEquals(expected,result);
    }

}