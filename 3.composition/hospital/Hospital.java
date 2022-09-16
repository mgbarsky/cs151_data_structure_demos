package hospital;

public class Hospital {    
    private String name;
    private Patient[] patients;
    int numPatients;
    int capacity;
    
    public Hospital(String name, int capacity) {
        this.name = name;
        patients = new Patient[capacity];
        this.capacity = capacity;
    }
    
    public void addPatient(Patient p) {
        if (this.numPatients < this.capacity)
            this.patients[numPatients++] = p;
        else
            System.out.println("Hospital at full capacity."
                    + " Try again later");
    }
    
    public void cureAll() {
        for(int i=0; i<numPatients; i++)
            patients[i].cure();        
    }
    
    public String toString() {
        String result = "";
        for(int i=0; i<numPatients; i++)
            result += patients[i] +System.getProperty("line.separator");
        return result;
    }
}
