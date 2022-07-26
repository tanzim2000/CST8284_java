/**
 * This class shows a Sales Supervisor with a name, age and location.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 01.06.2022
 */
public class SalesSupervisor extends SalesAgent {

	String location;

	/**
	 * This portion constructs a {@code SalesSupervisor} object without any location.
	 * @param n the name of the Sales Agent
	 * @param a the age of the Sales Agent
	 */
	public SalesSupervisor(String n, int a) {
		super(n, a);
	}
	/**
	 * This portion constructs a {@code SalesSupervisor} object with a location.
	 * @param n the name of the Sales Supervisor
	 * @param a the age of the Sales Supervisor
	 * @param l the location of the Sales Supervisor
	 */
	public SalesSupervisor(String n, int a, String l) {
		super(n, a);
		location = l;
	}
	@Override
	public String toString() {  
	      return "Sales Supervisor [Super = " + super.toString() + ", location = " + location + " ]";
	}

}
