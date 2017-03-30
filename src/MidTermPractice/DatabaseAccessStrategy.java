package MidTermPractice;

/**
 *
 * @author knyghtspup
 */
public interface DatabaseAccessStrategy {

    public abstract Customer findCustomerInfo(String custId, DatabaseAccessStrategy db);
    
    public abstract Product findProductInfo(String prodId, DatabaseAccessStrategy db);

}
