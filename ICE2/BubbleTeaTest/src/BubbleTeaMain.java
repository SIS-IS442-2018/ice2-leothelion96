public class BubbleTeaMain {
    public static void main(String args[]) {
        BubbleTea gongCha = new BubbleTea("Gong Cha", 100, true);
        BubbleTea koi = new BubbleTea("KOI", 90, true);
        BubbleTea zhaoCha = new BubbleTea("Each-A-Cup", 80,false);

        //b. hasPearls method
        System.out.println("Does zhaoCha has Pearl? " + zhaoCha.hasPearls());

        //c. sugarlevel
        koi.increaseSugarLevel(5);
        System.out.println("KOI's sugar level is: " + koi.getSugarLevel() + "%");

        //d. Too Sweet?
        System.out.println("Is Gong Cha too sweet? " + gongCha.isTooSweet());

        //e. zhaoCha or koi sweet?
        if (zhaoCha.getSugarLevel() > koi.getSugarLevel()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
