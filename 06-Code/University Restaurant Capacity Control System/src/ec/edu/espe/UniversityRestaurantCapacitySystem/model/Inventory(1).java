/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

/**
 *
 * @author Nicole Lara ESPE-DCCO
 */
public class Inventory {
    String productId;
    int quantity;

    public Inventory(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Inventory{" + "productId=" + productId + ", quantity=" + quantity + '}';
    }
    
    
    
}
