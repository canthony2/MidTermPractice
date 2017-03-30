package MidTermPractice;

/**
 *
 * @author knyghtspup
 */
public class PosTerminal {
    
    private Receipt receipt;
    
    public final void startNewSale(String custId, DatabaseAccessStrategy db) {
        //delegate finding the customer to the receipt
        receipt = new Receipt(custId, db);
    }

    public final void addItemToCart(String prodId, int qty, DatabaseAccessStrategy db) {
        receipt.addLineItem(prodId, qty, db);
    }

    public final void endSale() {
        //two output strategies
            //one for receipt
            //one for line item
            
            
            
    }
    
}
