/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Costumer;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Inventory;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Order;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Recipt;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Table;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.filemanager.utils.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class Controller {
    
    public Product addNewProduct(){
        Scanner scan=new Scanner(System.in); 
        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
        String name= scan.nextLine();
        System.out.println("INGRESE EL ID DEL PRODUCTO");
        int productID= scan.nextInt();
        scan.nextLine();
        System.out.println("INGRESE EL PRECIO DEL PRODUCTO");
        float price = scan.nextFloat();
        scan.nextLine();
        System.out.println("INGRESE LA DESCRIPCION DEL PRODUCTO");
        String description= scan.nextLine();
        System.out.println("INGRESE LA CANTIDAD");
        int quantity = scan.nextInt();
        
        Product product = new Product(name, productID, price, description, quantity);

        return product;
    }
        
     public void registerOrder() {
         
         System.out.println("Ingrese el ID del producto que desea añadir");
                    ArrayList orders = new ArrayList();
                    Scanner scan=new Scanner(System.in);
                    
                    scan.nextLine();
                    String dataToFind=scan.nextLine();
                    String dataOfFile;
                    //dataOfFile=FileManager.find("students.json", dataToFind);
                    //System.out.println(dataOfFile);
                    try{
                        
                        dataOfFile=FileManager.find("productsList.json", dataToFind);
                        System.out.println(dataToFind);
                    }catch(Exception ex){
                        System.out.println("ID del producto no disponible");
                    }
                     orders.add(dataToFind);
          System.out.println("Desea añadir otro producto a la orden? ");
          System.out.println("1.Si");
          System.out.println("2.No");
          int option =scan.nextInt();
          
          if ( option==1){
               System.out.println("Ingrese el ID del producto que desea añadir");
                    scan.nextLine();
                    try{
                        
                        dataOfFile=FileManager.find("productsList.json", dataToFind);
                        System.out.println(dataToFind);
                    }catch(Exception ex){
                        System.out.println("ID del producto no disponible");
                    }
                     orders.add(dataToFind);
          }else {
              System.out.println(orders);               
}
          }
          
          
    public void displayAnStudent(String lineOfFile){
        
        Student eachStudent=new Student();
        Gson gson=new Gson();
       
        
        eachStudent=gson.fromJson(lineOfFile, Student.class);
        StudentView view = new StudentView(eachStudent);
        view.display();
    } 

    public Recipt printRecipt(Recipt recipt) {

        return recipt;
    }

    public Recipt registerPayment(Recipt recipt) {

        return recipt;
    }

    public Costumer registerCostumer(Costumer costumer) {

        return costumer;
    }
    
     public void table(Table aviable) {

    }

    public void chooseFood() {

    }

    public void chooseTime() {

    }
    
     public void restock(Product product) {

    }

    public Product updateStock(Product newProduct) {

        
        return newProduct;
    }
    
    public void substractStock(Inventory product){
        
        
    }
        
    public void showStock(){
        
    } 
    
    public void addProductToOrder(Product product){
      
        
    }
    
    public void substractProductToOrder(Order order){
        
        
    }
    
    public void substractToInventory(Inventory product){
        
        
    }
    
    
    
}
