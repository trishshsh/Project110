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
        float C = getValue();
        return new Fahrenheit(((C*9)/5) + 32);
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + getValue() + " C";
    }
}