package Assignment4;

import java.util.Scanner;

//2552
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which as to be check the Palindrome Sequence");
        String str1=sc.next();
        String str2="";

        for(int i=str1.length()-1;i>=0;i--){
           str2=str2+(str1.charAt(i));
        }
        if(str1.equals(str2)) {
            System.out.println("Yes its a Palindrome");
        }
        else {
            System.out.println("No its not a Palindrome");
        }



    }
}
