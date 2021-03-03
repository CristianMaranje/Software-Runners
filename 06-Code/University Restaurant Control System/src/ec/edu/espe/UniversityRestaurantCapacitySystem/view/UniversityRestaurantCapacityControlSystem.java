package ec.edu.espe.UniversityRestaurantCapacitySystem.view;

import com.google.gson.Gson;
import static com.sun.glass.ui.Cursor.setVisible;
import ec.edu.espe.FileManagerDB.utils.FileManagerDB;
import ec.edu.espe.UniversityRestaurantCapacitySystem.controller.Controller;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Administrator;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Costumer;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Employee;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Order;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Student;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristian Maranje Software-Runners ESPE-DCCO
 */
public class UniversityRestaurantCapacityControlSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        LogIn l = new LogIn();
        l.setVisible(true);
        /*Scanner scan = new Scanner(System.in);
        Display display = new Display();
        List<String> foundLines;
        Product product = new Product();
        // Costumer costumer = new Costumer();
        Costumer student = new Student();
        Costumer employee= new Employee();
        List<Order> orders = new ArrayList<Order>();
        Gson gson = new Gson();
        Administrator cashier = new Administrator();
        Controller controller = new Controller();
        int type;
        int option = 0;
        do {
            option = display.displayMenu();
            switch (option) {
                case 1:
                    cashier.registerNewOrder(orders);
                    break;
                case 2:
                    //FileManagerDB.showOrders("Orders");
                    controller.printAllOrders();

                    break;
                case 3:
                    FileManager.save("productsList.json", gson.toJson(product.addNewProduct()));
                    break;
                case 4:
                    System.out.println("SELECT THE TYPE OF COSTUMER :");
                    System.out.println("1.Student");
                    System.out.println("2.Employee");
                    type = scan.nextInt();
                    if (type == 1) {
                        FileManager.save("costumersList.json", gson.toJson(student.addNewCostumer()));
                        System.out.println("**NEW STUDENT COSTUMER ADDED***\n");
                    } else {
                        FileManager.save("costumersList.json", gson.toJson(employee.addNewCostumer()));
                        System.out.println("**NEW EMPLOYEE COSTUMER ADDED***\n");
                    }
                    break;
                case 5:
                    FileManagerDB.findProduct((display.productToFind()), "Products");

                    //foundLines = FileManager.find("productsList.json", display.productToFind());
                    //System.out.println(foundLines);
                    break;
                case 6:
                    FileManagerDB.showProducts("Products");
                    foundLines = FileManager.findAll("productsList.json");
                    System.out.println(foundLines);
                    break;
                case 7:
                    System.out.println("Exiting ...");
                    Thread.sleep(1 * 1000);
                    System.out.println("Thank you for using this system");
                    System.exit(0);
                    break;

            }
        } while (7 >= option && option > 0);*/

    }

}
