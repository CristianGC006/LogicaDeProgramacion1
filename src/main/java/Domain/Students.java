package Domain;

public class Students extends User{

    String studentType;

    @Override
    public void listUser() {
        super.listUser();
    }


    //Sobrecarga de metodos (Polimorfismo) (Method Overload)
    public boolean identifyUser(){

        boolean identified=true;
        return identified;
    }
    //Sobecarga de metodos
    public boolean identified(String qr){
        boolean identified=true;
        return identified;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }
}
