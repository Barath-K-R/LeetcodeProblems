package arrays;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	Stack<Integer>stack=new Stack<Integer>();
    	HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
    	int[]res=new int[nums1.length];
    	for(int i=0;i<nums1.length;++i) {
    		map.put(nums1[i], i);
    	}
    	for(int j=0;j<nums2.length;++j) {
    		
			while(!stack.isEmpty() && nums2[j]>stack.peek()) {
    			res[map.get(stack.pop())]=nums2[j];
    		}
    		
    		if(map.containsKey(nums2[j])) {
    			stack.add(nums2[j]);
    		}
    	}
    	
    	while(!stack.isEmpty()) {
			res[map.get(stack.pop())]=-1;
		}
         return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums1= {2,4},nums2= {1,2,3,4};
		for(int n:nextGreaterElement(nums1, nums2)) {
			System.out.println(n);
		}

	}

}
