package Assignment4;

import java.util.Scanner;

public class PrintDuplicateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string we as to see the duplicate value to be see :");
        String str1=sc.nextLine().replace(" ","");
        char ch[]=str1.toCharArray();
        System.out.println("This are the duplicate characters present in the above enter string :");
        for(int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.print(ch[j]);
                    break;
                }
            }
        }


    }
}
