package polylab;
/**
 * Date class declaration.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public class Date {
	private int month; // 1-12
	private int year; // any year
	/**
	 * constructor: confirms proper value for month given the year
	 * @param month Birth month of a programmer.
	 * @param year Birth year of a programmer.
	 * @throws IllegalArgumentException If the {@code month} gets a value less than 0 or more than 12.
	 */
	public Date(int month, int year) {
		if (month <= 0 || month > 12) {	// check if month in range
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
			}
		this.month = month;
		this.year = year;
		System.out.printf("Date object constructor for date %s%n", this);
	} 


	/**
	 * get method for birthMonth
	 * @return month
	 */
	public int getDate() {
		int birthMonth = month;
		return birthMonth;
	}
	/**
	 * returns a String of the form month/year.
	 * @return dateString
	 */
	@Override
	public String toString() {
		String dateString;
		dateString = month + "/" + year;
		return dateString;
	}
}

