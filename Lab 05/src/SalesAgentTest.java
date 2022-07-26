
/**
 * This program is the tests for the {@code SalesAgent} class including the subclass.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 01.06.2022
 */
public class SalesAgentTest
{  
   public static void main(String[] args) {
	   SalesChief chief = new SalesChief("Tanzim Ahmed Sagar", 21, "Gatineau");
	   SalesSupervisor superVisor = new SalesSupervisor("James", 26, "Perth");
	   SalesAgent agent = new SalesAgent("Andrew", 42);
	   
	   System.out.println(agent.toString());
	   System.out.println(superVisor.toString());
	   System.out.println(chief.toString());
   }
}  