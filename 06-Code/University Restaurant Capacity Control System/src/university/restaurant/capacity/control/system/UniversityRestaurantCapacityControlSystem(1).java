/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.restaurant.capacity.control.system;

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
        do {
            System.out.println("1. NEW ORDER");
            System.out.println("2. PRINT ORDER");
            System.out.println("3. ADD PRODUCT");
            System.out.println("4. DELETE PRODUCT");
            System.out.println("5. PRINT RECIPT");
            System.out.println("6. SEE AVIABLE TABLES");
            option = scanner.nextInt();
            switch(option) {
                case 1:
                    
                    break;
                
            }
        } while (7 >= option && option > 0);
        
    }

}
