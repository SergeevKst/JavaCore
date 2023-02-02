package patterns.structural.adapter;

public class AdapterJavaToDB extends JavaApplication implements DataBase {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

    @Override
    public void select() {
        loadObject();
    }
}
