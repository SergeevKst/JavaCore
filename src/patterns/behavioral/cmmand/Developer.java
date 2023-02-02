package patterns.behavioral.cmmand;

public class Developer {
   private final Command insert;
   private final Command update;
   private final Command select;
   private final Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecord(){
        insert.execute();
    }
    public void updateRecord(){
        update.execute();
    }
    public void selectRecord(){
       select.execute();
    }
    public void deleteRecord(){
       delete.execute();
    }



}
