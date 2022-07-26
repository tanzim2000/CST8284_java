/**
 * This class shows the Sales Chief with a name, age and location.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 01.06.2022
 */
public class SalesChief extends SalesSupervisor {

	/**
	 * This portion constructs a {@code SalesChief} object without any location.
	 * @param n the name of the Sales Agent
	 * @param a the age of the Sales Agent
	 */
	public SalesChief(String n, int a) {
		super(n, a);
	}

	/**
	 * This portion constructs a {@code SalesChief} object without any location.
	 * @param n the name of the Sales Agent
	 * @param a the age of the Sales Agent
	 * @param l the location of the Sales Supervisor
	 */
	public SalesChief(String n, int a, String l) {
		super(n, a, l);
	}
	@Override
	public String toString() {  
	      return "Sales Chief [Super = " + super.toString() + " ]";
	}

}
