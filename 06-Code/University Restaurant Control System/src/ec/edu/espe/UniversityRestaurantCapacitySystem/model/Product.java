
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.mongodb.BasicDBObject;
import ec.edu.espe.DBManager.utils.DBManager;
import java.util.Scanner;

/**
 *
 * @author Cristian Maranje
 */
public class Product {
    private String name;
    private String productId;
    private float price;
    private String description;
    private int quantity;

    public Product(String name, String productId, float price, String description, int quantity) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }



 
    public Product (){
        name= "costumer";
        productId = "";
        price = (float) 0.00;
        description = "NO DESCRIPTION"; 
        quantity = 0; 
    }
    
 
    @Override
    public String toString() {
        return "Product{" + "name=" + getName() + ", productId=" + getProductId() + ", price=" + getPrice() + ", description=" + getDescription() + ", quantity=" + getQuantity() + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

  

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }
    
    
  
   
    
    

   
   

   

    
    
}
