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
    private Product product[];

    public Order(int orderId, Date date, Product[] product) {
        this.orderId = orderId;
        this.date = date;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + getOrderId() + ", date=" + getDate() + ", product=" + getProduct() + '}';
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

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    
    
}
