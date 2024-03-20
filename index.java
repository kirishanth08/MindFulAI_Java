import java.util.ArrayList;
import java.util.List;
public class index {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};

        List<Integer> indexes = findWordsWithA(words);
        if (!indexes.isEmpty()) {
            System.out.println("Indexes of words containing 'a': " + indexes);
        } else {
            System.out.println("No words containing 'a' found.");
        }
    }

    public static List<Integer> findWordsWithA(String[] words) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("a")) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}

