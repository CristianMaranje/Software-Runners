package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import university.restaurant.capacity.control.view.Display;

/**
 *
 * @author Nicolas Hidrobo Software-Runners ESPE-DCCO
 */
public class Administrator {

    private String name;
    private ArrayList<Order> cashierOrders;

    public void registerNewOrder(List<Order> orders) {
        Display display = new Display();
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);
        Costumer costumer = new Costumer();
        List<String> allOrders = FileManager.findAll("ordersList.json");

        int newOrderID = 1;

        for (String foundOrder : allOrders) {
            orders.add(gson.fromJson(foundOrder, Order.class));
            newOrderID = ++newOrderID;
        }

        //search for existing costumers and creates a new one
        List<String> allCostumers = FileManager.findAll("costumersList.json");
        List<String> foundCostumer;
        do {
            System.out.print("COSTUMER ID: ");
            String costumerID = scan.nextLine();
            foundCostumer = FileManager.find("costumersList.json", costumerID);
            if (foundCostumer == null) {
                FileManager.save("costumersList.json", gson.toJson(costumer.addNewCostumer()));
            }
        } while (foundCostumer == null);
        display.displayOfCostumer(foundCostumer);
        for (String string : foundCostumer) {
            costumer = gson.fromJson(string, Costumer.class);
        }

        //gets the products from the json file productList
        List<String> aviableProducts = FileManager.findAll("productsList.json");
        display.displayAllProducts(aviableProducts);
        int sizeOfAviableProducts = aviableProducts.size();
        int option = 1;
        int cont = 0;

        Product[] products = new Product[sizeOfAviableProducts];

        while (option == 1) {
            option = 0;
            System.out.print("SELECT THE ID OF THE PRODUCT YOU WANT TO ADD TO THE ORDER: ");
            String id = scan.nextLine();

            List<String> foundProducts = FileManager.find("productsList.json", id);

            for (String foundProduct : foundProducts) {
                products[cont] = gson.fromJson(foundProduct, Product.class);
                cont++;
            }

            System.out.println("1. ADD PRODUCT TO ORDER");
            System.out.println("2. FINISH ORDER");
            option = scan.nextInt();
            scan.nextLine();
            
            
        }
        
        int cont2=0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                cont2++;
            }
        }
        Product[] productToInsert = new Product[cont];
        for (int i = 0; i < cont; i++) {
            productToInsert[i] = products[i];
            
        }
        
        
        Date todayDate = new Date();
        Order toInsertInOrder;
        toInsertInOrder = new Order(newOrderID, productToInsert, costumer, todayDate);
        orders.add(toInsertInOrder);
        FileManager.save("ordersList.json", gson.toJson(toInsertInOrder, Order.class));
        display.displayReceipt(gson.toJson(toInsertInOrder, Order.class));
        
        
        
    }

    public Administrator(String name, ArrayList<Order> cashierOrders) {
        this.name = name;
        this.cashierOrders = cashierOrders;
    }

    public Administrator() {
        name = "TheSuperCashier";
        cashierOrders = null;
    }

    @Override
    public String toString() {
        return "Cashier{" + "name=" + name + ", cashierOrders=" + cashierOrders + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getCashierOrders() {
        return cashierOrders;
    }

    public void setCashierOrders(ArrayList<Order> cashierOrders) {
        this.cashierOrders = cashierOrders;
    }

}
