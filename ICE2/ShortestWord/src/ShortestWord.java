import java.util.Scanner;
public class ShortestWord {
    public static void main (String args[]) {
        System.out.print("Enter number of words: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        String w1 ="";

        for (int i=0;i<value;i++) {
            System.out.print("Enter Word: ");
            Scanner sc1 = new Scanner(System.in);
            if (i==0) {
                w1 = sc1.nextLine();

            }

                if (i > 0) {
                String w2 = sc1.nextLine();
                    if (w2.length() < w1.length()) {
                        w1 = w2;

                    } else {
                    }
                }
        }
        System.out.println(w1);
    }
}
