package intrerface.defaultmethod.hierarchy2;

/*
В вопросе кто ближе в иерархии наследования и чей будет использоваться дефолтный
метод предпочтение отдается классам предкам, а не интерфейсамю
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
