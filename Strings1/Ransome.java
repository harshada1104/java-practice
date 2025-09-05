package Strings1;

public class Ransome {
    public static void main(String[] args) {
        String ransomNote = "abcc";
        String magazine = "bccc";
        ransome(ransomNote, magazine);
    }

    public static void ransome(String s, String m) {
        for (int i = 0; i < m.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (m.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(j));
                }
            }
        }
    }

}
