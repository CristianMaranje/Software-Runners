/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import static java.nio.file.Files.size;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class Drink extends Product {
    private boolean isHot;
    private boolean sugarFree;
    private LocalDate expiryDate;

    public Drink(String name, int productId, float price, String description, int quantity,boolean isHot, boolean sugarFree, LocalDate expiryDate) {
        this.isHot = isHot;
        this.sugarFree = sugarFree;
        this.expiryDate = expiryDate;
    }
    public Drink(){
        isHot = false;
        sugarFree = false;
        expiryDate = getExpiryDate();
    }
    public boolean isIsHot() {
        return isHot;
    }

    public void setIsHot(boolean isHot) {
        this.isHot = isHot;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    public void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    
   

    /*public Drink addDrink(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ENTER THE DRINK NAME:");
        String name = scan.nextLine();
        System.out.print("ENTER THE DRINK ID:");
        int productID = scan.nextInt();
        scan.nextLine();
        System.out.print("ENTER THE DRINK PRICE: ");
        float price = scan.nextFloat();
        scan.nextLine();
        System.out.print("ENTER THE DRINK DESCRIPTION: ");
        String description = scan.nextLine();
 
        System.out.print("THE DRINK IS HOT ? ");
        String temperature = scan.nextLine();
        if (temperature == "yes"){
           //System.out.println("Will be serve first");
           boolean isHot= true;
       }else {
            if (temperature== "no"){
            boolean isHot= false;
            }
        }
       System.out.print("THE DRINK CONTAINS SUGAR ? ");
        String sugar = scan.nextLine();
        if (sugar == "yes"){
           //System.out.println("Will be serve first");
           boolean sugarFree = true;
       }else{
            if (sugar== "no"){
           boolean sugarFree= false;
            }
        }    
        Drink drink1 = new Drink(name, productID, price, description, productID, isHot, sugarFree, expiryDate);
        return drink1;
    }    */
    
   
   public Product addNewDrink(){
        int temperature;
        int sugar;
        expiryDate = LocalDate.now().plusDays(10);
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE DRINK NAME:");
        String name = scan.nextLine();
        
        System.out.println("ENTER THE DRINK ID:");
        int productID = scan.nextInt();
        scan.nextLine();
        
        System.out.print("ENTER THE DRINK PRICE: ");
        float price = scan.nextFloat();
        scan.nextLine();
        
        System.out.print("ENTER THE DRINK DESCRIPTION: ");
        String description = scan.nextLine();
        
        System.out.print("ENTER THE QUANTITY: ");
        int quantity = scan.nextInt();
        
        System.out.println("THIS DRINK IS HOT?\n (1).Yes\n (2).No ");
        temperature = scan.nextInt();
        if (temperature == 1){
            boolean isHot= true;            
        }else {
            boolean isHot=false;
        }
        
        System.out.println("THIS DRINK IS SUGARFREE?\n (1).Yes\n (2).No ");
        sugar = scan.nextInt();
        if (sugar == 1){
            boolean sugarFree= true;            
        }else {
            boolean sugarFree=false;
        }
        
        
        Drink drink = new Drink(name, productID, price, description, quantity, isHot, sugarFree, expiryDate);
       
        return drink;
        
   } 
   @Override
    public  String toString() {
        
        return super.toString() +"Drink{" + "Is hot ? =" + isHot+ ", Sugar Free ? =" + sugarFree+ "Consume before = " +expiryDate+'}';
    }
    
    @Override
    public String showEspecifications(){
        return "Product{" + "name=" + getName() + ", productId=" + getProductId() + ", price=" + getPrice() + ", description=" + getDescription() + ", quantity=" + getQuantity() + "Is hot ? =" + isHot+ ", Sugar Free ? =" + sugarFree+ "Consume before = " +expiryDate+ '}';
    }

    @Override
    public void prepare() {
        System.out.println("Preparing drink -> "+ getName());
    }

    @Override
    public Product addNewProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
    
    
    
}
