import org.junit.Assert;
import org.junit.Test;

public class divisionUnitTest {
    division tester = new division();

    @Test
    //Test the basic function
    public void divideBasicTest(){
        double givenAnswer;

        //Try catches will be used to handle dividing by zero
        try {
            givenAnswer = tester.divide("5/5");
            Assert.assertEquals(1, givenAnswer, 0);
        } catch (Exception e) {
            Assert.assertEquals(true, false);
        }
    }

    @Test
    //Test what happens if spaces are in the equation
    public void divideSpaceTest(){
        double givenAnswer;

        //Try catches will be used to handle dividing by zero
        try {
            givenAnswer = tester.divide(" 5 / 5 ");
            Assert.assertEquals(1, givenAnswer, 0);
        } catch (Exception e) {
            Assert.assertEquals(true, false);
        }
    }

    @Test
    //Test what happens if spaces are in the equation
    public void divideZeroTest(){
        double givenAnswer;

        //Try catches will be used to handle dividing by zero
        try {
            givenAnswer = tester.divide("5/0");
            Assert.assertEquals(true, false); // If the error handling works, this line of code should never be reached
        } catch (Exception e) {
            Assert.assertEquals(true, true); // If error handling works it will redirect here.
        }
    }

    @Test
    //Test what happens if negatives are in the equation
    public void divideNegativeTest(){
        double givenAnswer;

        //Try catches will be used to handle dividing by zero
        try {
            givenAnswer = tester.divide("-5/5");
            Assert.assertEquals(-1, givenAnswer, 0);
        } catch (Exception e) {
            Assert.assertEquals(true, false);
        }
    }

    @Test
    //Test what happens if doubles are in the equation
    public void divideDecimalsTest(){
        double givenAnswer;

        //Try catches will be used to handle dividing by zero
        try {
            givenAnswer = tester.divide("4.5/2.5");
            Assert.assertEquals(1.8, givenAnswer, 0);
        } catch (Exception e) {
            Assert.assertEquals(true, false);
        }
    }
}
