package binarysearch;

import java.util.LinkedList;
import java.util.Queue;

public class Search2DMatrix {

	public static boolean solution(int [][]matrix,int target) {
		int l=0,r=matrix.length-1,mid=0,row=matrix.length-1,col=matrix[0].length-1,curr=0;
		System.out.println(row +" "+col);
		while(l<=r) {
			mid=(l+r)/2;
			System.out.println(matrix[mid][col]+" target="+target);
			if(target==matrix[mid][col])
				return true;
			else if(target<matrix[mid][col])
			{
				curr=mid;
				r=mid-1;
			}
			else if(target>matrix[mid][col])
			{
				l=mid+1;
				curr=l;
			}
			 
			System.out.println("res="+curr);
		}
		System.out.println("res="+curr);
		
		if(curr>=matrix.length)
			return false;
		l=0;
		r=col;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(target==matrix[curr][mid])
				return true;
			else if(target<matrix[curr][mid])
			r=mid-1;
			else if(target>matrix[curr][mid])
				l=mid+1;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][]matrix= {{1}};
		int target=1;
		System.out.println(solution(matrix,target));
		

	}

}
