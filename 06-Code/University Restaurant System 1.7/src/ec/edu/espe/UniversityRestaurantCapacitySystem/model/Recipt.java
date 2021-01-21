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
public class Recipt {
    private int reciptId;
    private Date date;
    private String costumerName;
    private int costumerID;
    private float payment;

    public Recipt(int reciptId, Date date, String costumerName, int costumerID, float payment) {
        this.reciptId = reciptId;
        this.date = date;
        this.costumerName = costumerName;
        this.costumerID = costumerID;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Recipt{" + "reciptId=" + reciptId + ", date=" + date + ", costumerName=" + costumerName + ", costumerID=" + costumerID + ", payment=" + payment + '}';
    }

    
    /**
     * @return the reciptId
     */
    public int getReciptId() {
        return reciptId;
    }

    /**
     * @param reciptId the reciptId to set
     */
    public void setReciptId(int reciptId) {
        this.reciptId = reciptId;
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
     * @return the costumerName
     */
    public String getCostumerName() {
        return costumerName;
    }

    /**
     * @param costumerName the costumerName to set
     */
    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    /**
     * @return the costumerID
     */
    public int getCostumerID() {
        return costumerID;
    }

    /**
     * @param costumerID the costumerID to set
     */
    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    /**
     * @return the payment
     */
    public float getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(float payment) {
        this.payment = payment;
    }
    
    
}
