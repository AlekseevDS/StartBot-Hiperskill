import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int stop = 0;
        for (int countFst = 1; countFst <= num && stop < num; countFst++) {
            for (int countSec = countFst; countSec > 0 && stop < num; countSec--) {
                System.out.print(countFst + " ");
                stop++;
            }
        }
    }
}