package MidTermPractice;

/**
 *
 * @author knyghtspup
 */
public class LineItem {
    
    private Product product;
    private int qty;
    
    public LineItem(String prodId, int qty, DatabaseAccessStrategy db) {
        product = findProductInfo(prodId, db);
        this.qty = qty;
    }
    
    private final Product findProductInfo(String prodId, DatabaseAccessStrategy db){
        return db.findProductInfo(prodId, db);
    }
    
}
