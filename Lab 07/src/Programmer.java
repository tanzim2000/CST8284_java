/**
 * <b>Lab 7</b> - {@code Programmer.java}
 * <br>
 * {@code Programmer} is an abstract superclass that IMPLEMENTS the {@link Payme} interface.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public abstract class Programmer implements Payme {

private String firstName;
private String lastName;
private String socialSecurityNumber;

/**
 * three-argument constructor
 * @param first firstName
 * @param last lastName
 * @param ssn socialSecurityNumber
 */
public Programmer(String first, String last, String ssn) {
	firstName = first;
	lastName = last;
	socialSecurityNumber = ssn;
	}

public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

/**
 * return String representation of Programmer object
 */
@Override
public String toString() {
	return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}

public abstract double earnings();
}