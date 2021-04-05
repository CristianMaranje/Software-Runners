/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.controller;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.DBManager.utils.DBManager;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Person;
import ec.edu.espe.UniversityRestaurantCapacitySystem.model.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Nicolas HidroboScanner scan = new Scanner(System.in);
 */
public class CostumerController {
    

    public void addNewCostumer(String name , String mail , int costumerID , float disscount) {
       
        BasicDBObject docCostumer = new BasicDBObject();
        docCostumer.append("name", name).append("mail", mail).append("id", costumerID).append("disscount", disscount);
        DBManager.save(docCostumer, "Costumers");
    }

    public boolean validate(String username, String pass) {
        boolean verified = false;
        Gson gson = new Gson();
        ArrayList lineretrived = new ArrayList<>();
        Person costumer;
        String line;
        FileReader readFile;
        BufferedReader read;
        try {
            readFile = new FileReader("costumersList.json");
            read = new BufferedReader(readFile);
            while ((line = read.readLine()) != null) {
                String[] data;
                data = line.split(",");
                for (int i = 0; i < data.length; i++) {
                    if (data[i].equals("{\"name\":\"" + username + "\"")) {
                        lineretrived.add(line);
                        costumer = gson.fromJson(lineretrived.get(i).toString(), Person.class);
                        if (!costumer.getName().equals(username) || !costumer.getId().equals(pass)) {
                        } else {
                            verified = true;
                        }
                    }
                }
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return verified;
    }

    

}
