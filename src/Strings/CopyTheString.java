package Strings;

import java.util.Arrays;

public class CopyTheString {
    public static void main(String[] args) {
     String str1="iNeuron Bangalore";//
     String str2="";

     for(int i=0;i<str1.length();i++)
     {
         str2=str2+str1.charAt(i);
     }
        System.out.println(str2);

        System.out.println(" ");
    }

}

