import java.util.Scanner;

public class sumandaverage {

		   public static void main(String[] args) {
		       Scanner sc= new Scanner(System.in); 
		       System.out.println("enter the number of values :");
		       int a = sc.nextInt();
		       int sum = 0;
		       int avg = 0;
		 
		   for(int i = 1; i <= a ; i++) {
			   System.out.println("enter the digits :");
			   int b = sc.nextInt();
               sum = sum+b;
               avg = sum/a;
		   }
		   System.out.println(" the sum :" + sum);
		   System.out.println(" the avg :"+ avg);
		   }
}
		   
		   	       
		    
		   
