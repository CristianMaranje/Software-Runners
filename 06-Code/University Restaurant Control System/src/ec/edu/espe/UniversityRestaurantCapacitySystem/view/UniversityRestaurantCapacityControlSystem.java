package ec.edu.espe.UniversityRestaurantCapacitySystem.view;

import ec.edu.espe.DBManager.utils.DBManager;
import ec.edu.espe.UniversityRestaurantCapacitySystem.controller.Controller;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Administrator;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Costumer;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Employee;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Student;
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

        Scanner scan = new Scanner(System.in);
        Screen display = new Screen();
        List<String> foundLines;
        Product product = new Product();
        Costumer student = new Student();
        Costumer employee= new Employee();
        Administrator cashier = new Administrator();
        Controller controller = new Controller();
        int type;
        int option = 0;
        do {
            option = display.displayMenu();
            switch (option) {
                case 1:
                    cashier.registerNewOrder();
                    break;
                case 2:
                    
                    controller.printAllOrders();

                    break;
                case 3:
                    product.addNewProduct();
    
                    break;
                case 4:
                    System.out.println("SELECT THE TYPE OF COSTUMER :");
                    System.out.println("1.Student");
                    System.out.println("2.Employee");
                    type = scan.nextInt();
                    if (type == 1) {
                        student.addNewCostumer();
                        System.out.println("**NEW STUDENT COSTUMER ADDED***\n");
                    } else {
                        employee.addNewCostumer();
                        System.out.println("**NEW EMPLOYEE COSTUMER ADDED***\n");
                    }
                    break;
                case 5:
                    DBManager.findProduct((display.productToFind()), "Products");

                    break;
                case 6:
                    DBManager.showProducts("Products");
                    //foundLines = FileManager.findAll("productsList.json");
                    //System.out.println(foundLines);
                    break;
                case 7:
                    System.out.println("Exiting ...");
                    Thread.sleep(1 * 1000);
                    System.out.println("Thank you for using this system");
                    System.exit(0);
                    break;

            }
        } while (7 >= option && option > 0);

    }

}
