package Strings;

import java.util.Scanner;

public class ReverseStringWithSplitMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String str1=sc.next();
      String str2="";

      String sArr[]=str1.split(" ");
        System.out.println("this is a original string");
        System.out.println(str1);

      for (int i=sArr.length-1;i>=0;i--)
      {
          str2=str2+sArr[i]+" ";
      }
        System.out.println("this is a swapping side by side string ");
        System.out.println(str2);

        System.out.println("*************************");
      for (String elem:sArr){
          for (int i=elem.length()-1;i>=0;i--){
              str2=str2+elem.charAt(i);
          }
          str2=str2+" ";

      }
        System.out.println(str2);

    }
}
