package Assignment4;

import java.util.Scanner;

public class CountNumberOfConsonantsVowelsSpecialChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input String along with SpecialCharacter");
        String str=sc.next();
        str=str.toLowerCase();
        int vowels=0,consonants=0,special_chars=0,numbers=0;

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if((ch>='a' && ch<='z')){
                consonants++;
            }
            else if(ch>='0' && ch<='9'){
                numbers++;
            }
            else if(ch=='$'||ch=='#'||ch=='/'||ch=='%'||ch=='*'||ch=='@'||ch=='!'){
                special_chars++;
            }


        }
        System.out.println("the number of vowels are present in the input string : " + vowels);
        System.out.println("the number of consonants are present in the input string : " + consonants);
        System.out.println("the number of numbers are present in the input string : " + numbers);
        System.out.println("the number of special chars are present in the input string : " + special_chars);

    }
}
