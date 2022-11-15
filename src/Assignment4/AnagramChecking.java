package Assignment4;


import java.util.Arrays;

public class AnagramChecking {
    public static void main(String[] args) {

        String str1="bad credit";
        String str2="debit card";

        str1=str1.replace(" ","");
        str2=str2.replace(" ","");

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Its a Anagram sentence");
        }
        else {
            System.out.println("Its not a Anagram sentence");
        }



    }
}
