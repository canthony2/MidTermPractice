package MidTermPractice;

/**
 *
 * @author knyghtspup
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scenario: sales checkout
            //scenario begins when: customer steps up to checkout
            //scenario ends when: receipt is generated(printed) and outputed
            
        //Scenario process
            //Start Sale
                //customer id optional
                    //if id is inputed, find the customer
            //Add Item(s)
                //product id and quantity required
                    //validation
                    //need to find the product information
                        //name, price, and discount
            //End Sale
        
        DatabaseAccessStrategy db = new InMemoryAccess();
        PosTerminal post = new PosTerminal();
        
        post.startNewSale("", db);
        post.addItemToCart("B1892", 2, db);
        post.addItemToCart("D4132", 3, db);
        post.endSale();
        
    }
    
}
