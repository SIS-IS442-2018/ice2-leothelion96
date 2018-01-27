public class Plot
{
    private int plotNumber;
    private int length;
    private int breadth;
    private Farmer farmer;
    private Crop crop;

    public Plot(int plotNumber, int length, int breadth, Farmer farmer, Crop crop)
    {
        this.plotNumber = plotNumber;
        this.length = length;
        this.breadth = breadth;
        this.farmer = farmer;
        this.crop = crop;
    }

    public Plot(int plotNumber, int length, int breadth)
    {
        this.plotNumber = plotNumber;
        this.length = length;
        this.breadth = breadth;
    }

    public int getPlotNumber()
    {
        return plotNumber;
    }

    public int getArea()
    {
        return length * breadth;
    }

    public Farmer getFarmer()
    {
        return farmer;
    }


    public Crop getCrop()
    {
        return crop;
    }
}
