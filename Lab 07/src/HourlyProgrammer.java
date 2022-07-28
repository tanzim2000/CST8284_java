/**
 * <b>Lab 7</b> - {@code CommissionProgrammer.java}
 * <br>
 * {@code HourlyProgrammer} class extends {@link Programmer}.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public class HourlyProgrammer extends Programmer implements Payme {
private double wage; // wage per hour
private double hours; // hours worked for week

	/**
	 * All argument constructor with {@code commissionRate} validation
	 * @param firstName First name of a programmer.
	 * @param lastName Last name of a programmer.
	 * @param socialSecurityNumber Social Security Number of a programmer.
	 * @param wage Hourly wage of a programmer.
	 * @param hours Total hours the programmer worked.
	 * 
	 * @throws IllegalArgumentException
	 * <ul>
	 * 	<li>If the {@code wage} gets a value less than 0.</li>
	 * 	<li>If the {@code hour} gets a value less than 0 or more than 168.</li>
	 * </ul>
	 */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		if (wage < 0.0) { // validating wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
			}
		if ((hours < 0.0) || (hours > 168.0)) { // validating hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
			}
		this.wage = wage;
		this.hours = hours;
		}
	/**
	 * sets wage
	 * @param wage Hourly wage of a programmer
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
	 * set hours worked
	 * @param hours Total hours the programmer worked.
	 * @throws IllegalArgumentException If the {@code hour} gets a value less than 0 or more than 168.
	 */
public void setHours(double hours) {
	if ((hours < 0.0) || (hours > 168.0)) { // validating hours
		throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
	}
	this.hours = hours;
} 

/**
 * return hours worked
 * @return hours
 */
public double getHours() {
	return hours;
}

/**
 * calculate earnings<br>override <b>{@code abstract}</b> method earnings in {@link Programmer}
 * @return earnings
 */
@Override                                                           
public double earnings() {
	if (getHours() <= 40) { // no overtime
		return getWage() * getHours();
		}
	else {
		return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}                                          

/**
 * return {@code String} representation of {@link HourlyProgrammer} object
 * @return String              
 */
@Override
public String toString() {
	String Message;
	Message = "hourly programmer: " + super.getFirstName() + " " + super.getLastName() +"\n";
	Message = Message + "social security number: " + super.getSocialSecurityNumber() +"\n";
	Message = Message + "hourly wage: $" + wage + "; hours worked: " + hours;
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

