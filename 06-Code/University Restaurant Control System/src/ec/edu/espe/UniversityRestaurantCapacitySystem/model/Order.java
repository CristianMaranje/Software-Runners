package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import ec.edu.espe.DBManager.utils.DBManager;
import java.util.Date;
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

    public Order() {
        product = null;
        costumer = null;
        date = null;
    }

    @Override
    public String toString() {
        return "Order{" + ", product=" + product + ", costumer=" + costumer + ", date=" + date + '}';
    }

    public BasicDBList addNewProduct() {
        Product product = new Product();
        Scanner scan = new Scanner(System.in);
        int option = 1;
        BasicDBList products = new BasicDBList();
        BasicDBObject foundProduct = new BasicDBObject();
        int id = 0;
        while (option == 1) {
            option = 0;
            do {
                System.out.print("SELECT THE ID OF THE PRODUCT YOU WANT TO ADD TO THE ORDER: ");
                id = scan.nextInt();

                foundProduct = DBManager.findProduct(id, "Products");

                if (foundProduct.isEmpty()) {
                    System.out.println("PRODUCT NOT FOUND");
                    product.addNewProduct();
                    foundProduct = DBManager.findProduct(id, "Products");
                }
                if(foundProduct.isEmpty()== false){
                    products.add(foundProduct);
                }
                
            } while (foundProduct.isEmpty());

            System.out.println("1. ADD PRODUCT TO ORDER");
            System.out.println("2. FINISH ORDER");
            option = scan.nextInt();
            scan.nextLine();
        }

        return products;
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
