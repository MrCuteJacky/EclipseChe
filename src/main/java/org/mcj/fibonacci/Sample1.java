package org.mcj.fibonacci;

import java.text.MessageFormat;

/**
 * Sample2.
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

		for (int i = 1; i <= 50; i++) {
			
			final int n = i;
			
			new HandleTime<Long>() {

				@Override
				protected Long execute() throws Exception {
					return f(n);
				}

				@Override
				protected void callback(Long result, String time) {
					System.out.println(MessageFormat.format("f({0}) = {1}, spend {2}", n, result, time));
				}
				
			}.run();
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