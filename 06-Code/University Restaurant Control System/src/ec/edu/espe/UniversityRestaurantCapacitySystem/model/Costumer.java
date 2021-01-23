package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.Scanner;

/**
 *
 * @authors GROUP 3 Software-Runners ESPE-DCCO
 */
public class Costumer {

    private String name;
    private String mail;
    private String id;

    public Costumer(String name, String mail, String id) {
        this.name = name;
        this.mail = mail;
        this.id = id;
    }

    public Costumer (){
        name = "Default";
        mail = "noMailRegistered";
        id = "9999999999";
    }
    
    public Costumer addNewCostumer() {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER COSTUMER NAME:");
        String name = scan.nextLine();
        System.out.print("ENTER COSTUMER MAIL:");
        String mail = scan.nextLine();
        //scan.nextLine();
        System.out.print("ENTER COSTUMER ID: ");
        String costumerID = scan.nextLine();
        System.out.println("");
        Costumer costumer = new Costumer(name, mail, costumerID);
        
        return costumer;
    }

    
    
    @Override
    public String toString() {
        return "Costumer{" + "name=" + name + ", mail=" + mail + ", id=" + id + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
