package experiment;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @category Lab
 * @since 08.06.2022
 */
public class AnotherTestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 Cars
	 * and 4 Bicycles to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
//Creating Car Objects
		System.out.println("Just creating 4 cars\n");
		for (int index=1; index<5; index++) {
			System.out.println("car"+index);
			if (index==1) {
				Car car1 = new Car();
			}
			else if (index==2) {
				Car car2 = new Car("car"+index);
			}
			else if (index==3) {
				Car car3 = new Car("car"+index, true);
			}
			else if (index==4) {
				Car car4 = new Car("car"+index, true, 9.5);
			}
			System.out.println(Car.createReport() + "\n");
		}
		System.out.println("");
		
//Creating Bicycle Objects
		System.out.println("Just creating 4 Bicycles\n");
		for (int index=1; index<5; index++) {
			System.out.println("bicycle"+index);
			if (index==1) {
				Bicycle bicycle1 = new Bicycle();
			}
			else if (index==2) {
				Bicycle bicycle2 = new Bicycle("bicycle"+index);
			}
			else if (index==3) {
				Bicycle bicycle3 = new Bicycle("bicycle"+index, true);
			}
			else if (index==4) {
				Bicycle bicycle4 = new Bicycle("bicycle"+index, true, 7);
			}
			System.out.println(Bicycle.createReport() + "\n");
		}
	}
}
