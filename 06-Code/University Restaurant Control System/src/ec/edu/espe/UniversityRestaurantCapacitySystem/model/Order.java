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

    public Order(Product[] product, Person costumer, Date date) {
        this.product = product;
        this.costumer = costumer;
        this.date = date;
    }

    public Order() {
        product = null;
        costumer = null;
        date = null;
    }

    @Override
    public String toString() {
        return "Order{" + ", product=" + product + ", costumer=" + costumer + ", date=" + date + '}';
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getCostumer() {
        return costumer;
    }

    public void setCostumer(Person costumer) {
        this.costumer = costumer;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

}
