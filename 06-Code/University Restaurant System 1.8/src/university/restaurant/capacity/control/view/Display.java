
package university.restaurant.capacity.control.view;

import com.google.gson.Gson;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @authors GROUP 3 Software-Runners ESPE-DCCO
 */
public class Display {

    public String productToFind() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE ID OF THE PRODUCT YOU WANT TO FIND");
        String name = scan.nextLine();
        return name;
    }

    public int displayMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. NEW ORDER");
        System.out.println("2. PRINT All ORDERS");
        System.out.println("3. ADD PRODUCT");
        System.out.println("4. FIND PRODUCT");
        System.out.println("5. SHOW PRODUCTS");
        System.out.println("6. EXIT");
        int option = scan.nextInt();
        return option;
    }
    public void displayAllProducts(List<String> products ){
        Gson gson = new Gson();
        Product product =new Product();
        int cont = 1;
        for (String aviableProduct : products) {
            product = gson.fromJson(aviableProduct, Product.class);
            System.out.println("PRODUCT ("+cont+")");
            System.out.println("NAME: "+ product.getName());
            System.out.println("ID: "+ product.getProductId());
            System.out.println("PRICE: "+ product.getPrice());
            System.out.println("DESCRIPTION: "+ product.getDescription());
            System.out.println("QUANTITY: "+ product.getQuantity());
            System.out.println("--------------------------------------------------------------------------------------------");
            cont++;
        }
       
        
        
    }
}
