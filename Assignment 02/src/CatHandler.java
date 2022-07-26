/**
 * Assignment 02 - CatHandler.java
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 21.07.2022
 */
public class CatHandler {

	public static void main(String[] args) {
		CatHandler catHandler = new CatHandler();
		try {
			catHandler.exceptionTwo();
		} catch (ExceptionOne exOne) {
			System.err.println("Error Caught:" + exOne.getClass().getName());
			System.err.println(exOne.getMessage());
			exOne.printStackTrace();
		}
		try {
			catHandler.exceptionThree();
		} catch (ExceptionOne exOne) {
			System.err.println("Error Type:" + exOne.getClass().getName());
			System.err.println(exOne.getMessage());
			exOne.printStackTrace();
		}
	}
	/**
	 * Method to throw Exception {@code ExceptionTwo}
	 * @throws ExceptionTwo Always
	 */
	public void exceptionTwo() throws ExceptionTwo {
		throw new ExceptionTwo();
		
	}
	/**
	 * Method to throw Exception {@code ExceptionThree}
	 * @throws ExceptionThree Always
	 */
	public void exceptionThree() throws ExceptionThree {
		throw new ExceptionThree();
	}

}
/**
 * class ExceptionOne extends Exception
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 */
class ExceptionOne extends Exception {
}
/**
 * class ExceptionTwo extends ExceptionOne
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 */
class ExceptionTwo extends ExceptionOne {
}
/**
 * class ExceptionThree extends ExceptionTwo
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 */
class ExceptionThree extends ExceptionTwo {
}