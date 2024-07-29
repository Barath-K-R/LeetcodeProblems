package twopointers;
public class RemoveDuplicatesFromSortedArray2 {
    public static int removeDuplicates(int[] nums) {
        int max=Integer.MIN_VALUE,count=0,pointer=0,res=0;
        for(int i=0;i<nums.length;++i){
            //duplicate found and count is smaller
            if(nums[i]==max && count<2){
                nums[pointer]=nums[i];
                 pointer++;
                 res++;
                 count++;
            }
            //duplicate found but count is greater
            else if(nums[i]==max && count>1){
                count++;
            }
            //unique value found
            else{
                nums[pointer]=nums[i];
                pointer++;
                res++;
                max=nums[i];
                count=1;
            }
        }
        for(int n:nums)
        System.out.println(n);
        return res;
    }
    public static void main(String[] args) {
        int[]nums={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
