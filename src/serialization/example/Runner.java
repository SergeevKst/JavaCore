package serialization.example;

public class Runner {
    public static void main(String[] args) {
        Serializator serializator = new Serializator();

        Cat cat = new Cat();
        cat.setName("Tim");

        serializator.serializator(cat);

        System.out.println(serializator.getSerialCat().getName());
    }
}
