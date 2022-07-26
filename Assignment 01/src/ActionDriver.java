/**
 * Tests the status of the {@code Class RegularAction} if it's a subclass of {@code Action}
 * and if {@code Class RegularAction} have any extra fields or not.
 * It also checks if the constructors and method {@code occursOn()} are working properly or not.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 24.06.2022
 */
public class ActionDriver {
	public static void main(String[] args) {
		RegularAction regularAction = new RegularAction();
		@SuppressWarnings("rawtypes")
		Class regularActionClass = regularAction.getClass();
		System.out.print("RegularAction is just a subclass of Action: ");
		if (regularActionClass.getSuperclass() == Action.class) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println("Expected: true");
		System.out.print("RegularAction activities have no extra fields: ");
		if (regularActionClass.getDeclaredFields().length == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println("Expected: true");
		System.out.print("Looking at regular actions: ");
		regularAction.setDescription("Wash your hands");
		System.out.println(regularAction.toString());
		System.out.println("Expected: Wash your hands");
		System.out.println(regularAction.occursOn(0, 0, 0));
		System.out.println("Expected: true");
	}
}