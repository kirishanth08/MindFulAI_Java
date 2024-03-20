
public class pattern {

	public static void main(String[] args) {
		   public static void main(String[] args) {
		        int n = 4; // Number of lines
		        
		        // Loop through each row
		        for (int i = 0; i < n; i++) {
		            int num = i % 2 == 0 ? 1 : 0; // Start with 1 for even rows, 0 for odd rows
		            
		            // Loop through each column
		            for (int j = 0; j <= i; j++) {
		                System.out.print(num + " "); // Print the current number
		                num = num == 0 ? 1 : 0; // Alternate between 0 and 1
		            }
		            System.out.println(); // Move to the next line
		        }
		    }
		}
	}

}
