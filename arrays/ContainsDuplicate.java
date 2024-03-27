package arrays;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static boolean solution(int[]nums) {
		Set set=new HashSet<Integer>();
		for(int i=0;i<nums.length;++i)
		{
			if(set.contains(nums[i]))
				return true;
			set.add(nums[i]);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]nums= {1,1,1,3,3,4,3,2,4,2};
        System.out.println(solution(nums));
	}

}
