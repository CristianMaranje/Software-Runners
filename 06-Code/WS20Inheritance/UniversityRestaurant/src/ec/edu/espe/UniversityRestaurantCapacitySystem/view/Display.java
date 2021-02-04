package ec.edu.espe.UniversityRestaurantCapacitySystem.view;

import com.google.gson.Gson;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Costumer;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Order;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nicole Lara Software-Runners ESPE-DCCO
 */
public class Display {

    public String productToFind() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE ID OF THE PRODUCT YOU WANT TO FIND");
        String name = scan.nextLine();
        return name;
    }

    public int displayMenu() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("***********RESTAURANT CONTROL SYSTEM***********\n\n");
        System.out.println("1. NEW ORDER");
        System.out.println("2. PRINT All ORDERS");
        System.out.println("3. ADD PRODUCT");
        System.out.println("4. ADD COSTUMER");
        System.out.println("5. FIND PRODUCT");
        System.out.println("6. SHOW PRODUCTS");
        System.out.println("7. EXIT");
        int option = scan.nextInt();
        return option;
    }

    public void displayAllProducts(List<String> products) {
        Gson gson = new Gson();
        Product product = new Product();
        int cont = 1;
        for (String aviableProduct : products) {
            product = gson.fromJson(aviableProduct, Product.class);
            System.out.println("PRODUCT (" + cont + ")");
            System.out.println("NAME: " + product.getName());
            System.out.println("ID: " + product.getProductId());
            System.out.println("PRICE: $" + product.getPrice());
            System.out.println("DESCRIPTION: " + product.getDescription());
            System.out.println("QUANTITY: " + product.getQuantity());
            System.out.println("-------------------------------------------------");
            cont++;
        }

    }

    public void displayOfCostumer(List<String> costumers) {
        Gson gson = new Gson();
        Costumer costumer = new Costumer();
        for (String costumerToDisplay : costumers) {
            costumer = gson.fromJson(costumerToDisplay, Costumer.class);
            System.out.println("NAME: " + costumer.getName());
            System.out.println("ID: " + costumer.getId());
            System.out.println("E-MAIL: " + costumer.getMail());
            System.out.println("-------------------------------------------------");
        }
    }

    public void displayAllOrders(List<String> orders) {
        Gson gson = new Gson();
        Order order = new Order();
        for (String order1 : orders) {
            order = gson.fromJson(order1, Order.class);
            System.out.println("------->>>>>>>  ORDER ID ->(" + order.getOrderId() + ")  <<<<<<<<-------");
            Product[] products = order.getProduct();
            int cont = 1;
            float total = 0;
            System.out.println("DATE: " + order.getDate() + "\n");
            System.out.println("COSTUMER INFO");
            System.out.println("NAME: " + order.getCostumer().getName());
            System.out.println("ID: " + order.getCostumer().getId());
            System.out.println("E-MAIL: " + order.getCostumer().getMail());
            System.out.println("-------------------------------------------------");
            System.out.println("PRODUCTS INFO");
            for (Product product : products) {
                System.out.println("PRODUCT (" + cont + ")");
                System.out.println("NAME: " + product.getName());
                System.out.println("ID: " + product.getProductId());
                System.out.println("PRICE: $" + product.getPrice());
                System.out.println("DESCRIPTION: " + product.getDescription());
                System.out.println("---------------------------------------------");
                total += product.getPrice();
                cont++;
                System.out.println("TOTAL: $" + total);
                 System.out.println("--------------------------------------------\n");
                
            }
            
            
        }
    }

    public void displayReceipt(String orders) {
        Gson gson = new Gson();
        Order order = new Order();
        order = gson.fromJson(orders, Order.class);
        System.out.println("\n------->>>>>>>  RECEIPT ID ->(" + order.getOrderId() + ")  <<<<<<<<-------\n");
        System.out.println("DATE: " + order.getDate());
        System.out.println("COSTUMER INFO");
        System.out.println("NAME: " + order.getCostumer().getName());
        System.out.println("ID: " + order.getCostumer().getId());
        System.out.println("E-MAIL: " + order.getCostumer().getMail());
        System.out.println("-----------------------------------------------------");
        Product[] products = order.getProduct();
        int cont = 1;
        float total = 0;
        System.out.println("PRODUCTS INFO");
        for (Product product : products) {
            System.out.println("PRODUCT (" + cont + ")");
            System.out.println("NAME: " + product.getName());
            System.out.println("ID: " + product.getProductId());
            System.out.println("PRICE: $" + product.getPrice());
            System.out.println("------------------------------------------------");
            total += product.getPrice();
            cont++;
        }
        System.out.println("TOTAL: $" + total);
        System.out.println("-----------------------------------------------------\n");
    }
    

}
