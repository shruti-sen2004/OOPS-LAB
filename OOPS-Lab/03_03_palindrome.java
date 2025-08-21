public class palindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class Main {
  public static void main(String args[]) {
    String input = args[0];
    if (palindrome.isPalindrome(input)) {
        System.out.println("Is a palindrome");
    } else {
        System.out.println("Is not a palindrome");
    }
  }
}