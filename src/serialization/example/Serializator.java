package serialization.example;

import java.io.*;

public class Serializator {
    public boolean serializator(Cat cat) {
        boolean flag = false;

        File file = new File("recourses", "Serial.txt");
        ObjectOutputStream output = null;

        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            if (fileOutputStream != null) {
                output = new ObjectOutputStream(fileOutputStream);
                output.writeObject(cat);
                flag = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return flag;
    }

    public Cat getSerialCat() {
        File file = new File("recourses", "Serial.txt");
        ObjectInputStream input = null;
        Cat cat = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream != null) {
                input = new ObjectInputStream(fileInputStream);
                cat = (Cat) input.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return cat;
    }
}
