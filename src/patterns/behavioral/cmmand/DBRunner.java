package patterns.behavioral.cmmand;

public class DBRunner {
    public static void main(String[] args) {
        DataBase dataBase=new DataBase();

        Developer developer=new Developer(
                new InsertCommand(dataBase),
                new UpdateCommand(dataBase),
                new DeleteCommand(dataBase),
                new SelectCommand(dataBase)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();

    }
}
