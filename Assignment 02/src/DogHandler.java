import java.io.IOException;
/**
 * Assignment 02 - DogHandler.java
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 21.07.2022
 */
public class DogHandler {

	public static void main(String[] args) {
		DogHandler dogHandler = new DogHandler();
		try {
			dogHandler.exceptionOne();
		} catch (Exception ex) {
			System.err.println("Error Caught:" + ex.getClass().getSimpleName() + "\n");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		try {
			dogHandler.exceptionTwo();
		} catch (Exception ex) {
			System.err.println("Error Caught:" + ex.getClass().getSimpleName() + "\n");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		try {
			dogHandler.exceptionThree();
		} catch (Exception ex) {
			System.err.println("Error Caught:" + ex.getClass().getSimpleName() + "\n");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		try {
			dogHandler.exceptionFour();
		} catch (Exception ex) {
			System.err.println("Error Caught:" + ex.getClass().getSimpleName() + "\n");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	/**
	 * Method to throw Exception {@code ExceptionDog}
	 * @throws ExceptionDog Always
	 */
	public void exceptionOne() throws ExceptionDog{
		throw new ExceptionDog();
	}
	/**
	 * Method to throw Exception {@code ExceptionPuppy}
	 * @throws ExceptionPuppy Always
	 */
	public void exceptionTwo() throws ExceptionPuppy{
		throw new ExceptionPuppy();
	}
	/**
	 * Method to throw Exception {@code NullPointerException}
	 * @throws NullPointerException Always
	 */
	public void exceptionThree() throws NullPointerException{
		throw new NullPointerException();
	}
	/**
	 * Method to throw Exception {@code IOException}
	 * @throws IOException Always
	 */
	public void exceptionFour() throws IOException{
		throw new IOException();
	}

	/**
	 * class ExceptionDog extends Exception
	 * @author Tanzim Ahmed Sagar
	 * @version 1.0
	 */
	class ExceptionDog extends Exception{}
	/**
	 * class ExceptionDog extends Exception
	 * @author Tanzim Ahmed Sagar
	 * @version 1.0
	 *
	 */
	class ExceptionPuppy extends ExceptionDog{}

}
