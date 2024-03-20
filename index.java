public class index {
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';

        int[] indices = findIndices(words, x);
        System.out.print("Indices of words containing '" + x + "': [");
        for (int i = 0; i < indices.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(indices[i]);
        }
        System.out.println("]");
    }

    public static int[] findIndices(String[] words, char x) {
        int count = 0;
        for (String word : words) {
            if (word.contains(String.valueOf(x))) {
                count++;
            }
        }

        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                indices[index++] = i;
            }
        }

        return indices;
    }
}

