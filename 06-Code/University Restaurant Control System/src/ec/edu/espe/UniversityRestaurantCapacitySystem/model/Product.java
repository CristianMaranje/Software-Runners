
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Juan Gallardo  Software-Runners ESPE-DCCO
 */
public class Product {
    private String name;
    private int productId;
    private float price;
    private String description;
    private int quantity;

    public Product(String name, int productId, float price, String description, int quantity) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public Product (){
        name= "costumer";
        productId = 0;
        price = (float) 0.00;
        description = "NO DESCRIPTION"; 
        quantity = 0; 
    }
    
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", productId=" + productId + ", price=" + price + ", description=" + description + ", quantity=" + quantity + '}';
    }
    
    
    public Product addNewProduct() {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE PRODUCT NAME:");
        String name = scan.nextLine();
        System.out.println("ENTER THE PRODUCT ID:");
        int productID = scan.nextInt();
        scan.nextLine();
        System.out.print("ENTER THE PRODUCT PRICE: ");
        float price = scan.nextFloat();
        scan.nextLine();
        System.out.print("ENTER THE PRODUCT DESCRIPTION: ");
        String description = scan.nextLine();
        System.out.print("ENTER THE CUANTITY: ");
        int quantity = scan.nextInt();

        Product product = new Product(name, productID, price, description, quantity);

        return product;
    }
    
    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    
    
}
