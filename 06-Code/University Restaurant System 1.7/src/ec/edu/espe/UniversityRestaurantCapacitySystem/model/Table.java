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
public class Table {
    private boolean aviable;
    private int tableId;
    private int capacity;

    public Table(boolean aviable, int tableId, int capacity) {
        this.aviable = aviable;
        this.tableId = tableId;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Table{" + "aviable=" + aviable + ", tableId=" + tableId + ", capacity=" + capacity + '}';
    }

    /**
     * @return the aviable
     */
    public boolean isAviable() {
        return aviable;
    }

    /**
     * @param aviable the aviable to set
     */
    public void setAviable(boolean aviable) {
        this.aviable = aviable;
    }

    /**
     * @return the tableId
     */
    public int getTableId() {
        return tableId;
    }

    /**
     * @param tableId the tableId to set
     */
    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
