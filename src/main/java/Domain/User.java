package Domain;
import java.util.Scanner;

public class User{
    private int id;
    private String name;

     private String  mail;

     //Getters and Setters
    //-Get-- Siempre lleva retorno
    public int getId(){
        return this.id;
    }
    //Setter
    //Hay que mandarle algo a ese metodo, es decir el argumento que se le entrega a el id
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return this.name;

    }

    public void setName(String name) {
        this.name=name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    //Metodos
    public void createUser(){

    }

    public void listUser(){

    }

    //Constructores

    public User(){}
}
