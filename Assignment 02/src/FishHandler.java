/**
 * Assignment 02 - FishHandler.java
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 21.07.2022
 */
public class FishHandler {

	/**
	 * Method to throw Exception Superclass
	 * @throws Exception Always
	 */
	public void easterEnding() throws Exception {
		throw new Exception();
	}

	/**
	 * Method to catch the exception and rethrow it
	 * @throws Exception Always
	 */
	public void easterStarting() throws Exception {
		try {
			easterEnding();
		} catch (Exception exception) {
			throw exception;
		}
	}

	public static void main(String[] args) {
		FishHandler fishHandler = new FishHandler();
		try {
			fishHandler.easterStarting();
		} catch (Exception exception) {
			System.err.println("Error Caught: " + exception.getClass().getSimpleName());
			System.err.println(exception.getMessage());
			exception.printStackTrace();
		}
	}

}
