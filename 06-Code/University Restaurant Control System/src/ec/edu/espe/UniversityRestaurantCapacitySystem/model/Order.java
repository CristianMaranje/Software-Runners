
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.util.Date;

/**
 *
 * @authors Nicolas Hidrobo Software-Runners ESPE-DCCO
 */
public class Order {

    private int orderId;
    private Product product[];
    private Costumer costumer;
    private Date date;

    public Order(int orderId, Product[] product, Costumer costumer, Date date) {
        this.orderId = orderId;
        this.product = product;
        this.costumer = costumer;
        this.date = date;
    }

    public Order(){
        orderId = 0;
        product = null;
        costumer = null;
        date = null;
    }
    
    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", product=" + product + ", costumer=" + costumer + ", date=" + date + '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
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
