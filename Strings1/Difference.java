package Strings1;

public class Difference {
    
    public static void main(String[] args) {
    String s = "hello";
    String y="helloi";    
    int sum1=0,sum2=0;

    for(int i  =0;i<s.length();i++){
        sum1 += s.charAt(i);
    }

     for(int i  =0;i<y.length();i++){
        sum2 += y.charAt(i);
    }
    System.out.println((char)(sum2-sum1));

        }
    }

