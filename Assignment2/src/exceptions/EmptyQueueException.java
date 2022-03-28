package exceptions;
/**
 * EmptyQueueException
 * 
 * @author Chinedu Alake, Desmond Yuen, Hardish Chander, Jiasheng Lu
 *
 */
public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException() {
		System.out.println("The Queue is empty");
	}
}
