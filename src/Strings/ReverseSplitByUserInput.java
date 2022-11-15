package Strings;

import java.util.Scanner;

//ineuron java --> avaj norueni

public class ReverseSplitByUserInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        String str2="";

        String sarr[] =str1.split(" ");
        for(String elem:sarr){
            for(int i=elem.length()-1;i>=0;i--){
                str2=str2+elem.charAt(i);
            }
            str2=str2+" ";
        }
        System.out.println(str2);



    }
}
