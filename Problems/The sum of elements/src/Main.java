import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numFst = scan.nextInt();
        int numSec;
        int sum;
        if (numFst != 0) {
            numSec = scan.nextInt();
            sum = numFst + numSec;
            while (numSec != 0) {
                numSec = scan.nextInt();
                sum = sum + numSec;
            }
            System.out.println(sum);
        } else {
            System.out.println(numFst);
        }
    }
}