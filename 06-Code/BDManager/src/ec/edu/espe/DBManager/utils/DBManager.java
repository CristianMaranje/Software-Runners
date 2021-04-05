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

    public static BasicDBObject findCostumer(String id, String collectionName) {
        BasicDBObject foundCostumer = new BasicDBObject();
        DBCollection collection = initializeMongo(collectionName);
        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("id", id);
        DBCursor cursor = collection.find(whereQuery);
        while (cursor.hasNext()) {
            foundCostumer.append("name", cursor.next().get("name")).append("id", cursor.curr().get("id")).append("disscount", cursor.curr().get("disscount"));
        }
        return foundCostumer;
    }

    
    public static void showProducts(String CollectionName) {
        DBCollection collection1 = initializeMongo(CollectionName);

        DBCursor cursor = collection1.find();

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
            System.out.println("===============================================");
        }
    }

    public static BasicDBObject findProduct(int id, String CollectionName) {

        DBCollection collection1 = initializeMongo(CollectionName);

        BasicDBObject findProduct = new BasicDBObject();
        findProduct.put("productId", id);
        BasicDBObject foundProduct = new BasicDBObject();
        DBCursor cursor = collection1.find(findProduct);
        while (cursor.hasNext()) {
            foundProduct.append("name", cursor.next().get("name")).append("productId", cursor.curr().get("productId")).append("price", cursor.curr().get("price")).append("description", cursor.curr().get("description")).append("quantity", cursor.curr().get("quantity"));
            System.out.println("****"+foundProduct);
        }
        return foundProduct;
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
