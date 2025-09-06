package Practice;

public class Plaindrame {
    public static void main(String[] args) {
        String s = "madam";
        palindromic(s);
    }
    public static void palindromic(String s){
        int left =0;
        int right =s.length()-1;

       while(left<right){
        if(s.charAt(left)==s.charAt(right)){
           left++;
           right--;
            System.out.println("yay it is");
        }else{
            System.out.println("not a plaindrame");
        }
        break;
       }
      

    }
}
