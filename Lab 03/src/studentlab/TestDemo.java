package studentlab;

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
 * @since 08.06.2022
 */
public class TestDemo {

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
	//Car 1
		System.out.println("car1");
		Car car1 = new Car();
		System.out.println(car1.createReport() + "\n");
	//Car 2
		System.out.println("car2");
		Car car2 = new Car("car2");
		System.out.println(car2.createReport() + "\n");
	//Car 3
		System.out.println("car3");
		Car car3 = new Car("car3", true);
		System.out.println(car3.createReport() + "\n");
	//Car 4
		System.out.println("car4");
		Car car4 = new Car("car4", true, 9.5);
		System.out.println(car4.createReport() + "\n");
		System.out.println("");
		
//Creating Bicycle Objects
		System.out.println("Just creating 4 Bicycles\n");
	//Bicycle 1
		System.out.println("bicycle1");
		Bicycle bicycle1 = new Bicycle();
		System.out.println(bicycle1.createReport() + "\n");
	//Bicycle 2
		System.out.println("bicycle2");
		Bicycle bicycle2 = new Bicycle("bicycle2");
		System.out.println(bicycle2.createReport() + "\n");
	//Bicycle 3
		System.out.println("bicycle3");
		Bicycle bicycle3 = new Bicycle("bicycle3", true);
		System.out.println(bicycle3.createReport() + "\n");
	//Bicycle 4
		System.out.println("bicycle4");
		Bicycle bicycle4 = new Bicycle("bicycle4", true, 7);
		System.out.println(bicycle4.createReport() + "\n");
	}
}
