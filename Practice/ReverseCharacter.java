package Practice;

public class ReverseCharacter {
    public static void main(String[] args) {
        Character s []={'h','e','l','l','o'};
        revsers(s);
       for(int i =0;i<s.length;i++){
        System.out.print(s[i]);
       }
    }

    public static void revsers(Character[]s){
        int left =0;
        int right =s.length-1;
        while(left<right){
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }

    }
}
