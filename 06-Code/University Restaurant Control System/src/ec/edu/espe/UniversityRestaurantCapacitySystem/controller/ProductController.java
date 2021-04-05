/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.controller;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import ec.edu.espe.DBManager.utils.DBManager;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Order;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Student;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Tax;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nicolas Hidrobo
 */
public class ProductController {

    public void registerNewOrder() {
        Order order = new Order();
        BasicDBObject doc = new BasicDBObject();
        BasicDBObject docCostumer = new BasicDBObject();
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        //search for existing costrumer in DB
        String costumerID = null;
        do {
            System.out.print("COSTUMER ID: ");
            costumerID = scan.nextLine();
            docCostumer = DBManager.findCostumer(costumerID, "Costumers");
            if (docCostumer.isEmpty()) {
                System.out.println("COSTUMER NOT FOUND");
                docCostumer = DBManager.findCostumer(costumerID, "Costumers");
            }
        } while (docCostumer.isEmpty());
        //gets the products from the mongodb Atlas
        BasicDBList products = addToOrder();
        //creates the order document
        Date todayDate = new Date();
        doc.append("Product", products).append("costumer", docCostumer).append("date", todayDate);
        //saves the order
        DBManager.save(doc, "Orders");
    }

    public BasicDBList addToOrder() {
        Product product = new Product();
        Scanner scan = new Scanner(System.in);
        int option = 1;
        BasicDBList products = new BasicDBList();
        BasicDBObject foundProduct = new BasicDBObject();
        int id = 0;
        while (option == 1) {
            option = 0;
            do {
                System.out.print("SELECT THE ID OF THE PRODUCT YOU WANT TO ADD TO THE ORDER: ");
                id = scan.nextInt();
                foundProduct = DBManager.findProduct(id, "Products");
                if (foundProduct.isEmpty()) {

                    foundProduct = DBManager.findProduct(id, "Products");
                }
                if (foundProduct.isEmpty() == false) {
                    products.add(foundProduct);
                }
            } while (foundProduct.isEmpty());
            System.out.println("1. ADD PRODUCT TO ORDER");
            System.out.println("2. FINISH ORDER");
            option = scan.nextInt();
            scan.nextLine();
        }
        return products;
    }

    public float salesTotal(float price) {
        Tax newValue = new Tax();
        float total;
        total = newValue.getTax() * price;
        total += price;
        return total;
    }
}
