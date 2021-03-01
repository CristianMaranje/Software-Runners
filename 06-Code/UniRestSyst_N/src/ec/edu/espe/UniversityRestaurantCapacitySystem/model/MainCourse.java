/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.util.Scanner;

/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class MainCourse extends Product {

    int size;
    String type;

    public void serveSecond() {
        System.out.println("your main course is served");
    }

    public MainCourse(String name, int productId, float price, String description, int quantity, int size, String type) {
        super(name, productId, price, description, quantity);
        this.size = size;
        this.type = type;
    }

    public MainCourse addMainCourse() {
        Scanner scan = new Scanner(System.in);

        System.out.print("ENTER THE PRODUCT NAME:");
        String name = scan.nextLine();
        System.out.print("ENTER THE PRODUCT ID:");
        int productID = scan.nextInt();
        scan.nextLine();
        System.out.print("ENTER THE PRODUCT PRICE: ");
        float price = scan.nextFloat();
        scan.nextLine();
        System.out.print("ENTER THE PRODUCT DESCRIPTION: ");
        String description = scan.nextLine();
        System.out.print("ENTER THE CUANTITY: ");
        int quantity = scan.nextInt();
        System.out.print("ENTER THE SIZE:");
        int size = scan.nextInt();
        scan.nextLine();
        System.out.print("ENTER THE TYPE (NORMAL OR VEGAN):");
        String type = scan.nextLine();

        MainCourse mainCourse = new MainCourse(name, productID, price, description, quantity, size, type);

        return mainCourse;
    }

    public MainCourse() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {

        return super.toString() + "MainCourse{" + "size=" + size + ", type=" + type + '}';
    }

    @Override
    public String showEspecifications() {
        return "Product{" + "name=" + getName() + ", productId=" + getProductId() + ", price=" + getPrice() + ", description=" + getDescription() + ", quantity=" + getQuantity() + "size=" + size + ", type=" + type + '}';
    }

    @Override
    public void prepare() {

        System.out.println("Preparing MainCourse -> " + getName());

    }

    @Override
    public Product addNewProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
