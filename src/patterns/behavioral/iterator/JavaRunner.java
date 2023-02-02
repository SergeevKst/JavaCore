package patterns.behavioral.iterator;

public class JavaRunner {
    public static void main(String[] args) {

        String[] skills = {"Java", "Spring", "Hibernate"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Sergeev", skills);

        Iterator<String> iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
