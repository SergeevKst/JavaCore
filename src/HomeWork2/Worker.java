package HomeWork2;

public class Worker {
    public String name;
    public String gender;
    public byte age;
    public double sallary;
    public int medical_police;


    public void setValue(String name, String gender, byte age, double sallary, int medical_police) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.sallary = sallary;
        this.medical_police = medical_police;
    }

    public String getValue() {
        String result1 = "Worker name: " + name + ". Gender: " + gender + ". Age: " + age + ". Sallary: " + sallary + ". Medical_police: " + medical_police;
        return result1;
    }
}
