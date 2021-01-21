
package ec.edu.espe.filemanager.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class FileManager {

    public static void save(String fileName, String data) {

        List<String> lineInformation = retrieveList(fileName);
        try {
            File file = new File(fileName);
            lineInformation.add(data);

            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printer = new PrintWriter(new FileWriter(file, false));

            for (String object : lineInformation) {
                printer.println(object);

            }
            printer.close();

        } catch (IOException ex) {
            System.err.println("Error saving product..");

        }

        System.out.println("saved :)");

    }

    /*public static String find(String fileName, String dataToFind) {
        int counter;
        List<String> dataList;
        dataList = retrieveList(fileName);

        int counter2 = 0;
        for (String line : dataList) {

            String words[] = line.split(";");

            counter = 0;

            for (int i = 0; i <= words.length - 1; i++) {

                if (words[i].indexOf(dataToFind) != -1) {
                    counter = counter + 1;

                }
            }

            if (counter > 0) {
                System.out.println(line);
                counter2 = counter2 + 1;

            }
        }
        if (counter2 == 0) {
            System.out.println("Data not found");
            System.out.println("__________________");
        }
       return dataToFind; 
    }*/

    public static String find(String fileName, String dataToFind){
        // todo saving data in the file name
        String dataToReturn=new String();
        try{
            int counter;
        
        List<String> dataList;
        dataList = retrieveList(fileName);
        
        
       
        for(String line : dataList){
            
            String words[]=line.split(";");
           if(line.contains(dataToFind)){
                dataToReturn=line;
            }
            
        }}
        catch(Exception ex){
            System.out.println("Student's id has not been found");
        }
        return dataToReturn;
        
        
     }
    
    public static void findAll(String fileName) {

        List<String> linesFile = retrieveList(fileName);
        for (String line : linesFile) {
            System.out.println(line);

        }

        System.out.println("----------------------");
    }


    public static boolean update(String fileName, String dataToFind, String datatoUpdate) {

        boolean updated = true;
        System.out.println("updated");
        return updated;

    }

    public static boolean delete(String fileName, String datatodelete) {

        boolean deleted = true;
        System.out.println("deleted");
        return deleted;

    }
    public static List<String> retrieveList(String fileName) {

        ArrayList<String> information = new ArrayList<>();
        try {
            FileReader f = new FileReader(fileName);
            BufferedReader b = new BufferedReader(f);

            String lineFile;

            while ((lineFile = b.readLine()) != null) {
                information.add(lineFile);
            }

        } catch (IOException exception) {
            System.out.println("no existe el archivo");
        }
        return information;

    }
}
