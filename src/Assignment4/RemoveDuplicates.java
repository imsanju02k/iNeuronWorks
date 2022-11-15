package Assignment4;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value ");
        String str=sc.nextLine();
        System.out.println("the old string without removing the duplicates ");
        System.out.println(str);
        System.out.println("the new string with removing the duplicate are below");

        String newStr="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(newStr.indexOf(ch)==-1){
                newStr+=ch;
            }
        }
        System.out.print(newStr);
    }
}
