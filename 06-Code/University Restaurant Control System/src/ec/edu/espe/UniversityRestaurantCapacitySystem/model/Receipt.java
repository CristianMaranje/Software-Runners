
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

/**
 *
 * @author GROUP 3 Software-Runners ESPE-DCCO
 */
import java.util.Date;

/**
 *
 * @author Cristian Maranaje Software-Runners ESPE-DCCO
 */
public class Receipt {
    private int reciptId;
    private Date date;
    private String costumerName;
    private int costumerID;
    private float payment;

    public Receipt(int reciptId, Date date, String costumerName, int costumerID, float payment) {
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

    
    public int getReciptId() {
        return reciptId;
    }
    
    public void setReciptId(int reciptId) {
        this.reciptId = reciptId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public int getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }
    
    
}
