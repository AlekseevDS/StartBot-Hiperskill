import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allNum = scan.nextInt();
        int maxNum = 0;

        if (allNum > 0 && allNum <= 1000) {
            while (allNum > 0) {
                int num = scan.nextInt();
                if (num % 4 == 0 && num > maxNum) {
                    maxNum = num;
                }
                allNum--;
            }
        } else {
            System.out.println("Input is bad");
        }
        System.out.println(maxNum);
    }
}
