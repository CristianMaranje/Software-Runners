/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class Dessert extends Product {
    
    private boolean isSweet;

    public Dessert(String name, int productId, float price, String description, int quantity) {
        super(name, productId, price, description, quantity);
    }

    public Dessert() {
    }

    public boolean isIsSweet() {
        return isSweet;
    }

    public void setIsSweet(boolean isSweet) {
        this.isSweet = isSweet;
    }

   public Product addNewDessert(){
       
        int taste;
      
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE DESSERT NAME:");
        String name = scan.nextLine();
        
        System.out.println("ENTER THE DESSERT ID:");
        int productID = scan.nextInt();
        scan.nextLine();
        
        System.out.print("ENTER THE DESSERT PRICE: ");
        float price = scan.nextFloat();
        scan.nextLine();
        
        System.out.print("ENTER THE DESSERT DESCRIPTION: ");
        String description = scan.nextLine();
        
        System.out.print("ENTER THE QUANTITY: ");
        int quantity = scan.nextInt();
        
        System.out.println("THIS DESSERT IS SWEET?\n (1).Yes\n (2).No ");
        taste = scan.nextInt();
        if (taste == 1){
            boolean isSweet = true;            
        }else {
            boolean isSweet =false;
        }
 
        Dessert dessert = new Dessert(name, productID, price, description, quantity);
       
        return dessert;
        
   } 
    
    
    @Override
    public String toString() {
        
        return super.toString() +"Dessert{" + "Is Sweet ? =" + isSweet+'}';
    }
    
    @Override
    public String showEspecifications(){
        return "Product{" + "name=" + getName() + ", productId=" + getProductId() + ", price=" + getPrice() + ", description=" + getDescription() + ", quantity=" + getQuantity() + "Is Sweet ? =" + isSweet+ '}';
    }

    @Override
    public void prepare() {
        System.out.println("preparing dessert"+getName());
    }

    @Override
    public Product addNewProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
