package ec.edu.espe.FileManagerDB.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class FileManagerDB {

    public static void save(BasicDBObject obj,String collectionName) {

        DBCollection collection1 = initializeMongo(collectionName);
        collection1.insert(obj);
    }

    public static void showProducts(String CollectionName) {
        DBCollection collection1 = initializeMongo(CollectionName);
        
        DBCursor cursor = collection1.find();

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
            System.out.println("===============================================");
        }
    }

    public static void findProduct(int id,String CollectionName) {

       DBCollection collection1 = initializeMongo(CollectionName);

        BasicDBObject findProduct = new BasicDBObject();
        findProduct.put("ID", id);
        DBCursor cursor = collection1.find(findProduct);
        while (cursor.hasNext()) {
            System.out.println("*" + cursor.next().get("NAME") + " - " + cursor.curr().get("ID") + " - " + cursor.curr().get("PRICE") + " - " + " - " + cursor.curr().get("QUANTITY"));
        }

    }

    public static void updateProducts(int ID,String CollectionName) {

        DBCollection collection1 = initializeMongo(CollectionName);

        BasicDBObject updatePrice = new BasicDBObject();
        updatePrice.append("$set", new BasicDBObject().append("price", 0.5f));

        BasicDBObject findProduct = new BasicDBObject();
        findProduct.append("ID", ID);

        collection1.updateMulti(findProduct, updatePrice);

    }

    public static void deleteProduct(int ID,String CollectionName) {

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
