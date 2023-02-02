package serialization.example2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataObject implements Serializable {

    private int id;
    private String word;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(id);
        objectOutputStream.writeObject(word);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();

        id = (Integer) objectInputStream.readObject();

        word = (String) objectInputStream.readObject();
    }

    public DataObject(int id, String word) {
        this.id = id;
        this.word = word;
    }

    @Override
    public String toString() {
        return "Data object{" +
                "id=" + id +
                ", word='" + word + '\'' +
                '}';
    }
}
