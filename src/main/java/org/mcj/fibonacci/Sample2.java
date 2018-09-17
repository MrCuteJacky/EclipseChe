package org.mcj.fibonacci;

import java.math.BigDecimal;
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
public class Sample2 {

	/**
	 * main.
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		int n = 1;
		double during = 0;
		while (during < 10 && n < 30) {
			long bTime = System.currentTimeMillis();
			String result = fibonacci(n++);
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
	public static String fibonacci(int n) throws Exception {
		
		if (n < 1) {
			throw new Exception("n < 1");
		} else if (n == 1) {
			return "0";
		} else if (n == 2) {
			return "1";
		} else {
			BigDecimal a = new BigDecimal(0);
			BigDecimal b = new BigDecimal(1);
			for (int i = 4; i <= n; i++) {
				BigDecimal temp = a.add(b);
				a = b;
				b = temp;
			}
			return a.add(b).toString();
		}
	}

}