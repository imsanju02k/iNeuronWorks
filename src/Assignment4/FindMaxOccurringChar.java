package Assignment4;


import java.util.Scanner;

public class FindMaxOccurringChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input String : ");
        String st=sc.next();
        System.out.println("the maxOccurringChar are below  : ");
        char ch[]=st.toCharArray();
        int count;
        for (int i=0;i<ch.length;i++){
            count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j] && ch[i]!=0){
                    count++;
                    ch[j]=0;
                }
            }
            if(count>1 && ch[i]!=0){
                System.out.print(ch[i]);
            }

            }
    }
}
