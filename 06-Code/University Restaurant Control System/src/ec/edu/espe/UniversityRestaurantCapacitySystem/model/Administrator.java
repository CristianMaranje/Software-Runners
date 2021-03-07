package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.google.gson.Gson;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import ec.edu.espe.DBManager.utils.DBManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Nicolas Hidrobo Software-Runners ESPE-DCCO
 */
public class Administrator {

    private String name;
    private ArrayList<Order> cashierOrders;

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
                student.addNewCostumer();
                docCostumer = DBManager.findCostumer(costumerID, "Costumers");
            }

        } while (docCostumer.isEmpty());

        //gets the products from the mongodb Atlas 
        BasicDBList products = order.addNewProduct();

        //creates the order document
        Date todayDate = new Date();
        doc.append("Product", products)
                .append("costumer", docCostumer)
                .append("date", todayDate);

        //saves the order
        DBManager.save(doc, ("Orders"));
    }

    public boolean validate(String username, String pass) {
        boolean verified = false;
        Gson gson = new Gson();
        ArrayList lineretrived = new ArrayList<>();
        Costumer costumer;
        String line;
        FileReader readFile;
        BufferedReader read;
        try {
            readFile = new FileReader("costumersList.json");
            read = new BufferedReader(readFile);
            while ((line = read.readLine()) != null) {
                String[] data;
                data = line.split(",");
                for (int i = 0; i < data.length; i++) {
                    if (data[i].equals("{\"name\":\"" + username + "\"")) {
                        lineretrived.add(line);
                        costumer = gson.fromJson(lineretrived.get(i).toString(), Costumer.class);
                        if (!costumer.getName().equals(username) || !costumer.getId().equals(pass)) {
                        } else {
                            verified = true;
                        }
                    }
                }
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return verified;
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
