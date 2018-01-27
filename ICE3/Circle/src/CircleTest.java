// use this to test if Circle has been written correctly
public class CircleTest{
    public static void main(String[] args){

        // create circles
        Circle c1 = new Circle(2.0, 2.0, 1.0); // creates a circle at (2.0,2.0) with r = 1.0
        Circle c2 = new Circle(0.0, 0.0, 1.5); // creates a circle at (0.0,0.0) with r = 1.5

        // print circums and areas
        System.out.println("c1's Circumference :" + c1.computeCircumference());
        System.out.println("c1's Circumference :" + c1.computeCircumference());
        System.out.println("c2's Circumference :" + c2.computeCircumference());
        System.out.println("c2's Circumference :" + c2.computeCircumference());

        // print out if they overlap
        System.out.println("Originally...");
        printIfOverlap(c1, c2);

        // increase the radius of c1 by 0.5
        c1.increaseRadius(0.5);

        // move center of c2 to (0.2, 0.3)
        c2.move(0.2, 0.3);

        // print out if they overlap
        System.out.println("After enlarging c1 and moving c2...");
        printIfOverlap(c1, c2);
    }

    // prints if 2 circles overlap or not
    private static void printIfOverlap(Circle c1, Circle c2){
        if (c1.overlapsWith(c2)){
            System.out.println("c1 and c2 overlap");
        } else {
            System.out.println("c1 and c2 do not overlap");
        }
    }
}
