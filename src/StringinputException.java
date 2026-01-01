import java.util.Scanner;

public class StringinputException {

    static void checkVowels(String str) throws Exception {
        boolean hasVowel = false;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                hasVowel = true;
                break;
            }
        }

        if (!hasVowel) {
            throw new Exception("String does not contain vowels");
        } else {
            System.out.println("String contains vowel!!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a string");
            String st = input.nextLine();
            checkVowels(st);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
