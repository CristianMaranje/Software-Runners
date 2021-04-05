package ec.edu.espe.UniversityRestaurantCapacitySystem.view;

import ec.edu.espe.DBManager.utils.DBManager;
import ec.edu.espe.UniversityRestaurantCapacitySystem.controller.ConnectionController;
import ec.edu.espe.UniversityRestaurantCapacitySystem.controller.CostumerController;
import ec.edu.espe.UniversityRestaurantCapacitySystem.controller.ProductController;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Administrator;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Person;
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
        CostumerController student = new CostumerController();
        CostumerController employee= new CostumerController();
        Administrator cashier = new Administrator();
        ProductController controller = new ProductController();
        LogIn log = new LogIn();
            log.setVisible(true);
    }
    
    
    }      
        
        



