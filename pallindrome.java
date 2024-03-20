public class pallindrome {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aba","cfg","madam"};

        String palindrome = findFirstPalindrome(words);
        if (palindrome != null) {
            System.out.println("First palindrome word: " + palindrome);
        } else {
            System.out.println("No palindrome word found.");
        }
    }
    public static String findFirstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return null;
    }
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

