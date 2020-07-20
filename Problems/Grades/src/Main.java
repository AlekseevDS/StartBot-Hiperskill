import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stud = scan.nextInt();
        int grD = 0;
        int grC = 0;
        int grB = 0;
        int grA = 0;
        for (int count = stud; count > 0;count--) {
            int grad = scan.nextInt();
            switch (grad){
                case 2: grD++;
                break;
                case 3: grC++;
                break;
                case 4: grB++;
                break;
                case 5: grA++;
                break;
                default:
                break;
            }
        }
        System.out.println(grD + " " + grC + " " + grB + " " + grA);
    }
}