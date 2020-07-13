import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long numM = scan.nextLong();
        long factorial = 1;
        int nPlus = 1;

        while (factorial <= numM) {
            nPlus++;
            factorial = factorial * nPlus;
        }
        System.out.println(nPlus);

    }
}