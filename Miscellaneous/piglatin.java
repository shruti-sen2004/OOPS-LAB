import java.util.Scanner;

//METHOD 1
class piglatin_m1 {
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
        int i;
        for (i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                break;
            }
        }
        String rest = word.substring(i);
        String first = word.substring(0, i);
        return rest + first + "ay";
    }
}

//METHOD 2
class piglatin_m2{
    public static String topiglatin(String word){
        if (word == null || word.length() == 0) {
            return word;
        }
        word = word.toLowerCase();
        String vowels= "aeiou";
        int firstVowelIndex = -1;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                firstVowelIndex = i;
                break;
            }
        }
        if (firstVowelIndex == -1) {
            return word + "ay";
        }
        
        String result = word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(topiglatin("king"));
        System.out.println(topiglatin("hlleo"));
    }
}
