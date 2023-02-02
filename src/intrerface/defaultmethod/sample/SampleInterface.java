package intrerface.defaultmethod.sample;

public interface SampleInterface {
    default String getMessage(){
        return "Default";
    }
}
