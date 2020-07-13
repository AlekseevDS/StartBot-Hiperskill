import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hoursMin = scan.nextInt();
        int hoursMax = scan.nextInt();
        int hoursAnn = scan.nextInt();

        if (hoursAnn < hoursMin) {
            System.out.println("Deficiency");
        } else if (hoursAnn > hoursMax) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}