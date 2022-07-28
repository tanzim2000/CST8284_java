/**
 * <b>Lab 7</b> - {@code CommissionProgrammer.java}
 * <br>
 * {@code CommissionProgrammer} class extends {@link Programmer}.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public class CommissionProgrammer extends Programmer implements Payme { 
private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage

/**
 * All argument constructor with {@code commissionRate} validation
 * @param firstName First name of a programmer.
 * @param lastName Last name of a programmer.
 * @param socialSecurityNumber Social Security Number of a programmer.
 * @param grossSales Gross sales amount on the creation of apps the programmer made.
 * @param commissionRate The rate of commission a programmer getting with the {@code baseSalary}.
 * @throws IllegalArgumentException
 * <ul>
 * 	<li>If the {@code grossSales} gets a value less than 0.</li>
 * 	<li>If the {@code commissionRate} gets a value less than 0 or more than 1.</li>
 * </ul>
 */
public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
	super(firstName, lastName, socialSecurityNumber);
	if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
		throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
	if (grossSales < 0.0) { // validation
		throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
	this.grossSales = grossSales;
	this.commissionRate = commissionRate;
	}
/**
 * sets gross sales amount on the creation of apps.
 * @param grossSales Gross sales amount on the creation of apps the programmer made.
 * @throws IllegalArgumentException If the {@code grossSales} gets a value less than 0.
 */
public void setGrossSales(double grossSales) {
	if (grossSales < 0.0) { // validate
		throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
	this.grossSales = grossSales;
	}
/**
 * return gross sales amount 
 * @return grossSales
 */
public double getGrossSales() {
return grossSales;
} 

/**
 * sets commission rate
 * @param commissionRate The rate of commission a programmer getting with the {@code baseSalary}.
 * @throws IllegalArgumentException If the {@code grossSales} gets a value less than 0 or more than 1.
 */
public void setCommissionRate(double commissionRate) {
	if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
		throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
	this.commissionRate = commissionRate;
	}

/**
 * returns commission rate
 * @return commissionRate
 */
public double getCommissionRate() {
	return commissionRate;
	} 

/**
 * calculate earnings<br>override {@code abstract} method earnings in {@link Programmer}
 * @return earnings
 */
@Override
public double earnings() {                                            
	return getCommissionRate() * getGrossSales();                    
}                                             

/**
 * return {@code String} representation of {@link CommissionProgrammer} object
 * @return String
 */
@Override
public String toString() {
	String Message;
	Message = "commissioned programmer: " + super.getFirstName() + " " + super.getLastName() +"\n";
	Message = Message + "social security number: " + super.getSocialSecurityNumber() +"\n";
	Message = Message + "gross sales: $" + grossSales + "; commission rate: " + commissionRate;
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

