package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float val = this.getValue();
        float c = (float) 5 / 9;
        val = (float) ((float) (val - 32 )* c);
        return new Celsius(val);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        float val = this.getValue();
        String s = Float.toString(val);
        return s;
    }
}
