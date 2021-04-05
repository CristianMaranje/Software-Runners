package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import ec.edu.espe.DBManager.utils.DBManager;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Xavier Cordoba 
 */
public class Order {

    private Product product[];
    private Person costumer;
    private Date date;
    private float total;

    
    public Order(Product[] product, Person costumer, Date date, float total) {
        this.product = product;
        this.costumer = costumer;
        this.date = date;
        this.total = total;
    }

   

    public Order() {
        product = null;
        costumer = null;
        date = null;
        total = 0;
    }

    @Override
    public String toString() {
        return "Order{" + "product=" + getProduct() + ", costumer=" + getCostumer() + ", date=" + getDate() + ", total=" + getTotal() + '}';
    }

    /**
     * @return the product
     */
    public Product[] getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product[] product) {
        this.product = product;
    }

    /**
     * @return the costumer
     */
    public Person getCostumer() {
        return costumer;
    }

    /**
     * @param costumer the costumer to set
     */
    public void setCostumer(Person costumer) {
        this.costumer = costumer;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

  


  

}
