package university.restaurant.capacity.control.view;

import com.google.gson.Gson;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Costumer;
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
        System.out.println("INGRESE EL ID DEL PRODUCTO QUE QUIERE ENCONTRAR");
        String name = scan.nextLine();
        return name;
    }

    public int displayMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. NUEVA ORDEN");
        System.out.println("2. IMPRIMA TODAS LAS ORDENES");
        System.out.println("3. AÑADIR PRODUCTO");
        System.out.println("4. AÑADIR CLIENTE");
        System.out.println("5. ENCONTRAR PRODCUCTO");
        System.out.println("6. MOSTRAR PRODUCTOS");
        System.out.println("7. SALIR");
        int option = scan.nextInt();
        return option;
    }

    public void displayAllProducts(List<String> products) {
        Gson gson = new Gson();
        Product product = new Product();
        int cont = 1;
        for (String aviableProduct : products) {
            product = gson.fromJson(aviableProduct, Product.class);
            System.out.println("PRODUCT (" + cont + ")");
            System.out.println("NAME: " + product.getName());
            System.out.println("ID: " + product.getProductId());
            System.out.println("PRICE: " + product.getPrice());
            System.out.println("DESCRIPTION: " + product.getDescription());
            System.out.println("QUANTITY: " + product.getQuantity());
            System.out.println("--------------------------------------------------------------------------------------------");
            cont++;
        }

    }
    
    public void displayOfCostumer(List<String> costumers){
        Gson gson = new Gson();
        Costumer costumer = new Costumer();
        int cont = 1;
        for (String costumerToDisplay : costumers) {
            costumer = gson.fromJson(costumerToDisplay, Costumer.class);
            System.out.println("NAME: " + costumer.getName());
            System.out.println("ID: " + costumer.getId());
            System.out.println("E-MAIL: " + costumer.getMail());
            System.out.println("--------------------------------------------------------------------------------------------");
            cont++;
        }
    }
}
