import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int finish = scan.nextInt();

        for (int count = start; count <= finish; count++) {
            if (count % 3 == 0 && count % 5 != 0) {         // Fizz
                System.out.println("Fizz");
            } else if (count % 3 != 0 && count % 5 == 0) {      //Buzz
                System.out.println("Buzz");
            } else if (count % 3 == 0 && count % 5 == 0) {      //FizzBuzz
                System.out.println("FizzBuzz");
            } else {
                System.out.println(count);
            }
        }

    }
}