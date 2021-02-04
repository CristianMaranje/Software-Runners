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
    
    

    public Drink addDrink(){
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
        /*System.out.print("ENTER THE CUANTITY: ");
        int quantity = scan.nextInt();
        System.out.print("ENTER THE SIZE:");
        int size = scan.nextInt();
        scan.nextLine();*/
        System.out.print("THE DRINK IS HOT ? ");
        String temperature = scan.nextLine();
        if (temperature == "yes"){
           //System.out.println("Will be serve first");
           boolean isHot= true;
       }else{
           boolean isHot= false;
       } 
       System.out.print("THE DRINK CONTAINS SUGAR ? ");
        String sugar = scan.nextLine();
        if (sugar == "yes"){
           //System.out.println("Will be serve first");
           boolean sugarFree = true;
       }else{
           boolean sugarFree= false;
       }
        Drink drink1 = new Drink(name, productID, price, description, productID, isHot, sugarFree, expiryDate);

        return drink1;
        
        
    }

    @Override
    public String toString() {
        return "Drink{"+ "isHot-->" + isHot + ", sugarFree-->" + sugarFree + ", Consume before-->" + expiryDate + '}';
    }
    
    public String serveFirst(){
       
       if (isIsHot() == true){
           //System.out.println("Will be serve first");
           return "Will be serve first";
       }else{
           //System.out.println("Will be serve then");
           return "Will be serve then" ;
       }
       
}
   public LocalDate Expiry(){
       
       LocalDate actualDate = LocalDate.now();
       expiryDate = LocalDate.now().plusDays(10);
       
       return expiryDate;
   }
    
    
    /**
     * @return the isHot
     */
    public boolean isIsHot() {
        return isHot;
    }

    /**
     * @param isHot the isHot to set
     */
    public void setIsHot(boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * @return the sugarFree
     */
    public boolean isSugarFree() {
        return sugarFree;
    }

    /**
     * @param sugarFree the sugarFree to set
     */
    public void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    /**
     * @return the expiryDate
     */
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    
    
}
