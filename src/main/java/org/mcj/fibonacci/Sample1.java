package org.mcj.fibonacci;

import java.text.MessageFormat;

/**
 * Sample1.
 * 
 * 1, 1, 2, 3, 5, ..., 34, 55, 89, 144, ...
 * 
 * 
 * f(3) = f(1) + f(2)
 * f(4) = f(2) + f(3)
 * ...
 * f(n) = f(n - 2) + f(n - 1)
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
			long result = f(n++);
			long eTime = System.currentTimeMillis();
			during = (eTime - bTime) / 1000.0;
			System.out.println(MessageFormat.format("f({0}) = {1}, spend {2} seconds.", n - 1, result, during));
		}
	}
	
	/**
	 * f.
	 * 
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public static long f(int n) throws Exception {
		
		if (n < 1) {
			throw new Exception("n < 1");
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			return f(n - 2) + f(n - 1);
		}
	}

}
