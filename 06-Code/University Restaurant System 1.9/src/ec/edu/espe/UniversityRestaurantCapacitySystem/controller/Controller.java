package ec.edu.espe.UniversityRestaurantCapacitySystem.controller;

import ec.edu.espe.filemanager.utils.FileManager;
import java.util.List;

/**
 *
 * @authors GROUP 3 Software-Runners ESPE-DCCO
 */
public class Controller {


    public void printAllOrders() {
        List<String> orders = FileManager.findAll("ordersList.json");
        for (String order : orders) {
            System.out.println(order);
        }
    }

}
