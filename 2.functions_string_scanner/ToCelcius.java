
public class ToCelcius {
    public static void main(String [] args) {
        if( args.length < 1) {
            System.out.println("Usage: java ToCelcius <temp in Fahr>");
            System.exit(1);
        }
        
        double f = Integer.parseInt(args[0]);
        System.out.println(TempConvertor.FtoC(f));
    }

}
