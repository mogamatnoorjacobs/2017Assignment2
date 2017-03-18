import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fatimam on 16/03/2017.
 */
public class Chapter2Question1Test {
    @Test
    public void divide() throws Exception
    {
        double result;
        Chapter2Question1 answer=new Chapter2Question1();
        result=answer.Divide();
        assertEquals(("It is Not Equal"),42.69512,result,0.02);
    }
    @Test
    public void IntergerTesting() throws Exception
    {
        int result;
        Chapter2Question1 answer=new Chapter2Question1();
        result=answer.IntergerTesting();
        assertEquals("Not Interger","1",1);
    }
    @Test
    public void name() throws Exception
    {
        String result,expected;
        Chapter2Question1 answer=new Chapter2Question1();

        result=answer.name();
        expected="Noor";
        assertEquals("Object equality failed", expected,result);
    }
    @Test
    public void surname() throws Exception
    {
        Boolean result,expected;
        Chapter2Question1 answer=new Chapter2Question1();
        Chapter2Question1 answer2=new Chapter2Question1();
        Chapter2Question1 compare=new Chapter2Question1();

        answer.surname("jacobs");
        answer2.surname("jacobs");

        result=compare.returnValue(answer.surname("jacobs"),answer2.surname("jacobs"));
        expected=true;
        assertSame(expected,result);
    }

    @Test
    public void houseNumber() throws Exception
    {
        Boolean result,expected;
        Chapter2Question1 testHouseNumber=new Chapter2Question1();

        result=testHouseNumber.houseNumber(5,6);
        assertFalse("True",result);

    }

    @Test
    public void nullness() throws Exception
    {
        String expected;
        Chapter2Question1 nullN=new Chapter2Question1();


        assertNull("Not null",nullN.Nullness("Noor"));
     }

    @Test
    public void notNullness() throws Exception
    {
        Chapter2Question1 nullN=new Chapter2Question1();
        assertNotNull("Value is a null",nullN.NotNullness("Noor"));
    }

    @Test
    public void failTest() throws Exception
    {
        Chapter2Question1 nullN=new Chapter2Question1();
        fail("Test Failed");
        nullN.NotNullness("Noor");
        assertNotNull("Value is a null",nullN.NotNullness(null));

    }


    @Test(timeout = 1000)
    public void TimeOutTest() throws Exception
    {
        Chapter2Question1 nullN=new Chapter2Question1();
        nullN.NotNullness("Noor");
        assertNotNull("Value is a null",nullN.NotNullness("Noor"));
        while(true);
    }

    @Ignore
    @Test
     public void DisablingTest()throws Exception
    {
        Chapter2Question1 nullN=new Chapter2Question1();
        nullN.NotNullness("Noor");
        assertNotNull("Value is a null",nullN.NotNullness("Noor"));
    }

     @Test
    public void arrayTest()throws Exception
     {
         Chapter2Question1 obj=new Chapter2Question1();

         int[] expected={1,2,3};

         Assert.assertArrayEquals(expected, obj.numbers());;
     }

}