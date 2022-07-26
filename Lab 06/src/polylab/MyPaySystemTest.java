package polylab;
import java.util.ArrayList;
import java.util.Scanner; //This program uses Scanner to obtain user input

/**
 * <b>Lab 6</b> - {@code MyPaySystemTest.java}
 * Programmer hierarchy test program.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public class MyPaySystemTest {
public static void main(String[] args) {
	// creating and initialize the programmer array
	@SuppressWarnings("serial")
	ArrayList<Programmer> programmer = new ArrayList<Programmer>() {
		{// creating subclass objects inside an array
		add(new SalariedProgrammer( "Emmanuel", "Okoro", "123-11-4567", 6, 1992, 500.00 ));
		add(new HourlyProgrammer( "Mary", "Cheng", "890-22-1234", 12, 1981, 16.75, 40));
		add(new CommissionProgrammer( "Martha", "Peter", "567-33-8901", 9, 1983, 23000, .06));
		add(new BasePlusCommissionProgrammer( "John", "Mark", "234-44-5678", 3, 1978, 9000, .04, 300));
		}
	};

	System.out.println("\nProgrammers are processed individually:\n");
	for (int programmerSerial = 0; programmerSerial < programmer.size(); programmerSerial++) {
		System.out.printf("%s\n%s: $%,.2f\n\n", programmer.get(programmerSerial), "earned", programmer.get(programmerSerial).earnings());
	}
	//IMPLEMENTING THE USE OF A SCANNER TO GET THE CURRENT MONTH
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter the current month (1 - 12): ");
	int currentMonth = keyboard.nextInt();
	//GETTING THE CURRENT MONTH AND VALIDATING.
	if (currentMonth <= 0 || currentMonth > 12) {	// check if month in range
		keyboard.close();
		throw new IllegalArgumentException("month (" + currentMonth + ") must be 1-12");
		}
	keyboard.close();
	System.out.println("\nProgrammers processed polymorphically:\n");
	// generically processing each element in array
	for (Programmer currentProgrammer : programmer) {
		System.out.println(currentProgrammer); // invokes toString
		// determining whether element is a BasePlusCommissionProgrammer
		if (currentProgrammer instanceof BasePlusCommissionProgrammer) {
			// downcast Programmer reference to BasePlusCommissionProgrammer reference
			BasePlusCommissionProgrammer programmers = (BasePlusCommissionProgrammer) currentProgrammer;
			double oldBaseSalary = programmers.getBaseSalary();
			programmers.setBaseSalary(1.10 * oldBaseSalary);
			System.out.printf("new base salary with 10%% increase is: $%,.2f\n", programmers.getBaseSalary());
			System.out.println();
			}
		if (currentMonth == currentProgrammer.getBirthDate().getDate()) {
			System.out.println("Earned: " + currentProgrammer.earnings()+" plus $500.00 birthday bonus\n");
		}
		else {
			System.out.println("Earned: " + currentProgrammer.earnings()+"\n");
		}
 }
	// getting type name of each object in programmers array
	for (int j = 0; j < programmer.size(); j++) {
		System.out.printf("Programmer %d is a %s\n", j, programmer.get(j).getClass().getName());
		}
	}
}