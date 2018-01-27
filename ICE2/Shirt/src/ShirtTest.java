public class ShirtTest {
    public static void main(String args[]) {
        Shirt shirt1 = new Shirt('R', 85.50,"Giordano");
        Shirt shirt2 = new Shirt('B',90.40, "Giordano");
        Shirt shirt3 = new Shirt('G', 77.60);
        System.out.println("Is shirt 1 same brand as shirt 2? " + shirt1.isSameBrand(shirt2));
        System.out.println("Is shirt 2 same brand as shirt 3? " + shirt2.isSameBrand(shirt3));
        shirt2.setColour('R');
        System.out.println("Shirt 2's colour : " + shirt2.getColour());
    }
}
