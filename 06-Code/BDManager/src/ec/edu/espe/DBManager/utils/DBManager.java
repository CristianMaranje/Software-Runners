package ec.edu.espe.DBManager.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class DBManager {

    public static void save(BasicDBObject obj, String collectionName) {

        DBCollection collection1 = initializeMongo(collectionName);
        collection1.insert(obj);
    }

    public static void findCostumer(String collectionName) {
        BasicDBObject whereQuery = new BasicDBObject();
        DBCollection collection = initializeMongo(collectionName);
        whereQuery.put("employeeId", 5);
        DBCursor cursor = collection.find(whereQuery);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    /*public static void showOrders(String CollectionName) {
        DBCollection collection1 = initializeMongo(CollectionName);

            DBCursor cursor = collection1.find();
            DBCursor cursor2 = collection1.find();
            
        while (cursor.hasNext()) {

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
    }*/

    public static void showProducts(String CollectionName) {
        DBCollection collection1 = initializeMongo(CollectionName);

        DBCursor cursor = collection1.find();

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
            System.out.println("===============================================");
        }
    }

    public static void findProduct(int id, String CollectionName) {

        DBCollection collection1 = initializeMongo(CollectionName);

        BasicDBObject findProduct = new BasicDBObject();
        findProduct.put("productId", id);
        DBCursor cursor = collection1.find(findProduct);
        while (cursor.hasNext()) {
            System.out.println("Product found---> Name: " + cursor.next().get("name") + " - Product ID:  " + cursor.curr().get("productId") + " - Price:  " + cursor.curr().get("price") + " - Description: " + cursor.curr().get("description") + " - Quantity: " + cursor.curr().get("quantity"));
        }

    }

    public static void updateProducts(int ID, String CollectionName) {

        DBCollection collection1 = initializeMongo(CollectionName);

        BasicDBObject updatePrice = new BasicDBObject();
        updatePrice.append("$set", new BasicDBObject().append("price", 0.5f));

        BasicDBObject findProduct = new BasicDBObject();
        findProduct.append("ID", ID);

        collection1.updateMulti(findProduct, updatePrice);

    }

    public static void deleteProduct(int ID, String CollectionName) {

        DBCollection collection1 = initializeMongo(CollectionName);
        collection1.remove(new BasicDBObject().append("ID", ID));

    }

    public static DBCollection initializeMongo(String CollectionName) {
        MongoClient client = new MongoClient(new MongoClientURI("mongodb+srv://Cristian:t5UDR5Iaiqarbm4k@clustercristian.rq2r6.mongodb.net/test"));
        DB dataBase = client.getDB("UniversityRestaurant");
        DBCollection collection1 = dataBase.getCollection(CollectionName);
        return collection1;
    }
}
