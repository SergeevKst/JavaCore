package intrerface.defaultmethod.sample;

public class Runner {
    public static void main(String[] args) {

        SampleInterface classA=new ClassA("Hello Konstantin");
        SampleInterface classB=new ClassB("Hello Konstantin");

        System.out.println(classA.getMessage());
        System.out.println(classB.getMessage());
    }
}
