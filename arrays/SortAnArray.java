package arrays;
import java.util.*;
/**
 * SortAnArray
 */
public class SortAnArray {
    public static void sort(int []nums,int low,int high){
        if(low>=high)
        return;
        int mid=(low+high)/2;
        sort(nums, low, mid);
        sort(nums, mid+1, high);
        merge(nums,low,mid,high);
    }

    public static void merge(int[]nums,int low,int mid,int high){
        List<Integer>list=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                    list.add(nums[left]);
                    left++;
            }
            else{
                list.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            list.add(nums[left]);
            left++;
        }

        while(right<=high){
            list.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;++i){
            nums[i]=list.get(i-low);
        }
    }

    public static void main(String[] args) {
        int []nums={4,2,6,2,7};
        sort(nums, 0, nums.length-1);
        for(int n:nums)
        System.out.println(n);
    }
}