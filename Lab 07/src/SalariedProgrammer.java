/**
 * <b>Lab 7</b> - {@code SalariedProgrammer.java}
 * <br>
 * {@code SalariedProgrammer} concrete class extends abstract class {@link Programmer}.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public class SalariedProgrammer extends Programmer implements Payme {
	private double weeklySalary;
	/**
	 * All argument constructor
	 * @param firstName First Name of a Programmer.
	 * @param lastName Last Name of a Programmer.
	 * @param socialSecurityNumber Social Security Number of a Programmer.
	 * @param weeklySalary Weekly Salary of a programmer.
	 * @throws IllegalArgumentException If the {@code weeklySalary} gets a value less than 0.
	 */
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber); 
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
			}
		this.weeklySalary = weeklySalary;
		}
	/**
	 * sets salary
	 * @param weeklySalary Weekly Salary of a programmer.
	 * @throws IllegalArgumentException If the {@code weeklySalary} gets a value less than 0.
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
			}
		this.weeklySalary = weeklySalary;
		}
	/**
	 * returns salary
	 * @return weeklySalary
	 */
	public double getWeeklySalary() {
		return weeklySalary;
		}
	/**
	 * calculate earnings; override {@code abstract} method earnings in {@link Programmer}
	 * @return earnings
	 */
	@Override                                                           
	public double earnings() {
		return getWeeklySalary();
		}                                             
	/**
	 * return {@code String} representation of {@link SalariedProgrammer} object
	 * @return String   
	 */
	@Override
	public String toString() {
		String Message;
		Message = "salaried programmer: " + super.getFirstName() + " " + super.getLastName() +"\n";
		Message = Message + "social security number: " + super.getSocialSecurityNumber() +"\n";
		Message = Message + "weekly salary: " + weeklySalary;
		return Message;
		}
	/**
	 * method required to carry out contract with interface {@code Payme}
	 */
	@Override
	public double getPaymentAmount() {
		return earnings();
		}
}