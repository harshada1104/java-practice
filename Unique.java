public class Unique {

    public static void main(String[] args) {
        int array[] = { 1, 1, 2, 2, 3, 3, 4, 4 };

        unique(array);
    }

    public static void unique(int array[]) {
        int i = array[0];
         while (i <= array.length) {
            if (array[i] == array[i+1]) {
                System.out.println("Breaking at i = " + i);
                continue; // Exits the loop when i equals 5
            }
            
            i++;
        }
    
       
    }
}
