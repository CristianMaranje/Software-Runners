/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.restaurant.capacity.control.system;

import com.google.gson.Gson;
import ec.edu.espe.UniversityRestaurantCapacitySystem.controller.Controller;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nicole Lara ESPE-DCCO
 */
public class UniversityRestaurantCapacityControlSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        List<String> foundLines;
        Gson gson = new Gson();
        Controller controller = new Controller();
        do {
            System.out.println("1. NEW ORDER");
            System.out.println("2. PRINT ORDER");
            System.out.println("3. ADD PRODUCT");
            System.out.println("4. FIND PRODUCT");
            System.out.println("5. SHOW PRODUCTS");
            System.out.println("6. SEE AVIABLE TABLES");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    FileManager.save("productsList.json", gson.toJson(controller.addNewProduct()));
                    break;
                case 4:
                    foundLines = FileManager.find("productsList.json", controller.productToFind());
                    System.out.println(foundLines);
                    break;
                case 5:
                    foundLines = FileManager.findAll("productsList.json");
                    System.out.println(foundLines);
                    break;
                case 6:

                    break;
            }
        } while (7 >= option && option > 0);

    }

}
