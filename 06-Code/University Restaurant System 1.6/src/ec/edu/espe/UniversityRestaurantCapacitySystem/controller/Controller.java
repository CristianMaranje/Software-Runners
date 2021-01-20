/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Costumer;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Order;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Table;
import ec.edu.espe.filemanager.utils.FileManager;
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

        List<String> foundOrders = FileManager.findAll("ordersList.json");

        for (String foundOrder : foundOrders) {
                        orders.add(gson.fromJson(foundOrder, Order.class));
        }

        int newOrderID = 1;

        for (Order order : orders) {

            if (order.getOrderId() == newOrderID) {
                newOrderID = ++newOrderID;
            }
        }

        List<String> aviableProducts = FileManager.findAll("productsList.json");

        for (String aviableProduct : aviableProducts) {
            System.out.println(aviableProduct);
            System.out.println("===================================================================");
        }

        int option = 1;
        int cont = 0;

        Order toInserInOrder;
        Product[] products = new Product[5];

        while (option ==1){
            option = 0;
            System.out.print("SELECT THE ID OF THE PRODUCT YOU WANT TO ADD TO THE ORDER: ");
            String id = scan.nextLine();

            List<String> foundProducts = FileManager.find("productsList.json", id);

            for (String foundProduct : foundProducts) {
                products[cont] = gson.fromJson(foundProduct, Product.class);
                
            }

            System.out.println("1. ADD PRODUCT TO ORDER");
            System.out.println("2. FINISH ORDER");
            option = scan.nextInt();
            scan.nextLine();
            cont++;
        } 
        toInserInOrder = new Order(newOrderID, products);
        orders.add(toInserInOrder);
        FileManager.save("ordersList.json", gson.toJson(toInserInOrder, Order.class));
        
    }

    
    public void printOrder() {
        List<String> orders = FileManager.findAll("ordersList.json");
        for (String order : orders) {
            System.out.println(order);
        }
    }

}
