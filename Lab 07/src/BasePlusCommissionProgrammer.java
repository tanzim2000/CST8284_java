/**
 * <b>Lab 7</b> - {@code BasePlusCommissionProgrammer.java}
 * <br>
 * {@code BasePlusCommissionProgrammer} class extends {@link CommissionProgrammer}.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer implements Payme { 
	private double baseSalary; // base salary per week

	/**
	 * All argument constructor with {@code baseSalary} validation
	 * @param firstName First name of a programmer.
	 * @param lastName Last name of a programmer.
	 * @param socialSecurityNumber Social Security Number of a programmer.
	 * @param grossSales Gross sales amount on the creation of apps the programmer made.
	 * @param commissionRate The rate of commission a programmer getting with the {@code baseSalary}.
	 * @param baseSalary Minimum salary of a programmer.
	 * @throws IllegalArgumentException If the {@code baseSalary} gets a value less than 0.
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
			}
		this.baseSalary = baseSalary;
		}

	/**
	 * sets base salary
	 * The default implementation will take a {@code double} as an argument
	 * and set that value as {@code baseSalary}. If the argument is less then or equal 0,
	 * it'll throw an {@code IllegalArgumentException}
	 * @param baseSalary Minimum salary of a programmer.
	 * @throws IllegalArgumentException If {@code baseSalary} is less then or equal 0
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
			}
		this.baseSalary = baseSalary;
		}
	/**
	 * return base salary
	 * @return baseSalary
	 */
	public double getBaseSalary() {
		return baseSalary;
		}
	/**
	 * override method earnings in {@code CommissionProgrammer}
	 * @return earnings
	 */
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
		}

	/**
	 * return {@code String} representation of {@link BasePlusCommissionProgrammer} object
	 * @return String
	 */
	@Override
	public String toString() {
		String Message;
		Message = "base-salaried commission programmer: " + super.getFirstName() + " " + super.getLastName() +"\n";
		Message = Message + "social security number: " + super.getSocialSecurityNumber() +"\n";
		Message = Message + "gross sales: $" + super.getGrossSales() + "; commission rate: " + super.getCommissionRate() + "; base salary: $" + baseSalary;
		return Message;
		}
	}