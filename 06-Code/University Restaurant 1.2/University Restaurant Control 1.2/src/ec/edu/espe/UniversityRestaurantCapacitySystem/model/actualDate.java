/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class actualDate {

    public static void main(String args[]) { 
        // Crear una instancia de un objeto Date invocando su constructor 
        Date objDate = new Date(); 
 
        // Mostrar la fecha y la hora usando toString ()
        System.out.println(objDate.toString());
    }
}
    
    /*public static String todayDate(){
            
        
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/nn/aaaa");
        
        return formatDate.format(date);
    
        }
    */

