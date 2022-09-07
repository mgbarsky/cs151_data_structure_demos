import java.util.Scanner;

public class ToCelcius5 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Fahrenheit to Celcus convertor!");
        System.out.println("Enter temperature ('e' to end): ");
        while(s.hasNextDouble()) {
            double f = s.nextDouble();
            double c = TempConvertor.FtoC(f);
            System.out.println(f + " F = " + (int) c + " C");
        }
    }

}
