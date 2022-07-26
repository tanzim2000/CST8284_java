/**
 * This is a subclass of the {@code Action} Superclass.
 * {@code Action} has a description (for example, "Wash your hands") and occurs on one or more dates.
 * A {@code RegularAction} activity occurs every day.
 *
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 24.06.2022
 */

public class RegularAction extends Action {
	/**
	 * No-Argument Constructor
	 */
	public RegularAction() {
		super();
	}
	/**
	 * initiates the {@code description}
	 * @param desc the text description of the action
	 */
	public RegularAction(String desc) {
		super(desc);
	}
	/**
	 * All Argument Constructor
	 * @param desc the text description of the action
	 * @param dueYear the year
	 * @param dueMonth the month
	 * @param dueDay the day
	 */
	public RegularAction(String desc, int dueYear, int dueMonth, int dueDay) {
		super(desc, dueYear, dueMonth, dueDay);
	}
	@Override
	public boolean occursOn(int dueYear, int dueMonth, int dueDay) {
		return true;
	}	
}

