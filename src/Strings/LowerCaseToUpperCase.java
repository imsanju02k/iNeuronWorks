package Strings;

import java.util.Scanner;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string value to convert the lower case to upper case");

        String str1=sc.next();
        String str2="";

        for (int i=0;i<str1.length();i++){
            //str2=str2+(char)(str1.charAt(i)-32);//lowercase To uppercase
            str2=str2+(char)(str1.charAt(i)+32);//uppercase To lowercase
        }
        System.out.println(str2);

    }
}
