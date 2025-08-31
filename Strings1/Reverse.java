package Strings1;
public class Reverse {
//to reverse any string we use two pointer method
    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'};

        reverseString(s);
        
        System.out.println(s);
    }

    public static void reverseString(char[]s){//createing an array of character
        int left =0;//left pointers staring from 0
        int right = s.length-1;//staring from the end

        while(left<right){
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }

}