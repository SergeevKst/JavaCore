package patterns.behavioral.cmmand;

public class DataBase {
    public void insert(){
        System.out.println("Inserting record");
    }
    public void update(){
        System.out.println("Update record");
    }
    public void select(){
        System.out.println("Reading record");
    }
    public void delete(){
        System.out.println("Deleting record");
    }
}
