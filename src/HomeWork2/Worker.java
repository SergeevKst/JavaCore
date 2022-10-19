package HomeWork2;

public class Worker {
    private String name;
    private String gender;
    private byte age;
    private double sallary;
    private int medicalPolice;

    public Worker(String name, String gender, byte age, double sallary, int medicalPolice) {
        System.out.println("Created worker specialist: ");
        setValue(name, gender, age, sallary, medicalPolice);
        System.out.println(getValue());
    }

    public void setValue(String name, String gender, byte age, double sallary, int medicalPolice) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.sallary = sallary;
        this.medicalPolice = medicalPolice;
    }

    public String getValue() {
        String result1 = "Worker name: " +this.name + ". Gender: " + this.gender + ". Age: " + this.age + ". Sallary: " + this.sallary + ". MedicalPolice: " + this.medicalPolice;
        return result1;
    }
}
