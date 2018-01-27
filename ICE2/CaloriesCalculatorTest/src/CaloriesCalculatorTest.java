public class CaloriesCalculatorTest {
    public static void main(String args[]) {
        NewYearGoodie pineappleTart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);
        // b.
        System.out.println("Is Pineapple Tart more Sinful than Love Letters? " + pineappleTart.isMoreSinful(loveLetters));
        //c.
        int totalWeight = pineappleTart.getWeight() + bakKwa.getWeight() + loveLetters.getWeight();
        System.out.println("Average weight: " + totalWeight/3);
        //d.
        CaloriesCalculator cc = new CaloriesCalculator();
        cc.addNewYearGoodie(pineappleTart,2);
        cc.addNewYearGoodie(bakKwa,3);
        cc.addNewYearGoodie(loveLetters,5);
        //e.
        System.out.println("Total Calories: " + cc.getTotalCalories());
        //f.
        System.out.println("Most sinful new year goodie: " + cc.getMostSinfulGoodie());
    }
}
