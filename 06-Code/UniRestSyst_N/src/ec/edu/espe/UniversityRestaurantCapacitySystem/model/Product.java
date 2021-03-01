package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Juan Gallardo Software-Runners ESPE-DCCO
 */
public abstract class Product {

    private String name;
    private int productId;
    private float price;
    private String description;
    private int quantity;

    public Product(String name, int productId, float price, String description, int quantity) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public float computePriceForSale() {
        return price * 1.12f;
    }
    public abstract void prepare ();
    
            
    
            
    public abstract Product addNewProduct();
   

    public Product() {
        name = "costumer";
        productId = 0;
        price = (float) 0.00;
        description = "NO DESCRIPTION";
        quantity = 0;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + getName() + ", productId=" + getProductId() + ", price=" + getPrice() + ", description=" + getDescription() + ", quantity=" + getQuantity() + '}';
    }

    public String showEspecifications() {
        return "Product{" + "name=" + getName() + ", productId=" + getProductId() + ", price=" + getPrice() + ", description=" + getDescription() + ", quantity=" + getQuantity() + '}';

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
