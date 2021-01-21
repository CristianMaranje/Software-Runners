
package university.restaurant.capacity.control.view;

import com.google.gson.Gson;
import ec.edu.espe.UniversityRestaurantCapacitySystem.controller.Controller;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Order;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @authors GROUP 3 Software-Runners ESPE-DCCO
 */
public class UniversityRestaurantCapacityControlSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Display display = new Display();
        List<String> foundLines;
        Product product = new Product();
        List<Order> orders = new ArrayList<Order>();
        Gson gson = new Gson();
        Controller controller = new Controller();
        int option = 0;
        do {
            option = display.displayMenu();
            switch (option) {
                case 1:
                    controller.registerNewOrder(orders);
                    break;
                case 2:
                    controller.printAllOrders();

                    break;
                case 3:
                    FileManager.save("productsList.json", gson.toJson(product.addNewProduct()));
                    break;
                case 4:
                    foundLines = FileManager.find("productsList.json", display.productToFind());
                    System.out.println(foundLines);
                    break;
                case 5:
                    foundLines = FileManager.findAll("productsList.json");
                    System.out.println(foundLines);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (6 >= option && option > 0);

    }

}
