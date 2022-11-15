package Arrays;

import java.util.HashSet;

class SubArray{
    public static void main(String[] args) {
        int a[]={11,1,13,21,3,7};
        int b[]={11,3,7,1};
        System.out.print(subArray(a,b) ? "SubArray Present": "SubArray Not Present");
    }
    static boolean subArray(int [] a, int b[]){
        HashSet<Integer> h=new HashSet<>();
        for (int i=0;i<a.length;i++){
            if(!h.contains(a[i]))// just checking the weather elements are present or equal to main array called  a[]={11,1,13,21,3,7};
                h.add(a[i]);
        }
        for (int i=0;i<b.length;i++){
            if (!h.contains(b[i])) // matching to the b[]={11,3,7,1} if one element is not matching it tends to be false subarray
                return false;
        }
        return true;
    }
}