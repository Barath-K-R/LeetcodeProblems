package arrays;

public class RemoveElement {

     public static int removeElement(int[] nums, int val) {
    	 int left=0,right=nums.length-1,count=0;
    	 while(left<=right) {
    		 if(nums[right]==val)
    		 {
    			 nums[right]=-1;
    			 right--;
    		 }
    		 else if(nums[left]==val) {
    			 nums[left]=nums[right];
    			 nums[right]=-1;
    			 count++;
    			 right--;
    			 left++;
    		 }
    		 else {
    			 count++;
    			 left++;
    		 }
    	 }
    	 for(int n:nums)
    		 System.out.println(n);
        return count;
    } 
	public static void main(String[] args) {
		
         int[]nums= {3,2,2,3};
         int val=3;
         System.out.println(removeElement(nums, val));
	}

}
