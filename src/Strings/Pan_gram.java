package Strings;

public class Pan_gram {
    public static void main(String[] args) {
        boolean flag=false;
        /*String s1="Amazingly few discotheques provide jukeboxes";
        s1=s1.toUpperCase();*/
        String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        s1=s1.replace(" ","");
        System.out.println(s1);

        char [] ch=s1.toCharArray();
        int [] arr=new int[26];
        for (int i=0;i<ch.length;i++){
            int index=ch[i]-65;
            arr[index]++;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println("It's not pangram");
                flag=true;
            }

        }
        if(flag==false){
            System.out.println("Its pangram");
        }

    }
}
