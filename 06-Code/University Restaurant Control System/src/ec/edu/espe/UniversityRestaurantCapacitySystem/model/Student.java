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
public class Student  extends Costumer{
    
    private float disscount;

    public Student(float disscount, String name, String mail, String id) {
        super(name, mail, id);
        this.disscount = disscount;
    }

    

    @Override
    public String toString() {
        return "Student{" + "disscount=" + disscount + '}';
    }
   
    
    
    
    public Student() {
    }

    public void getDisscount(Product product) {
        float disscount;

        disscount = 0.15f*product.getPrice();
        
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
