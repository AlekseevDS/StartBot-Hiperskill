import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1St = scan.nextInt();
        int numLst = scan.nextInt();
        int rez = 0;
        for (int count = num1St; count <= numLst; count++) {
            rez = rez + count;
        }
        System.out.println(rez);
    }
}