/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

/**
 *
 * @author Nicolas Hidrobo
 */
public class Costumer extends Person {
    
    float disscount;
    
    public Costumer(String name, String mail, String id) {
        super(name, mail, id);
    }

    @Override
    public String toString() {
        return "Costumer{" + "disscount=" + disscount + '}';
    }
    
    
}
