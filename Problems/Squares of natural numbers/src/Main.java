import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int countN = 1;
        int maxN = 1;
        if (num == maxN) {
            System.out.println(maxN);
        } else {
            while (num > maxN) {
                maxN = countN * countN;
                if (maxN <= num) {
                    System.out.println(maxN);
                }
                countN++;
            }
        }
    }
}
