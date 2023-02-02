package intrerface.defaultmethod.hierarchy;
/*
При наследовании интерфейсов возможно переопределение методов.
Если класс не переопределяет default метод будет вызываться ближайший по
иерархии
 */
public class Main {
    public static void main(String[] args) {

        C classC =new C("Konstantin");

        A interfaceA=new C("Learn");
        B interfaceB=new C("Java");

        System.out.println(classC.getMessage());
        System.out.println(interfaceA.getMessage());
        System.out.println(interfaceB.getMessage());
    }
}
