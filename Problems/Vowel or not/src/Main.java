import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char let = Character.toLowerCase(ch);
        if (let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u') {
            return true;
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
