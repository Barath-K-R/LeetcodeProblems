package twopointers;
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int l=0,r=0,max=Integer.MIN_VALUE,count=0;;
        for(int i=0;i<nums.length;++i){
            System.out.println(max+"=="+nums[i]);
            if(nums[i]==max || nums[i]<max){
                System.out.println("equal or greater"+max);
                r=i+1;
                while(r<nums.length && nums[r]<=max){
                    System.out.println("entering the loop");
                    r++;
                }
                if(r>=nums.length)
                {
                    nums[i]=-1;
                }
                else{
                    nums[i]=nums[r];
                    max=nums[r];
                    count++;
                }
            }
            else
            {
                max=nums[i];
                count++;
            }
            System.out.println("max="+max);
        }
        for(int n:nums)
        System.out.println(n);
        return count;
    }
    public static void main(String[] args) {
        int[]nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
