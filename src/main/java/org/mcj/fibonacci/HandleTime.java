package org.mcj.fibonacci;

/**
 * HandleTime.
 * 
 * @author MrCuteJacky
 * @version 1.0
 * @param <T>
 */
public abstract class HandleTime<T> {
	
	/**
	 * run.
	 * 
	 * @throws Exception 
	 */
	public void run() throws Exception {
		
		long bTime = System.currentTimeMillis();
		T result = execute();
		long eTime = System.currentTimeMillis();
		double during = (eTime - bTime) / 1000.0;
		callback(result, during + " seconds");
	}
	
	/**
	 * execute.
	 * 
	 * @return
	 * @throws Exception
	 */
	protected abstract T execute() throws Exception;
	
	/**
	 * callback.
	 * 
	 * @param result
	 * @param time
	 */
	protected abstract void callback(T result, String time);

}