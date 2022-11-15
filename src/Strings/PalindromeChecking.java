package Strings;

import java.util.Scanner;

public class PalindromeChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string which we check the palindrome ");
        String str1=sc.next();
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println("It's a Palindrome");
        }
        else {
            System.out.println("It's Not Palindrome");
        }
    }
}
