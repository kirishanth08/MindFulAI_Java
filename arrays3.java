
public class arrays3 {
    public static void main(String[] args) {
        int[] range = {5, 6, 7, 8, 9, 10};

        System.out.print("Odd numbers: ");
        for (int num : range) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

        System.out.print("Even numbers: ");
        for (int num : range) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}

