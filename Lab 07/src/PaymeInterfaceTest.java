import java.util.ArrayList;
/**
 * <b>Lab 7</b> - {@code PaymeInterfaceTest.java}
 * <br>
 * {@code PaymeInterfaceTest} is the test for interface {@link Payme}.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public class PaymeInterfaceTest  {

public static void main(String[] args) {
	@SuppressWarnings("serial")
	ArrayList<Payme> paymeObjects = new ArrayList<Payme>() {
		{// creating subclass objects inside an array
			add(new Invoice("22776", "steering", 3, 300));
			add(new Invoice("33442", "cruise", 5, 90.99));
			add(new SalariedProgrammer( "Emmanuel", "Okoro", "123-11-4567", 500 ));
			add(new SalariedProgrammer("Chioma", "Chidimma", "345-67-8901", 320));
			add(new HourlyProgrammer( "Mary", "Cheng", "890-22-1234", 16.75, 40));
			add(new HourlyProgrammer("Cheng", "Lui", "234-56-7890", 18.95, 40));
			add(new HourlyProgrammer("Matthew", "Goodman", "123-45-6789", 16500, 0.44));
			add(new CommissionProgrammer( "Martha", "Peter", "567-33-8901", 23000, .06));
			add(new BasePlusCommissionProgrammer("Ramjeet", "Patel", "102-34-5678", 1200, 0.04, 720));
			}
		};
		System.out.println("Payment for Invoices and Programmers are processed polymorphically:\n"); 
		// generically process each element in array paymeObjects
		int index=0;
		for (Payme currentPayme : paymeObjects) {
			// output currentPayme and its appropriate payment amount
			System.out.printf("%s \n", currentPayme.toString());
			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				// downcast Payme reference to BasePlusCommissioProgrammer reference
				BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n", programmer.getBaseSalary());
				}
			System.out.printf("Payment Due: $%,.2f\n\n", paymeObjects.get(index).getPaymentAmount());
			index++;
			}
		}
}


