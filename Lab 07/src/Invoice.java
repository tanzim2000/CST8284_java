/**
 * <b>Lab 7</b> - {@code Invoice.java}
 * <br>
 * {@code Invoice} class implements interface {@link Payme} Unrelated to {@link Programmer}.
 * @author Tanzim Ahmed Sagar
 * @version 1.0
 * @since 12.06.2022
 */
public class Invoice implements Payme {

private String partNumber; 
private String partDescription;
private int quantity;
private double pricePerItem;

/**
 * four-argument constructor
 * @param part number of part
 * @param description description of part
 * @param count quantity of part
 * @param price price of part
 */
public Invoice(String part, String description, int count, double price) {
	partNumber = part;
	partDescription = description;
	setQuantity(count); // validate and store quantity
	setPricePerItem(price); // validate and store price per item
	}

/**
 * set part number
 * @param part number of part
 */
public void setPartNumber(String part) {
	partNumber = part; // should validate
	}

/**
 * get part number
 * @return partNumber 
 */
public String getPartNumber() {
	return partNumber;
	}

/**
 * set description
 * @param description description of part
 */
public void setPartDescription(String description) {
	partDescription = description; // should validate
	}

/**
 * get description
 * @return description
 */
public String getPartDescription() {
	return partDescription;
	}

/**
 * set quantity
 * @param count quantity of part
 */
public void setQuantity(int count) {
	quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}
/**
 * get quantity
 * @return quantity
 */
public int getQuantity() {
	return quantity;
	}

/**
 * set price per item
 * @param price price of part
 */
public void setPricePerItem(double price) {
	pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}

/**
 * get price per item
 * @return pricePerItem
 */
public double getPricePerItem() {
	return pricePerItem;
	}

/**
 * return String representation of Invoice object
 */
@Override
public String toString() {
	return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f\n", "invoice", "part number", getPartNumber(), getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem());
	} 

/**
 * method required to carry out contract with interface {@code Payme}
 */
@Override
public double getPaymentAmount() {
	return getQuantity() * getPricePerItem(); // calculate total cost
	}
}