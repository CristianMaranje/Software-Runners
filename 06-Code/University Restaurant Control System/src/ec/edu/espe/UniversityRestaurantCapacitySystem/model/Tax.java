/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

/**
 *
 * @author Nicolas Hidrobo
 */
public class Tax {

    private float tax = 0.12f;

    private static Tax instance;

    public Tax() {
    }

  

    /**
     * @return the value
     */
    /**
     * @return the tax
     */
    public float getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(float tax) {
        this.tax = tax;
    }

    /**
     * @return the instance
     */
    public static Tax getInstance() {
        return instance;
    }

    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(Tax aInstance) {
        instance = aInstance;
    }
}
