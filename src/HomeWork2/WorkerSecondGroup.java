package HomeWork2;

public class WorkerSecondGroup extends Worker {
    private byte Group;
       public WorkerSecondGroup(String name, String gender, byte age, double sallary, int medicalPolice) {
        super(name, gender, age, sallary, medicalPolice);
    }

    public byte getGroup() {
        return Group;
    }

    public void setGroup(byte group) {
          if (group ==1)
              Group = group * 1.5;
    }
}
