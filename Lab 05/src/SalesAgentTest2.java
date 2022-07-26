/**
 * This program is the tests for the SalesAgent class including the subclasses.
 * 
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 01.06.2022
 */
public class SalesAgentTest2 {
	public static void main(String[] args){

		SalesAgent agentOne = new SalesAgent("Andrew", 42);
		SalesAgent agentTwo = new SalesAgent("Peter", 42);
		SalesAgent agentThree = new SalesAgent("Andrew", 42);
		SalesSupervisor agentFour = new SalesSupervisor("Ifeoma", 53, "Toronto");
		SalesSupervisor agentFive = new SalesSupervisor("Ndidi Oma", 35, "Ottawa");
		SalesChief agentSix = new SalesChief("Tanzim Ahmed Sagar", 21, "Gatineau");
		Object employees[] = { agentOne, agentTwo, agentThree, agentFour, agentFive, agentSix };

		for (int index = 0; index < employees.length; index++) {
			System.out.println(employees[index].toString());
		}
	}
}