package ec.edu.espe.UniversityRestaurantCapacitySystem.controller;

import com.google.gson.Gson;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.DBManager.utils.DBManager;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Employee;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Person;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Order;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author GROUP 3 Software-Runners ESPE-DCCO
 */
public class ConnectionController {

    MongoDatabase dataBase;
    //DBCollection collection;
    BasicDBObject doc = new BasicDBObject();
    MongoCollection<Document> collection;
    MongoClient mongo;
    String nameCollection;
    Gson gson = new Gson();

    public void printAllOrders() {

        DBCollection collection = DBManager.initializeMongo("Orders");
        DBCursor cursor = collection.find();

        while (cursor.hasNext()) {

            DBCursor curso2 = collection.find();

            System.out.println("------->>>>>>>  ORDER ID ->(" + cursor.next().get("orderID") + ")  <<<<<<<<-------");
            System.out.println("DATE: " + cursor.curr().get("date") + "\n");
            System.out.println("COSTUMER INFO");
            System.out.println("NAME: " + cursor.next().get("name"));
            System.out.println("ID: " + cursor.curr().get("orderID"));
            System.out.println("E-MAIL: " + cursor.next().get("mail"));
            System.out.println("-------------------------------------------------");
            System.out.println("PRODUCTS INFO");
            float total = 0;
            int cont = 1;
            System.out.println("PRODUCT (" + cont + ")");
            System.out.println("NAME: " + cursor.next().get("date"));
            System.out.println("ID: ");
            System.out.println("PRICE: $");
            System.out.println("DESCRIPTION: ");
            System.out.println("---------------------------------------------");
            //total += product.getPrice();
            cont++;
            System.out.println("TOTAL: $" + total);
            System.out.println("--------------------------------------------\n");

            System.out.println(cursor.next());
            System.out.println("===============================================");
        }

    }

    public ConnectionController(String nameCollection) {
        try {
            this.nameCollection = nameCollection;
            String cluster;
            cluster = "mongodb+srv://Nicolas:IPvZVD9AFJX18l0J@clustercristian.rq2r6.mongodb.net/test?authSource=admin&replicaSet=atlas-904841-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true";

            MongoClientURI uri = new MongoClientURI(cluster);
            mongo = new MongoClient(uri);
            dataBase = mongo.getDatabase("UniversityRestaurant");

            collection = dataBase.getCollection(nameCollection);
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println("Not Connected");
        }
    }

    public ArrayList<Product> retrieveProducts() {
        ArrayList<Product> products = new ArrayList<>();
        MongoCursor<Document> retrievedDocument;
        retrievedDocument = collection.find().iterator();
       
        String name;
        int productId;
        float price;
        String description;
        int quantity;
        Product product;

        while (retrievedDocument.hasNext()) {
            Document object = retrievedDocument.next();
            name = gson.toJson(object.get("name")).replace("\"", "");
            productId = Integer.parseInt(gson.toJson(object.get("productId")));
            price = Float.parseFloat(gson.toJson(object.get("price")));
            description = gson.toJson(object.get("description")).replace("\"", "");
            quantity = Integer.parseInt(gson.toJson(object.get("quantity")));
            product = new Product(name, productId, price, description, quantity);
            products.add(product);

        }
        return products;

    }

    public static String[][] showProducts() {
        ArrayList<Product> products = new ArrayList<Product>();
        ConnectionController connection = new ConnectionController("Products");
        products = connection.retrieveProducts();
        for (Product products1 : products) {
            System.out.println(products1.getName());
        }
        String[][] matrix = new String[products.size()][5];
        for (int i = 0; i < products.size(); i++) {
            matrix[i][0] = products.get(i).getName();
            matrix[i][1] = products.get(i).getProductId() + "";
            matrix[i][2] = products.get(i).getPrice() + "";
            matrix[i][3] = products.get(i).getDescription();
            matrix[i][4] = products.get(i).getQuantity() + "";

        }
        return matrix;
    }

}
