/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.util.Date;

/**
 *
 * @author Nicole Lara ESPE-DCCO
 */
public class Product {
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

    @Override
    public String toString() {
        return "Product{" + "NAME=" + name + ", ID =" + productId + ", PRICE=" + price + ", DESCRIPTION=" + description + ", QUIANTITY=" + quantity + '}';
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
