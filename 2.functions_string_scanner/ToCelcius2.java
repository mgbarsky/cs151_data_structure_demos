
public class ToCelcius2 {
    public static void main(String [] args) {
        if( args.length < 1) {
            System.out.println("Usage: java ToCelcius2 <temperature>");
            System.exit(1);
        }
        
        try {
            double f = Integer.parseInt(args[0]);
            int c = (int)TempConvertor.FtoC(f);                    
            System.out.println(c);
        } catch(NumberFormatException e) {
            System.out.println("Invalid value for temperature. Try again later.");
            System.exit(1);
        }
    } 
}
