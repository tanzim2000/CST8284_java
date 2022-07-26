package polylab;

public class ActionProgrammer extends Programmer {

	private double wage;
	private int pieces;

	/**
	 * All argument constructor
	 * @param firstName First Name of a Programmer.
	 * @param lastName Last Name of a Programmer.
	 * @param socialSecurityNumber Social Security Number of a Programmer.
	 * @param month Birth month of a programmer.
	 * @param year Birth year of a programmer.
	 * @param pieces The number of software a programmer built
	 * @param wage Payment for each program construction
	 */
	public ActionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, int pieces, int wage) {
		super(firstName, lastName, socialSecurityNumber, month, year);
		this.pieces = pieces;
		this.wage = wage;
	}
	/**
	 * sets wage
	 * @param wage Payment for each program construction
	 * @throws IllegalArgumentException If the argument is less than 0
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
			}
		this.wage = wage;
		}

	/**
	 * returns wage
	 * @return wage
	 */
	public double getWage() {
		return wage;
	}
	/**
	 * Method that calculates earnings of a programmer
	 * @return earnings
	 */
	@Override
	public double earnings() {
		return pieces * wage;
	}

	/**
	 * return {@code String} representation of {@link CommissionProgrammer} object
	 * @return String
	 */
	@Override
	public String toString() {
		String Message;
		Message = "Action programmer: " + super.getFirstName() + " " + super.getLastName() +"\n";
		Message = Message + "social security number: " + super.getSocialSecurityNumber() +"\n";
		Message = Message + "birth month and year: " + super.getBirthDate() +"\n";
		Message = Message + "wage: $" + wage + "; Program built: " + pieces;
		return Message;
		}

}
