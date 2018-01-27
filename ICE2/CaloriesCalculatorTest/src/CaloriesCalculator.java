import java.util.ArrayList;
public class CaloriesCalculator
{
    private ArrayList<NewYearGoodie> goodies;
    private ArrayList<Integer> quantities;

    public CaloriesCalculator()
    {
        goodies = new ArrayList();
        quantities = new ArrayList();
    }

    public void addNewYearGoodie(NewYearGoodie goodie, int quantity)
    {
        goodies.add(goodie);
        quantities.add(Integer.valueOf(quantity));
    }

    public double getTotalCalories()
    {
        double sum = 0.0D;
        for (int i = 0; i < goodies.size(); i++) {
            NewYearGoodie goodie = (NewYearGoodie)goodies.get(i);
            sum += goodie.getCalories() * ((Integer)quantities.get(i)).intValue();
        }
        return sum;
    }

    public NewYearGoodie getMostSinfulGoodie()
    {
        if (goodies.size() == 0) {
            return null;
        }
        NewYearGoodie mostSinful = (NewYearGoodie)goodies.get(0);
        for (int i = 0; i < goodies.size(); i++) {
            NewYearGoodie goodie = (NewYearGoodie)goodies.get(i);
            if (goodie.getCaloriesPerGram() > mostSinful.getCaloriesPerGram()) {
                mostSinful = goodie;
            }
        }
        return mostSinful;
    }

    public double getAverageCaloriesPerGram()
    {
        double caloriesSum = 0.0D;
        int weightSum = 0;
        for (NewYearGoodie goodie : goodies) {
            caloriesSum += goodie.getCalories();
            weightSum += goodie.getWeight();
        }
        return caloriesSum / weightSum;
    }
}
