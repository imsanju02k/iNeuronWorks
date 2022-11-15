package Assignment4;

import java.util.Scanner;

public class FindingUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to see the unique letters in the give value : ");
        String str = sc.next();
        String temp="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(temp.indexOf(ch)==-1){
                temp =temp+ch;
            }
            else {
                temp.replace(String.valueOf(ch),"");
            }
        }
        System.out.println(temp + " ");
}
}
