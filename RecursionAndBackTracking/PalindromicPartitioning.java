package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartitioning {
    public static List<List<String>> partition(String s) {
        List<String>list=new ArrayList<>();
        List<List<String>>res=new ArrayList<>();
         backTracking(s, 0, list, res);
         return res;
    }
    public static void backTracking(String s,int index,List<String>list,List<List<String>>res){
        if(index>=s.length()){
            res.add(new ArrayList<>(list));
            System.out.println(list);
            System.out.println("added into res="+res);
            return;
        }

        for(int i=index;i<s.length();++i){
            System.out.println("i="+i);
            System.out.println("check pali="+s.substring(index, i+1));
            if(isPalindrome(s, index, i)){
                System.out.println("pali="+s.substring(index, i+1));
                list.add(s.substring(index, i+1));
                backTracking(s, i+1, list, res);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s,int l,int r){
        if(l==r)
        return true;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s="aabccc";
        System.out.println(partition(s));
    }
}
