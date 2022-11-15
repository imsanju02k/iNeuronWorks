package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="race";
        String str2="care";

        str1=str1.replace(" ","");
        str2=str2.replace(" ","");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char [] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Its Anagram");
        }
        else {
            System.out.println("Its not Anagram");
        }



    }
}
