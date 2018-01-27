public class Substance
{
    private double mass;
    private double rate;

    public Substance(double paramDouble1, double paramDouble2)
    {
        mass = paramDouble1;
        rate = (1.0D - paramDouble2 / 100.0D);
    }
    public double getMass()
    {
        return mass;
    }
    public void decayOneYear()
    {
        mass *= rate;
    }
}
