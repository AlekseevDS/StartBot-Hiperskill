import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        while (num != 0) {
            num = scan.nextInt();
            if (num != 0 && num % 2 == 0) {
                System.out.println("even");
            } else if (num % 2 != 0) {
                System.out.println("odd");
            }
        }
    }
}