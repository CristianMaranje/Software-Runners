/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.mongodb.BasicDBObject;
import ec.edu.espe.FileManagerDB.utils.FileManagerDB;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import java.util.Scanner;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class Employee extends Costumer{
    
    float disscount;

    public Employee(String name, String mail, String id, float disscount) {
        super(name, mail, id);
    }

    public Employee() {
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
        float disscount = 0.2f;
        
        Employee employee = new Employee (name, mail, costumerID, disscount );
        
        BasicDBObject docCostumer =new BasicDBObject();
        docCostumer.append("name", name).append("mail", mail).append("id", costumerID).append("disscount", disscount);
        FileManagerDB.save(docCostumer, "CostumersEpmloyee");
        
        return employee;
    }

    @Override
    public String toString() {
        return "Employee{" + "disscount=" + disscount + '}';
    }
    
    public void  getDisscount(Product product) {
        
        disscount = 0.2f*product.getPrice();
  
    }

    
}
