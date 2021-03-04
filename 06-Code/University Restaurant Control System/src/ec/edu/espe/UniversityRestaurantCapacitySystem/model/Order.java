
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.google.gson.Gson;
import ec.edu.espe.UniversityRestaurantCapacitySystem.view.Display;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nicole Lara Software-Runners ESPE-DCCO
 */
public class Order {

    
    private Product product[];
    private Costumer costumer;
    private Date date;

    public Order(Product[] product, Costumer costumer, Date date) {
        this.product = product;
        this.costumer = costumer;
        this.date = date;
    }

    public Order(){
        product = null;
        costumer = null;
        date = null;
    }
    
    @Override
    public String toString() {
        return "Order{" + ", product=" + product + ", costumer=" + costumer + ", date=" + date + '}';
    }

    public Product[] addNewProduct(){
        Display display = new Display();
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);
        List<String> aviableProducts = FileManager.findAll("productsList.json");
        display.displayAllProducts(aviableProducts);
        int sizeOfAviableProducts = aviableProducts.size();
        int option = 1;
        int cont = 0;

        Product[] products = new Product[sizeOfAviableProducts];
        
        while (option == 1) {
            option = 0;
            System.out.print("SELECT THE ID OF THE PRODUCT YOU WANT TO ADD TO THE ORDER: ");
            String id = scan.nextLine();

            List<String> foundProducts = FileManager.find("productsList.json", id);

            for (String foundProduct : foundProducts) {
                products[cont] = gson.fromJson(foundProduct, Product.class);
                cont++;
            }

            System.out.println("1. ADD PRODUCT TO ORDER");
            System.out.println("2. FINISH ORDER");
            option = scan.nextInt();
            scan.nextLine();
            
            
        }
        
        int cont2=0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                cont2++;
            }
        }
        Product[] productToInsert = new Product[cont2];
        
        for (int i = 0; i < cont; i++) {
            productToInsert[i] = products[i];
            
        }
        return productToInsert;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

}
