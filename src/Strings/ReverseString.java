package Strings;

import java.util.Scanner;
// iNeuron---> norueNi
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String value to be reverse :");

        String str=sc.next();
        System.out.println(str);
        String str2="";

        System.out.println("This is the reverse string ");
        for(int i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);

    }
}
