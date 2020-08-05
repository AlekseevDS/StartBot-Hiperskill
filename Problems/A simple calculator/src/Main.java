import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long fst = scan.nextLong();
        String oper = scan.next();
        Long sec = scan.nextLong();

        switch (oper) {
            case "+":
                System.out.println(fst + sec);
                break;
            case "-":
                System.out.println(fst - sec);
                break;
            case "*":
                System.out.println(fst * sec);
                break;
            case "/":
                if (sec != 0) {
                    System.out.println(fst / sec);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}