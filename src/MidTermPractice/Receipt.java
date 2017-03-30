package MidTermPractice;

/**
 *
 * @author knyghtspup
 */
public class Receipt {
    
    private DatabaseAccessStrategy db;
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    
    public Receipt(String custId, DatabaseAccessStrategy db){
        //if an ID was inputed, than the name of the customer will be whatever
            //name the helper method finds
        customer = findCustomerInfo(custId, db);
    }
    
    private final Customer findCustomerInfo(String custId, DatabaseAccessStrategy db){
        //helper method to delegate finding the customer name
        return db.findCustomerInfo(custId, db);
    }

    public final void addLineItem(String prodId, int qty, DatabaseAccessStrategy db) {
        LineItem item = new LineItem(prodId, qty, db);
    }
    
}
