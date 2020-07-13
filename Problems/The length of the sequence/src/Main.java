import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int length = 0;

        num = scan.nextInt();
        if (num != 0) {
            do {
                num = scan.nextInt();
                length++;
            } while (num != 0);
        }

        System.out.println(length);
    }
}