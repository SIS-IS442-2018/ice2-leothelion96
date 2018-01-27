public class BubbleTea
{
    private String brand;
    private int sugarLevel;
    private boolean pearls;

    public BubbleTea(String brand, int sugarLevel, boolean pearls)
    {
        this.brand = brand;
        this.pearls = pearls;
        if (sugarLevel <= 100) {
            this.sugarLevel = sugarLevel;
        } else {
            this.sugarLevel = 100;
        }
    }
    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getSugarLevel()
    {
        return sugarLevel;
    }

    public void setSugarLevel(int sugarLevel)
    {
        this.sugarLevel = sugarLevel;
    }

    public boolean hasPearls()
    {
        return pearls;
    }

    public void setPearls(boolean pearls)
    {
        this.pearls = pearls;
    }

    public void increaseSugarLevel(int sugarValue)
    {
        int newSugarLevel = sugarLevel + sugarValue;

        if (newSugarLevel > 100) {
            sugarLevel = 100;
        } else {
            sugarLevel = newSugarLevel;
        }
    }

    public boolean isTooSweet()
    {
        return sugarLevel > 90;
    }

    public boolean isSweeterThan(BubbleTea anotherBubbleTea)
    {
        int anotherSugarLevel = anotherBubbleTea.getSugarLevel();

        return sugarLevel > anotherSugarLevel;
    }

    public String toString()
    {
        return "BubbleTea[Brand={" + brand + "},SugarLevel={" + sugarLevel + "},HasPearls={" + pearls + "}]";
    }

}
