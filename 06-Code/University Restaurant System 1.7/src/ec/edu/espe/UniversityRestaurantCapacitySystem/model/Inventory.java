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

    private String productId;
    private Product product;

    @Override
    public String toString() {
        return "Inventory{" + "productId=" + productId + ", product=" + product + '}';
    }

    public Inventory(String productId, Product product) {
        this.productId = productId;
        this.product = product;
    }


    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
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
