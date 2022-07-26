import java.io.IOException;
/**
 * Assignment 02 - OrderHandler.java
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 21.07.2022
 */
public class OrderHandler {

	public static void main(String[] args) {
		Exception superException = new Exception();
		IOException ioexception = new IOException();
		try {
			throw superException;
		} catch (IOException ex) {
			System.err.println("Error Caught: " + ex.getClass().getSimpleName());
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		} catch (Exception ex) {
			System.err.println("Error Caught: " + ex.getClass().getSimpleName());
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
