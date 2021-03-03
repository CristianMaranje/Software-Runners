/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class Employee {
    
    float disscount;
    
    public void  getDisscount(Product product) {
        
        disscount = 0.2f*product.getPrice();
  
    }
}
