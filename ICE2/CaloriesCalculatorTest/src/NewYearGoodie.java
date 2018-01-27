public class NewYearGoodie
{
    private String name;
    private double calories;
    private int weight;

    public NewYearGoodie(String name, double calories, int weight)
    {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    public double getCalories()
    {
        return calories;
    }

    public boolean isMoreSinful(NewYearGoodie another)
    {
        return calories - calories > 0.0D;
    }

    public double getCaloriesPerGram()
    {
        return calories / weight;
    }

    public String toString()
    {
        return "NewYearGoodie[name=" + name + ",calories=" + calories + ",weight=" + weight + "]";
    }
}
