import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mM = scan.nextInt();    //Money
        float pP = scan.nextInt();    //Percent
        int kK = scan.nextInt();    //Target
        int day = 0;
        float total = mM;

        if (kK != mM) {
            do {
                total = total + pP / 100 * total;
                day++;
            } while (total < kK);
        }

        System.out.println(day);
    }
}