import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int treeD = scanner.nextInt();
        int num1 = treeD / 100;
        int num2 = treeD / 10 % 10;
        int num3 = treeD % 100 % 10;

        if (num3 != 0) {
            System.out.print(num3);
        }
        if (num3 == 0 && num2 != 0) {
            System.out.print(num2);
        } else if (num3 != 0) {
            System.out.print(num2);
        }
        System.out.print(num1);
    }
}
