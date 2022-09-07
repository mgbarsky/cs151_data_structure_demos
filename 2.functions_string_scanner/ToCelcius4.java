import java.util.Scanner;

public class ToCelcius4 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Fahrenheit to Celcus convertor!");
        System.out.print("Enter temperature in F: ");
        if (s.hasNextDouble()) {
            double f = s.nextDouble();
            double c = TempConvertor.FtoC(f);
            System.out.println(f + " F = " + (int) c + " C");
        }
    }

}
