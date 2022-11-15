package Strings;

import java.util.Scanner;

public class ChangingU_case_To_L_Case_And_L_Case_To_U_Case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
                str2=str2+(char)(str1.charAt(i)-32);
            }
            else {
                str2=str2+(char)(str1.charAt(i)+32);
            }

        }
        System.out.println(str2);
    }
}
