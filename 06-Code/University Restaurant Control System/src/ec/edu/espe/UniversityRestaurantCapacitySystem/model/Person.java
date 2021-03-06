package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

/**
 *
 * @author Nicolas Hidrobo
 */
public abstract class Person {

    private String name;
    private String mail;
    private String id;

    public Person(String name, String mail, String id) {
        this.name = name;
        this.mail = mail;
        this.id = id;
    }

    public Person (){
        name = "Default";
        mail = "noMailRegistered";
        id = "noIDRegistered";
    }
    
 
    @Override
    public String toString() {
        return "Costumer{" + "name=" + name + ", mail=" + mail + ", id=" + id + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}