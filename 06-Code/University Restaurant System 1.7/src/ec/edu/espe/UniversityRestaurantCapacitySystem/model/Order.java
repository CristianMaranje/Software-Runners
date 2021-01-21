
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

/**
 *
 * @author Nicole Lara ESPE-DCCO
 */
public class Order {

    private int orderId;
    private Product product[];

    public Order(int orderId, Product[] product) {
        this.orderId = orderId;
        this.product = product;
    }
    
    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", product=" + product + '}';
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

}
