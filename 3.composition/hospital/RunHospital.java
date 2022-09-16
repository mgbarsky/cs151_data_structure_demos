package hospital;

public class RunHospital {
    public static void main (String [] args) {
        Hospital h = new Hospital("US Best", 10);
        h.addPatient(new Patient());
        h.addPatient(new Patient("Sally Smith", 21, "bruised ego"));
        h.addPatient(new Patient("Bob Swift", 18, "broken heart"));
        System.out.println("In the morning:");
        System.out.println(h);
        
        h.cureAll();
        System.out.println("In the evening:");
        System.out.println(h);       
    }
}
