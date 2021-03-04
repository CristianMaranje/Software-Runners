package ec.edu.espe.UniversityRestaurantCapacitySystem.controller;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import ec.edu.espe.DBManager.utils.DBManager;

/**
 *
 * @authors GROUP 3 Software-Runners ESPE-DCCO
 */
public class Controller {

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

}
