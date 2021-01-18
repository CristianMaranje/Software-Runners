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
public class Order {
    private int orderId;
    private Date date;
    private String description;
    private Product product;

    public Order(int orderId, Date date, String description, Product product) {
        this.orderId = orderId;
        this.date = date;
        this.description = description;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + getOrderId() + ", date=" + getDate() + ", description=" + getDescription() + ", product=" + getProduct() + '}';
    }
    
    /**
     * @return the orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
    
    
}
