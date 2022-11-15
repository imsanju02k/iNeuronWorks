package Strings;

public class SwappingTheStrings {
    public static void main(String[] args) {
        String str1="sanju";
        String str2="sanjay";

        System.out.println(str1);
        System.out.println(str2);

        String temp=str1;
        str1=str2;
        str2=temp;
        System.out.println(str1);
        System.out.println(str2);
    }
}
