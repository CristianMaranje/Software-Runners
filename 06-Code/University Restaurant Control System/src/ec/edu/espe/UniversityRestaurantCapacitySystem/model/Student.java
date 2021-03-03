/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.mongodb.BasicDBObject;
import ec.edu.espe.FileManagerDB.utils.FileManagerDB;
import java.util.Scanner;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class Student  extends Costumer{
    
    private float disscount;

    public Student(String name, String mail, String id, float disscount) {
        super(name, mail, id);
        this.disscount = disscount;
    }
    
    @Override
   public Costumer addNewCostumer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER COSTUMER NAME:");
        String name = scan.nextLine();
        System.out.print("ENTER COSTUMER MAIL:");
        String mail = scan.nextLine();
        System.out.print("ENTER COSTUMER ID: ");
        String costumerID = scan.nextLine();
        System.out.println("");
        float disscount = 0.15f;
        
        Student student = new Student(name, mail, costumerID, disscount);
        
        BasicDBObject docCostumer =new BasicDBObject();
        docCostumer.append("name", name).append("mail", mail).append("id", costumerID).append("disscount", disscount);
        FileManagerDB.save(docCostumer, "Costumers");
        
        return student;
    }
    

    @Override
    public String toString() {
        return "Student{" + "disscount=" + disscount + '}';
    }
 
    
    public Student() {
    }

    public void getDisscount(Product product) {
        float disscount;

        disscount = 0.15f*product.getPrice();
        
    }

    /**
     * @return the disscount
     */
    public float getDisscount() {
        return disscount;
    }

    /**
     * @param disscount the disscount to set
     */
    public void setDisscount(float disscount) {
        this.disscount = disscount;
    }
}
