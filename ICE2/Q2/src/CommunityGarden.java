import java.util.ArrayList;

public class CommunityGarden
{
    private String name;
    private ArrayList<Plot> plots = new ArrayList();

    public CommunityGarden(String name)
    {
        if (name.equals("Duke Garden")) {
            this.name = name;

            plots.add(new Plot(1, 120, 160, new Farmer("Amy", 'F'), new Crop("Sunflower", 'F')));
            plots.add(new Plot(2, 150, 120, new Farmer("Bill", 'M'), new Crop("Portulaca", 'F')));
            plots.add(new Plot(3, 50, 80, new Farmer("Henny", 'F'), null));
            plots.add(new Plot(4, 60, 80));
            plots.add(new Plot(5, 100, 125, new Farmer("Gloria", 'F'), new Crop("Cabbage", 'V')));
            plots.add(new Plot(6, 20, 125, new Farmer("Zac", 'M'), new Crop("Cabbage", 'V')));
            plots.add(new Plot(7, 20, 125, new Farmer("Duke", 'M'), new Crop("Cucumber", 'V')));
            plots.add(new Plot(8, 40, 60));
        }
    }

    public void addPlot(int length, int breadth)
    {
        plots.add(new Plot(plots.size() + 1, length, breadth));
    }

    public int getNumPlotsWithAreaGreaterOrEqualTo(int specifiedArea)
    {
        int count = 0;
        for (Plot plot : plots) {
            if (plot.getArea() >= specifiedArea) {
                count++;
            }
        }
        return count;
    }

    public int getTotalPlots()
    {
        return plots.size();
    }

    public Plot getPlot(int plotNumber)
    {
        if ((plotNumber < 1) || (plotNumber > plots.size())) {
            return null;
        }

        return (Plot)plots.get(plotNumber - 1);
    }
}
