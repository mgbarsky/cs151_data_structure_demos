public class ToCelcius3 {
    public static void main(String [] args) {
        if( args.length < 1) {
            System.out.println("Usage: java ToCelcius2 <temp1> <temp2> ...");
            System.exit(1);
        }
        
        for (int i=0; i< args.length; i++) {
            try {
                double f = Integer.parseInt(args[i]);
                int c = (int)TempConvertor.FtoC(f);
                        
                System.out.println( args[i] + " F is " + c + " C");
            }catch(NumberFormatException e) {  
                System.out.println("All temperatures must be numbers");
                System.exit(1);
            }
        }        
        System.out.println();
    } 
}
