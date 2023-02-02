package serialization.example2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Menu.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
