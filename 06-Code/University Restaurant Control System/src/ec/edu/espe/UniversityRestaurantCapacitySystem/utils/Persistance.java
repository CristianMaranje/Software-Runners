
package ec.edu.espe.UniversityRestaurantCapacitySystem.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;

/**
 *
 * @author Xavier Cordova ESPE-DCCO
 */
public interface Persistance {

    DBCollection initializeMongo(String CollectionName);
    void save(BasicDBObject obj, String collectionName);
    BasicDBObject findCostumer(String id, String collectionName);
    BasicDBObject findProduct(int id, String CollectionName);
    void updateProducts(int ID, String CollectionName);
    void deleteProduct(int ID, String CollectionName);
    
}

    

