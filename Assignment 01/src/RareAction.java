/**
 * This is a subclass of the {@code Action} Superclass.
 * {@code Action} has a description and occurs on one or more dates.
 * A {@code RareAction} activity occurs every year.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 24.06.2022
 */
public class RareAction extends Action {
	/**
	 * No-Argument Constructor
	 */
	public RareAction() {
		super();
	}
	/**
	 * Takes {@code description} {@code dueDay} {@code dueMonth} and puts {@code 0} for {@code dueYear}
	 * @param desc the text description of the action
	 * @param dueMonth the month
	 * @param dueDay the day
	 */
	public RareAction(String desc, int dueMonth, int dueDay) {
		super(desc, 0, dueMonth, dueDay);
	}
	/**
	 * All Argument Constructor
	 * @param desc the text description of the action
	 * @param dueYear the year
	 * @param dueMonth the month
	 * @param dueDay the day
	 */
	public RareAction(String desc, int dueYear, int dueMonth, int dueDay) {
		super(desc, dueYear, dueMonth, dueDay);
	}
	@Override
	public boolean occursOn(int dueYear, int dueMonth, int dueDay) {
		if (dueDay == this.dueDay && dueMonth == this.dueMonth) {
			return true;
		}
		else {
			return false;
		}
	}

	
}
