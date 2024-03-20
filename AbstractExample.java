abstract class Addition{
	abstract void add();	
	public void sub()
	{
		System.out.println("Subraction");
	}
}
abstract class ImplementedMethod extends Addition{
	abstract void division();
	public void multipy()
	{
		System.out.println("Multiplication");
	}
}	
public class AbstractExample {
	public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.add();
        obj.sub();
        obj.multipy();
        obj.division();
    }
}
class ConcreteClass extends ImplementedMethod {
    @Override
    void add() {
        System.out.println("Addition");
    }
    @Override
    void division() {
        System.out.println("Division");
    }
	}















public class MinMaxFinder {
    public static void main(String[] args) {
        int[] A = {3, 2, 1, 56, 10000, 167};
        int n = A.length;
        
        int min = A[0]; // Assume the first element as minimum
        int max = A[0]; // Assume the first element as maximum
        
        // Iterate through the array to find minimum and maximum
        for (int i = 1; i < n; i++) {
            if (A[i] < min) {
                min = A[i]; // Update min if smaller element found
            }
            if (A[i] > max) {
                max = A[i]; // Update max if larger element found
            }
        }
        
        // Print the minimum and maximum elements
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }
}


