package polylab;

/**
 * <b>Lab 6</b> - {@code Programmer.java}
 * Programmer abstract superclass.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public abstract class Programmer  {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private Date birthDate;
	/**
	 * Constructor for Programmer
	 * @param firstName First Name of a Programmer
	 * @param lastName Last Name of a Programmer
	 * @param socialSecurityNumber Social Security Number of a Programmer
	 * @param month Birth month of a programmer
	 * @param year Birth year of a programmer
	 */
	public Programmer(String firstName, String lastName, String socialSecurityNumber, int month, int year) {
			this.firstName = firstName;                                    
			this.lastName = lastName;                                    
			this.socialSecurityNumber = socialSecurityNumber;
			birthDate = new Date(month, year);
	} 

	/**
	 * returns first name of a Programmer
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * returns last name
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * returns social security number
	 * @return socialSecurityNumber
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * returns birth date as an object
	 * @return Date
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * returns {@code String} representation of {@link Programmer} object
	 * @return String
	 */
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "birth month and year", getBirthDate());
	} 

	/**
	 * Method that calculates earnings of a programmer
	 * @return earnings
	 */
	public abstract double earnings(); 
} 


