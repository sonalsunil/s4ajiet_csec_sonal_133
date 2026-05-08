import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        System.out.println("Sorted s1: " + s1);
        System.out.println("Sorted s2: " + s2);
        if(s1.equals(s2)){
             System.out.println("the strings are anagram " );
        }else{
             System.out.println("the strings are not  anagram " );
        }
    }
}
