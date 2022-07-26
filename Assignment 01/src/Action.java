/**
 * This is the Action Superclass class that provides a catalog of actions to be carried out in view of COVID-19 OPH protocols.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 24.06.2022
 */
public abstract class Action {
	private String description;
	public int dueYear;
	public int dueMonth;
	public int dueDay;



	/**
	 *Constructs an action without a description.
	 */
	public Action() {
		description = "";
	}

	/**
 	 * Constructs an action with a description.
 	 * @param desc the text description of the action
 	 */
	public Action(String desc) {
		description = desc;
	}
	/**
	 * All Argument Constructor
	 * @param desc the text description of the action
	 * @param dueYear the year
	 * @param dueMonth the month
	 * @param dueDay the day
	 */
	public Action(String desc, int dueYear, int dueMonth, int dueDay) {
		this(desc);
		this.dueYear = dueYear;
		this.dueMonth = dueMonth;
		this.dueDay = dueDay;
	}

/**
   Sets the description of this action.
   @param description the text description of the action
*/
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 *Determines if this action occurs on the specified date.
	 *@param dueYear the year
	 *@param dueMonth the month
	 *@param dueDay the day
	 *@return true if the action activity occurs on the specified date.
	 */
	
	public abstract boolean occursOn(int dueYear, int dueMonth, int dueDay);

	/**
	 *Converts action activity to string description.
 	 */
	@Override
	public String toString() {
		return description;
	}
}

