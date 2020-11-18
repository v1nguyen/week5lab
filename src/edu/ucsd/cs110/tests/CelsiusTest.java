package edu.ucsd.cs110.tests;
import edu.ucsd.cs110.temperature.Celsius;
import edu.ucsd.cs110.temperature.Temperature;
import junit.framework.TestCase;

public class CelsiusTest extends TestCase{
    private float delta = 0.001f;

    public void testCelsius(){
        float value = 12.34f;
        Celsius temp = new Celsius(value);

        assertEquals(value, temp.getValue(), delta);
    }

    public void testCelsiusToString(){
        float value = 12.34f;

        Celsius temp = new Celsius(value);
        String string = temp.toString();

        String beginning = "" + value;
        String ending = " C";

        assertEquals(value, temp.getValue(), delta);
    }

    public void testCelsiusToCelsius()
    {
        Celsius temp = new Celsius(0);
        Temperature convert = temp.toCelsius();
        assertEquals(0, convert.getValue(), delta);
    }

    public void testCelsiusToFahrenheit(){
        Celsius temp = new Celsius(0);

        Temperature convert = temp.toFahrenheit();
        assertEquals(32, convert.getValue(), delta);

        temp = new Celsius(100);
        convert = temp.toFahrenheit();

        assertEquals(212, convert.getValue(), delta);
    }
}
