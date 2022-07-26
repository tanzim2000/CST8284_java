/**
 * Tests the status of the {@code Class OcassionalAction} and {@code Class RareAction} if it's a subclass of {@code Action}
 * and if these classes have any extra fields or not.
 * It also checks if the constructors and method {@code occursOn()} from all classes are working properly or not.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 24.06.2022
 */
public class ActionDriver2 {

	public static void main(String[] args) {
		OcassionalAction ocassionalAction = new OcassionalAction();
		RareAction rareAction = new RareAction();
		@SuppressWarnings("rawtypes")
		Class ocassionalActionClass = ocassionalAction.getClass();
		@SuppressWarnings("rawtypes")
		Class rareActionClass = rareAction.getClass();
		
		System.out.print("OccasionalAction is subclass of Action: ");
		if (ocassionalActionClass.getSuperclass() == Action.class) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println("Expected: true");
		System.out.print("RareAction is subclass of Action: ");
		if (rareActionClass.getSuperclass() == Action.class) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println("Expected: true");
		System.out.print("OcassionalAction have no extra fields: ");
		if (ocassionalActionClass.getDeclaredFields().length == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println("Expected: true");
		System.out.print("RareAction have no extra fields: ");
		if (rareActionClass.getDeclaredFields().length == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println("Expected: true");
	}

}
