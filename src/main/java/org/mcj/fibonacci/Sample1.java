package org.mcj.fibonacci;

import java.text.MessageFormat;

/**
 * Sample2.
 * 
 * 0, 1, 1, 2, 3, 5, ..., 34, 55, 89, 144, ...
 * 
 * 
 * fibonacci(3) = fibonacci(1) + fibonacci(2)
 * fibonacci(4) = fibonacci(2) + fibonacci(3)
 * ...
 * fibonacci(n) = fibonacci(n - 2) + fibonacci(n - 1)
 * 
 * @author MrCuteJacky
 * @version 1.0
 */
public class Sample1 {

	/**
	 * main.
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		int n = 1;
		double during = 0;
		while (during < 60) {
			long bTime = System.currentTimeMillis();
			long result = fibonacci(n++);
			long eTime = System.currentTimeMillis();
			during = (eTime - bTime) / 1000.0;
			System.out.println(MessageFormat.format("fibonacci({0}) = {1}, spend {2} seconds.", n - 1, result, during));
		}
	}
	
	/**
	 * fibonacci.
	 * 
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public static long fibonacci(int n) throws Exception {
		
		if (n < 1) {
			throw new Exception("n < 1");
		} else if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}

}