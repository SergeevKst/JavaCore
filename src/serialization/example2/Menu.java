package serialization.example2;

import java.io.*;

public class Menu {
    public static void run() throws IOException, ClassNotFoundException {
        DataObject dataObject = new DataObject(1,"I learn Java");
        File file = new File("recourses", "Serial2.txt");

        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(dataObject);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        DataObject obj = (DataObject) objectInputStream.readObject();
        System.out.println(obj);
        objectInputStream.close();
    }
}

