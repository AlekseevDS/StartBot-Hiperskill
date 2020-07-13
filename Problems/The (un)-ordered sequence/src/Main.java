import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int preInput = scan.nextInt();
        int postInput = scan.nextInt();
        boolean countUp = false;
        boolean countDown = false;
        boolean stop = false;

        if (postInput != 0) {
            while (postInput != 0) {
                if (preInput - postInput < 0) {
                    if (!countDown) {
                        countUp = true;
                    } else {
                        stop = true;
                    }
                }
                if (preInput - postInput > 0) {
                    if (!countUp) {
                        countDown = true;
                    } else {
                        stop = true;
                    }
                }
                preInput = postInput;
                postInput = scan.nextInt();
            }
            if (stop) {
                System.out.println(false);
            } else {
                System.out.println(countUp || countDown);
            }
        } else {
            System.out.println("true");
        }
    }
}