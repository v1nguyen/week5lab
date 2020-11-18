package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float val = this.getValue();
        val = (float) (val * 1.8 + 32);
        return new Fahrenheit(val);
    }

    public String toString()
    {
        // TODO: Complete this method
        float val = this.getValue();
        String s = Float.toString(val);
        s = s + " C";
        return s;
    }
}
