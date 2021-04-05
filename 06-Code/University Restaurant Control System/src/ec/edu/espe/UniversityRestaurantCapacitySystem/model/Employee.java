/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class Employee extends Person{
    
    private float disscount;

    public Employee(String name, String mail, String id, float disscount) {
        super(name, mail, id);
    }

    public Employee() {
    }
    

    @Override
    public String toString() {
        return "Employee{" + "disscount=" + getDisscount() + '}';
    }

    /**
     * @return the disscount
     */
    public float getDisscount() {
        return disscount;
    }

    /**
     * @param disscount the disscount to set
     */
    public void setDisscount(float disscount) {
        this.disscount = disscount;
    }
    

    
}
