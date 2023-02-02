package patterns.creational.builder.person;

public class Main {
    public static void main(String[] args) {
        Person person=new PersonBuilderImpl()
                .name("Ivan")
                .build();

        Person person1= new PersonBuilderImpl()
                .age(25)
                .sex("Men")
                .name("Konstantin")
                .build();

        System.out.println(person);
        System.out.println(person1);
    }
}
