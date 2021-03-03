package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.google.gson.Gson;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import ec.edu.espe.UniversityRestaurantCapacitySystem.view.Display;

/**
 *
 * @author Nicolas Hidrobo Software-Runners ESPE-DCCO
 */
public class Administrator {

    private String name;
    private ArrayList<Order> cashierOrders;


    public void registerNewOrder(List<Order> orders) {

        //conects to the mongoDB Atlas
        MongoClient client;
        DB dataBase;
        DBCollection collection1;
        client = new MongoClient(new MongoClientURI("mongodb+srv://Cristian:t5UDR5Iaiqarbm4k@clustercristian.rq2r6.mongodb.net/test"));
        dataBase = client.getDB("UniversityRestaurant");
        collection1 = dataBase.getCollection("Orders");

        BasicDBObject doc = new BasicDBObject();
        BasicDBList docProduct = new BasicDBList();
        BasicDBObject docCostumer = new BasicDBObject();

        Display display = new Display();
        Gson gson = new Gson();
        Order order = new Order();
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

        //gets the products from the mongodb Atlas 
        Product[] productToInsert = order.addNewProduct();

        //creates the order
        Date todayDate = new Date();
        Order toInsertInOrder = new Order(newOrderID, productToInsert, costumer, todayDate);

        for (int i = 0; i < productToInsert.length; i++) {
            docProduct.add(new BasicDBObject("name", productToInsert[i].getName())
                    .append("productId", productToInsert[i].getProductId())
                    .append("price", productToInsert[i].getPrice())
                    .append("Description", productToInsert[i].getDescription())
                    .append("Cuantity", productToInsert[i].getQuantity()));
        }

        docCostumer.append("name", costumer.getMail())
                .append("mail", costumer.getMail())
                .append("id", costumer.getId());

        doc.append("orderID", toInsertInOrder.getOrderId())
                .append("Product", docProduct)
                .append("costumer", docCostumer)
                .append("date", toInsertInOrder.getDate());
        collection1.insert(doc);
        
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
