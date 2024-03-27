package binarysearch;

public class SquaresOfSortedArray {
 
	public static int[] solution(int[]nums) {
		int[]res=new int[nums.length];
		int l=0,r=nums.length-1,temp=nums.length-1;
		while(l<=r) {
			if(Math.abs(nums[l])>Math.abs(nums[r])) {
				res[temp--]=nums[l]*nums[l];
				System.out.println(res[temp+1]);
				l++;
			}
			else if(Math.abs(nums[l])<Math.abs(nums[r])) {
				res[temp--]=nums[r]*nums[r];
				System.out.println(res[temp+1]);
				r--;
			}
			else {
				res[temp--]=(int) Math.pow(nums[l], 2);
				l++;
			}
			
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums= {-7,-3,2,3,11};
        for(int n:solution(nums))
        	System.out.print(n+" ");
        System.out.println();
	}

}
