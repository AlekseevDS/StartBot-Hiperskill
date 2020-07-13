import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int max = 0;

        while (num != 0) {
            num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
