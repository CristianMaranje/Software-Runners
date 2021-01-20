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
public class Cashier {

    private String name;
    private Order order;

    public Cashier(String name, Order order) {
        this.name = name;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Cashier{" + "name=" + name + ", order=" + order + '}';
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
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Order order) {
        this.order = order;
    }

}
