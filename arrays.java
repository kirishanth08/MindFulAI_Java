public class arrays {

	public static int main(String[] args) {
		int i;
		int[] A = {3, 2, 1, 56, 10000, 167};
		int N = A.length;
		int min = A[0];
		int max = A[0];
		for( int i = 1; i < N ; i++) {
			if (A[i] < min) {
				min = A[i];
			}
			if (A[i] > max) {
				max = A[i];
			}
		}
		return (A[i]);
	}
}
