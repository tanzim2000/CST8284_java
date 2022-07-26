import java.util.Scanner;
/**
 * In {@code AllActionTest} class, it's creating and filling an array of {@code Action} objects with different types of actions permitted by
 * Ontario Public Health for the COVID-19 protocol including actions that should occur everyday,
 * actions that occur once a month, and actions designated to occur only on a certain date in a year.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 24.06.2022
 */
public class AllActionTest {
	public static void main(String[] args) {
		String message = "Enter a date";
		int dueDay;
		int dueMonth;
		int dueYear;
		boolean loop = true;
		Action actionOne = new RegularAction("Wash Your Hands");
		Action actionTwo = new RegularAction("Sit two meters apart");
		Action actionThree = new OcassionalAction("Take a PCR test", 1);
		Action actionFour = new RareAction("Get a booster shot", 2, 26);
		Object[] actions = {actionOne, actionTwo, actionThree, actionFour};
		do {	//program loop started
			String input;
			Scanner keyboard = new Scanner(System.in);
			System.out.print(message + " [YYYY MM DD]: ");
			input = keyboard.nextLine();
			String[] dateStamp = input.split("\\s");
			if (dateStamp.length == 3) {
				//evaluating if all the char from the input is a number
				if ((input.length() == 10) &&
					(input.charAt(0) =='0' || input.charAt(0) =='1' || input.charAt(0) =='2' || input.charAt(0) =='3' || input.charAt(0) =='4' || input.charAt(0) =='5' || input.charAt(0) =='6' || input.charAt(0) =='7' || input.charAt(0) =='8' || input.charAt(0) =='9') &&
					(input.charAt(1) =='0' || input.charAt(1) =='1' || input.charAt(1) =='2' || input.charAt(1) =='3' || input.charAt(1) =='4' || input.charAt(1) =='5' || input.charAt(1) =='6' || input.charAt(1) =='7' || input.charAt(1) =='8' || input.charAt(1) =='9') &&
					(input.charAt(2) =='0' || input.charAt(2) =='1' || input.charAt(2) =='2' || input.charAt(2) =='3' || input.charAt(2) =='4' || input.charAt(2) =='5' || input.charAt(2) =='6' || input.charAt(2) =='7' || input.charAt(2) =='8' || input.charAt(2) =='9') &&
					(input.charAt(3) =='0' || input.charAt(3) =='1' || input.charAt(3) =='2' || input.charAt(3) =='3' || input.charAt(3) =='4' || input.charAt(3) =='5' || input.charAt(3) =='6' || input.charAt(3) =='7' || input.charAt(3) =='8' || input.charAt(3) =='9') &&
					(input.charAt(5) =='0' || input.charAt(5) =='1' || input.charAt(5) =='2' || input.charAt(5) =='3' || input.charAt(5) =='4' || input.charAt(5) =='5' || input.charAt(5) =='6' || input.charAt(5) =='7' || input.charAt(5) =='8' || input.charAt(5) =='9') &&
					(input.charAt(6) =='0' || input.charAt(6) =='1' || input.charAt(6) =='2' || input.charAt(6) =='3' || input.charAt(6) =='4' || input.charAt(6) =='5' || input.charAt(6) =='6' || input.charAt(6) =='7' || input.charAt(6) =='8' || input.charAt(6) =='9') &&
					(input.charAt(8) =='0' || input.charAt(8) =='1' || input.charAt(8) =='2' || input.charAt(8) =='3' || input.charAt(8) =='4' || input.charAt(8) =='5' || input.charAt(8) =='6' || input.charAt(8) =='7' || input.charAt(8) =='8' || input.charAt(8) =='9') &&
					(input.charAt(9) =='0' || input.charAt(9) =='1' || input.charAt(9) =='2' || input.charAt(9) =='3' || input.charAt(9) =='4' || input.charAt(9) =='5' || input.charAt(9) =='6' || input.charAt(9) =='7' || input.charAt(9) =='8' || input.charAt(9) =='9')) {
					//putting all the numbers in its place converting into an integer
					dueYear = Integer.parseInt(dateStamp[0]);
					dueMonth = Integer.parseInt(dateStamp[1]);
					dueDay = Integer.parseInt(dateStamp[2]);
					//checking if the year is later than 2023
					if (Integer.parseInt(dateStamp[0]) > 0 && Integer.parseInt(dateStamp[0]) < 2023){
						System.out.println("These are your actions on " + dueMonth +"/"+ dueDay +"/"+ dueYear + ": ");
						for (int index = 0; index < actions.length; index++) {
							if(((Action) actions[index]).occursOn(dueYear, dueMonth, dueDay)) {
								System.out.println(index+1 +". "+((Action) actions[index]).toString());
							}
						}
						message = "Enter another date";
					}
					//checking if the date is valid or not
					else if (Integer.parseInt(dateStamp[0]) < 0 || (Integer.parseInt(dateStamp[1]) < 0 && Integer.parseInt(dateStamp[1]) > 12) || (Integer.parseInt(dateStamp[2]) < 0 && Integer.parseInt(dateStamp[2]) > 31) ){
						if (Integer.parseInt(dateStamp[1]) < 0 && Integer.parseInt(dateStamp[1]) > 12) {
							message = "You have only 12 months in a year.\nStudy calender!Then input a correct month";
						}
						else if (Integer.parseInt(dateStamp[2]) < 0 && Integer.parseInt(dateStamp[2]) > 31) {
							message = "From when a month got " + dateStamp[2] + "days?\nInput a correct date";
						}
					}
					//checking if COVID existed on that year
					else if (Integer.parseInt(dateStamp[0]) >= 2023 && (Integer.parseInt(dateStamp[1]) >= 0 && Integer.parseInt(dateStamp[1]) <= 12) && (Integer.parseInt(dateStamp[2]) >= 0 && Integer.parseInt(dateStamp[2]) <= 31) ) {
						System.out.println("Corona Virus itself got COVID-19 so\nit should be dead by this date.\nNo need to do anything!");
						message = "Enter Another Date";
					}
					//unclassified case
					else {
						message = "Ask for returning the money your developer charged you for this app\nbecause YOU JUST GOT A BUG IN THE APP.\nInput wasn't recognized.Try Again!";
					}
				}
				//invalid input case
				else {
					message = "Does it look like a valid date to you? What have you input!\nFollow this format";
				}
			}
			else if (dateStamp.length < 3) {
				
				if (input.charAt(0) =='q' || input.charAt(0) =='Q') {
					System.out.print("Okay! Bye!");
					loop = false;
					keyboard.close();
				}
				else if (input.charAt(0) =='0' || input.charAt(0) =='1' || input.charAt(0) =='2' || input.charAt(0) =='3' || input.charAt(0) =='4' || input.charAt(0) =='5' || input.charAt(0) =='6' || input.charAt(0) =='7' || input.charAt(0) =='8' || input.charAt(0) =='9') {
					message = "Input wasn't recognized! Please use space inbetween year, month and date.\n";
				}
				else {
					message = "DON'T BE LAZY!\nInput all 3 values";
				}
			}
			else if (dateStamp.length > 3) {
				message = "Why being overactive?\nThree inputs only";
			}
		}
		while (loop);
	}
}
