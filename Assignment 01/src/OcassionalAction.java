/**
 * This is a subclass of the {@code Action} Superclass.
 * {@code Action} has a description and occurs on one or more dates.
 * A {@code OcassionalAction} activity occurs every month.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 24.06.2022
 */
public class OcassionalAction extends Action {
	/**
	 * No-Argument Constructor
	 */
	public OcassionalAction() {
		super();
	}
	/**
	 * Takes {@code description} and {@code dueDay} and puts {@code 0} for {@code dueMonth} and {@code dueYear}
	 * @param desc the text description of the action
	 * @param dueDay the day
	 */
	public OcassionalAction(String desc, int dueDay) {
		super(desc, 0, 0, dueDay);
	}
	/**
	 * All Argument Constructor
	 * @param desc the text description of the action
	 * @param dueYear the year
	 * @param dueMonth the month
	 * @param dueDay the day
	 */
	public OcassionalAction(String desc, int dueYear, int dueMonth, int dueDay) {
		super(desc, dueYear, dueMonth, dueDay);
	}
	@Override
	public boolean occursOn(int dueYear, int dueMonth, int dueDay) {
		if (dueDay == this.dueDay) {
			return true;
		}
		else {
			return false;
		}	
	}
	
}
