import java.util.Scanner;

public class MinFinder {
    public static void main(String args[]) {

        System.out.print("How many numbers do you want to enter?");
        Scanner sc = new Scanner(System.in);
        int value = 0;
        int count = sc.nextInt();

        for (int i=0;i<count;i++) {
            System.out.print("Enter a number: ");
            Scanner sc1 = new Scanner(System.in);
            int num = sc1.nextInt();
            if (i==0) {
                value = num;
            }
            if (num < value) {
                value = num;
            }
                }
        System.out.print("The minimum number is " + value);
        }
    }

