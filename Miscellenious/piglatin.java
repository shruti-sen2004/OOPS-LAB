import java.util.Scanner;

class piglatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String piglatin = "";

        for (String word : words) {
            String pigWord = convertToPigLatin(word);
            piglatin += pigWord + " ";
        }

        System.out.println("Piglatin: " + piglatin.trim());
        sc.close();
    }

    private static String convertToPigLatin(String word) {
        int len = word.length();
        int i;
        for (i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                break;
            }
        }
        String rest = word.substring(i);
        String first = word.substring(0, i);
        return rest + first + "ay";
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}