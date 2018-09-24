package imperative.logic;

public class Super_Digit {
	
	private static long digitSum(long n) {
		   return n == 0 ? 0 : n % 10 + digitSum(n/10);
	}
	
	public static long superDigit(long n) {
		return Long.toString(n).length() == 1 ? n : superDigit(digitSum(n));
	}
}
