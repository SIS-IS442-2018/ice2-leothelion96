public class RadioActiveTest {
    public static void main (String args[]) {
        System.out.println("Final Mass =  " + calculateMass(500,10,5));
    }

    public static double calculateMass (double initialMass, double rateOfDecay, int years) {
        Substance s = new Substance(initialMass, rateOfDecay);
        for (int i=0;i<years;i++){
            s.decayOneYear();
        }
        return s.getMass();
    }
}
