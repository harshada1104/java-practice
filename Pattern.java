public class Pattern {
     public static void main(String[] args) {
         Pattern pattern = new Pattern(); // create an instance of Pattern1 class
         pattern.printPattern(); // call the method to print the pattern
     }

     public void printPattern(){
            int n = 5;
            for ( int i = 0 ; i<= n; i ++){
                
                System.out.println("*"); // move to the next line after printing all columns in the row
            }
     }
}

