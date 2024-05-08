package arrays;

import java.util.HashMap;

public class MajorityElement {

     public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
        int max=nums[0];
        for(int i=0;i<nums.length;++i) {
        	if(map.containsKey(nums[i])) {
        		map.put(nums[i],map.get(nums[i])+1);
        		if(map.get(nums[i])>=nums.length/2)
        		{
        			if(map.get(nums[i])>map.get(max)) {
        				max=nums[i];
        			}
        		}
        	}
        	else {
        		map.put(nums[i],1);
        	}
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]nums= {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
	}

}
