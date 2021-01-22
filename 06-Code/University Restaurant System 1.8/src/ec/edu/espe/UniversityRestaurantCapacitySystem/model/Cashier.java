package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;
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
        Display display= new Display();
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);

        //gets the orders from the json file orderList
        List<String> allOrders = FileManager.findAll("ordersList.json");

        for (String foundOrder : allOrders) {
            orders.add(gson.fromJson(foundOrder, Order.class));
        }

        int newOrderID = 1;

        for (Order order : orders) {
            if (order.getOrderId() == newOrderID) {
                newOrderID = ++newOrderID;
            }
        }

        List<String> aviableProducts = FileManager.findAll("productsList.json");
        display.displayAllProducts(aviableProducts);
        

        int option = 1;
        int cont = 0;

        Order toInserInOrder;

        Product[] products = new Product[100];

        while (option == 1) {
            option = 0;
            System.out.print("SELECT THE ID OF THE PRODUCT YOU WANT TO ADD TO THE ORDER: ");
            String id = scan.nextLine();

            List<String> foundProducts = FileManager.find("productsList.json", id);

            for (String foundProduct : foundProducts) {
                if (foundProduct != null) {
                    products[cont] = gson.fromJson(foundProduct, Product.class);
                } else if (foundProduct == null) {
                    break;
                }
            }

            System.out.println("1. ADD PRODUCT TO ORDER");
            System.out.println("2. FINISH ORDER");
            option = scan.nextInt();
            scan.nextLine();
            cont++;
        }
        toInserInOrder = new Order(newOrderID, products, //costumer, date);
                orders.add(toInserInOrder);
        FileManager.save("ordersList.json", gson.toJson(toInserInOrder, Order.class));

    }

    public Cashier(String name, ArrayList<Order> cashierOrders) {
        this.name = name;
        this.cashierOrders = cashierOrders;
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
