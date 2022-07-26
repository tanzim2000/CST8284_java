package experiment;

/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Tanzim Ahmed Sagar. 
 */


/**
 * This class is named Car Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one, thereby
 * chaining the calls 'UPWARDS' (from the default constructor to the one 
 * with the most arguments. Ensure that you implement it in this order). 
 * Compare this Car class with the Bicycle class also provided for you.
 * This approach is often preferred for clarity and ease of code maintenance.
 * 
 * Car() calls Car(String, boolean, double), program flow returns to
 * Car() and exits the constructor.
 * 
 * Car(String) calls Car(String, boolean, double), program flow returns
 * to Car(String) and exits the constructor.
 * 
 * Car(String, boolean) calls Car(String, boolean, double), program flow
 * returns to Car(String, boolean) and exits the constructor.
 * 
 * Car(String, boolean, double) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in them,
 *       for demonstration purposes only. DO NOT PUT input / output
 *       into constructors in real production code!!!
 * 
 * @see bicycle
 * @author Tanzim Ahmed Sagar
 */
public class Car {

	/**
	 * variety or type of Car.
	 */
	private static String variety;
	
	/**
	 * If this Car is hybrid
	 */
	private static boolean isHybrid;
	
	/**
	 * The weight of the Car in kilogram.
	 */
	private static double weight;
	
	/**
	 * The default constructor sets variety to "car", isHybrid to false,
	 * and weight to zero.
	 */
	public Car() {
		this("car", false, 0);
		System.out.println("Car() was called");
	}
	
	/**
	 * TO DO: YOUR TASK 1: IMPLEMENT THIS PORTION OF THE CODE.
	 * This constructor sets the variety as passed, isHybrid to false,
	 * and weight to zero.
	 * @param variety The variety of this car.
	 */
	public Car(String variety) {
		this(variety, false, 0);
		System.out.println("Car(String) was called");
	}
	/**
	 * TO DO: YOUR TASK 2: IMPLEMENT THIS PORTION OF THE CODE.
	 * 
	 * This constructor sets the variety as passed, isHybrid as passed,
	 * and weight to zero.
	 * @param variety The variety of this car.
	 * @param isHybrid If this car is hybrid use true, otherwise false.
	 */
	public Car(String variety, boolean isHybrid) {
		this(variety, isHybrid, 0);
		System.out.println("Car(String, boolean) was called");
	}
	/**
	 * TO DO: YOUR TASK 3: IMPLEMENT THIS PORTION OF THE CODE.
	 * 
	 * This constructor sets the variety as passed, isHybrid as passed, and
	 * weight as passed.
	 * @param variety The variety of this car.
	 * @param isHybrid If this car is hybrid use true, otherwise false.
	 * @param weight The weight of this car in kg.
	 */
	public Car(String variety, boolean isHybrid, double weight) {
		Car.variety = variety;
		Car.isHybrid = isHybrid;
		Car.weight = weight;
		System.out.println("Car(String, boolean, double) was called");
	}
	
	/**
	 * Returns the variety for this car.
	 * @return the variety for this car.
	 */
	public String getVariety() {
		return variety;
	}
	/**
	 * Sets the variety for this car.
	 * @param variety The variety for this car.
	 */
	public void setVariety(String variety) {
		Car.variety = variety;
	}
	/**
	 * Returns true if this Car is hybrid, false if it is not.
	 * @return true if this car is hybrid, false if it is not.
	 */
	public boolean isHybrid() {
		return isHybrid;
	}
	/**
	 * TO DO: YOUR TASK 4: IMPLEMENT THIS PORTION OF THE CODE.
	 * 
	 * Sets the isHybrid state for this car, true means it's hybrid.
	 * @param isHybrid Use true if it is hybrid, use false if not hybrid.
	 */
	public void setHybrid(boolean isHybrid) {
		Car.isHybrid = isHybrid;
	}
	/**
	 * Weight of this Orange in kg.
	 * @return Weight of this car in kg.
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * Sets the weight of this car, in kg.
	 * @param weight The weight of this car in kg.
	 */
	public void setWeight(double weight) {
		Car.weight = weight;
	}
	
	/**
	 * @return A String representation of this Car, each field is separated 
	 * by a comma in the order of variety, isHybrid, weight with (kg) added
	 * to the end of the weight field value.
	 */
	public static String createReport() {
		return String.format("%s, %b, %.2f%s",variety,isHybrid,weight,"(kg)");
	}
}
