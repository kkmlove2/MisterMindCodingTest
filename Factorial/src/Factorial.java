public class Factorial {
	
	
	private static int factorialMethod(int n, int value) {
		if (n==1) {
			return value;
		}
		return factorialMethod(n-1, value *n);
	}
	public static int factorial(int n) {
		return factorialMethod(n,1);
	}
	 public static void main(String[] args) {
		 System.out.println(factorial(1000000));
	   }
	
}
