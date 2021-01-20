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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class Controller {

    public Product addNewProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE PRODUCT NAME:");
        String name = scan.nextLine();
        System.out.println("ENTER THE PRODUCT ID:");
        int productID = scan.nextInt();
        scan.nextLine();
        System.out.println("ENTER THE PRODUCT PRICE");
        float price = scan.nextFloat();
        scan.nextLine();
        System.out.println("ENTER THE PRODUCT DESCRIPTION");
        String description = scan.nextLine();
        System.out.println("ENTER THE CUANTITY");
        int quantity = scan.nextInt();

        Product product = new Product(name, productID, price, description, quantity);

        return product;
    }

    public String productToFind() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE ID OF THE PRODUCT YOU WANT TO FIND");
        String name = scan.nextLine();
        return name;
    }

    public void registerNewOrder(List<Order> orders) {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);
        
        List<String> foundOrders = FileManager.retrieveList("ordersList.json");
       
        for (String foundOrder : foundOrders) {
            System.out.println(foundOrder);
            System.out.println("order ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            orders.add(gson.fromJson(foundOrder, Order.class));
        }
        
         for (Order order : orders) {
            System.out.println(order);
            System.out.println("-----------------------------------------------------------------------------");
        }
        
        List<String> aviableProducts = FileManager.findAll("productsList.json");
        
        for (String aviableProduct : aviableProducts) {
            System.out.println(aviableProduct);
            System.out.println("===================================================================");
        }

        System.out.print("SELECT THE ID OF THE PTRODUCT YOU WANT TO ADD TO THE ORDER: ");
        String id = scan.nextLine();
        

        List<String> foundProducts = FileManager.find("productsList.json", id);
        Product[] products = new Product[foundProducts.size()];
        
        for (String foundProduct : foundProducts) {
            System.out.println(foundProduct);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            int i = 0;
            products[i]= gson.fromJson(foundProduct, Product.class);
        }

        for (Product product : products) {
            System.out.println(product);
            System.out.println("-----------------------------------------------------------------------------");
        }
        
        System.out.println("");
    }

    public void substractStock(Inventory product) {

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

    public void showStock() {

    }

    public void addProductToOrder(Product product) {

    }

    public void substractProductToOrder(Order order) {

    }

    public void substractToInventory(Inventory product) {

    }

}
