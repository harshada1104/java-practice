package Strings1;

public class PercentageLetter {
public static void main(String[] args) {
    String s ="foobar";
    Character letter = 'o';
letter(s, letter);
    
}   

public static void letter(String s,Character letter){
    int n = s.length();
    double percent = 0;
    int count =0;

    for (char ch : s.toCharArray()){
        System.out.println(ch);
        if(ch == letter ){
       
           count++;
                System.out.println(count);
        }
    }

 percent = ((double)count / n) * 100;
 long rounded = Math.round(percent);

System.out.println(rounded);
}
}
