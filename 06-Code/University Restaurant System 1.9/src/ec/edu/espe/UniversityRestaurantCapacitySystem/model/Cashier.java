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
 * @authors GROUP 3 Software-Runners ESPE-DCCO
 */
public class Cashier {

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
        do{
        System.out.print("ENTER THE COSTUMER ID: ");
        String costumerID = scan.nextLine();
        foundCostumer = FileManager.find("costumersList.json", costumerID);
        //display.displayOfCostumer(foundCostumer);
        }while(foundCostumer != null);
        if (foundCostumer == null){
            costumer = costumer.addNewCostumer();
        }
        //finish this part

        //gets the products from the json file productList
        List<String> aviableProducts = FileManager.findAll("productsList.json");
        display.displayAllProducts(aviableProducts);
        int sizeOfAviableProducts = aviableProducts.size();
        int option = 1;
        int cont = 0;

        Order toInsertInOrder;

        Product[] products = new Product[sizeOfAviableProducts];

        while (option == 1) {
            option = 0;
            System.out.print("SELECT THE ID OF THE PRODUCT YOU WANT TO ADD TO THE ORDER: ");
            String id = scan.nextLine();

            List<String> foundProducts = FileManager.find("productsList.json", id);

           /* for (String foundProduct : foundProducts) {
                if (foundProduct != null) {
                    products[cont] = gson.fromJson(foundProduct, Product.class);
                    cont++;
                } else if (foundProduct == null) {
                    break;
                }
            }*/

            System.out.println("1. ADD PRODUCT TO ORDER");
            System.out.println("2. FINISH ORDER");
            option = scan.nextInt();
            scan.nextLine();
        }
         Date todayDate= new Date();
        
        toInsertInOrder = new Order(newOrderID, products, costumer, todayDate);
                /*newOrderID, products, costumer, date);
                orders.add(toInserInOrder);*/
        FileManager.save("ordersList.json", gson.toJson(toInsertInOrder, Order.class));

    }

    public Cashier(String name, ArrayList<Order> cashierOrders) {
        this.name = name;
        this.cashierOrders = cashierOrders;
    }
    
    public Cashier(){
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
