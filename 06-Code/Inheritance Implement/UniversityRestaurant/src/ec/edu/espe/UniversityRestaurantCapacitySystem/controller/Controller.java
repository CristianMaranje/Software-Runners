package ec.edu.espe.UniversityRestaurantCapacitySystem.controller;

import ec.edu.espe.filemanager.utils.FileManager;
import java.util.List;
import ec.edu.espe.UniversityRestaurantCapacitySystem.view.Display;

/**
 *
 * @authors GROUP 3 Software-Runners ESPE-DCCO
 */
public class Controller {


    public void printAllOrders() {
        List<String> orders = FileManager.findAll("ordersList.json");
        Display display = new Display();
        display.displayAllOrders(orders);
    }

}
