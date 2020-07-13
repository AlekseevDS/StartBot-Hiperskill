import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char simb = str.charAt(0);
        char simbJ = 'j';
        simb = Character.toLowerCase(simb);
        System.out.println(simb == simbJ);

    }
}