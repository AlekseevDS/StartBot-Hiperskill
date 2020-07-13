import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt() + 1;
        char[] inp = new char[num2 - num1];
        word.getChars(num1, num2, inp, 0);
        System.out.println(inp);
    }
}