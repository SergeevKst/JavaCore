package patterns.structural.adapter;

public class DatsBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDB();

        dataBase.insert();
        dataBase.remove();
        dataBase.select();
        dataBase.update();
    }
}
