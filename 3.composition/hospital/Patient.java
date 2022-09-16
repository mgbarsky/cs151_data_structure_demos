package hospital;

public class Patient {
    private String name;
    private int age;
    private String malady;
    
    public Patient(String name, int age, String malady) {
        this.name = name;
        this.age = age;
        this.malady = malady;
    }
    
    public Patient() {
        this.name = "John Doe";
        this.age = 25;
        this.malady = "unknown";
    }
    
    public void cure() {
        this.malady = "healthy";
    }  
    
    public String toString() {
        return this.name + ": " + this.malady;
    }
}
