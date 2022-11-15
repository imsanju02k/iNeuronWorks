package Assignment4;

public class PangramChecking {
    public static void main(String[] args) {
        boolean flag=false;
        String str="Amazingly few discotheques provide jukeboxes";
        str=str.toLowerCase();
        str=str.replace(" ","");
        System.out.println(str);

        char ch[]=str.toCharArray();
        int arr[]=new int[26];

        for (int i=0;i<ch.length;i++){
            int index=ch[i]-97;
            arr[index]++;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println("its not a pan_gram sentences");
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("its a pangram sentence");
        }

    }
}
