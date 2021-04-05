package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Hidrobo Software-Runners ESPE-DCCO
 */
public class Administrator {

    private String name;
    private ArrayList<Order> cashierOrders;


    public Administrator(String name, ArrayList<Order> cashierOrders) {
        this.name = name;
        this.cashierOrders = cashierOrders;
    }

    public Administrator() {
        name = "TheSuperCashier";
        cashierOrders = null;
    }

    @Override
    public String toString() {
        return "Cashier{" + "name=" + name + ", cashierOrders=" + cashierOrders + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getCashierOrders() {
        return cashierOrders;
    }

    public void setCashierOrders(ArrayList<Order> cashierOrders) {
        this.cashierOrders = cashierOrders;
    }

   

}
