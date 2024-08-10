package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set=new HashSet<>();
        List<Integer>l=new ArrayList<>();
        
        int temp=0;
        for(int i=0;i<nums1.length;++i){
            if(!set.contains(nums1[i]))
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;++j){
            if(set.contains(nums2[j])){
                l.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int[]res=new int[l.size()];
        for(int n:l)
        res[temp++]=n;
        return res;
    }
    public static void main(String[] args) {
        int []nums1={4,9,5},nums2={9,4,9,8,4};
        int[]res=intersection(nums1, nums2);
        for(int n:res)
        System.out.print(n+" ");
    }
}
