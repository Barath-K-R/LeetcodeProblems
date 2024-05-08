package arrays;

import java.util.ArrayList;
import java.util.List;

public class Pascalstriangle {
	public static List<List<Integer>> generate(int numRows) {
	    List<List<Integer>> res = new ArrayList<>();
	    ArrayList<Integer> prev = new ArrayList<>();
	    for(int i = 0; i < numRows; ++i) {
	        ArrayList<Integer> curr = new ArrayList<>();
	        curr.add(1);
	        if(i > 0)
	            curr.add(1);
	        for(int j = 1; j < prev.size(); ++j) {
	            int sum = prev.get(j) + prev.get(j - 1);
	            curr.add(j, sum);
	        }
	        res.add(curr);
	        prev = curr;
	    }
	    return res;
	}

    public static void main(String[] args) {
        int numRows = 8;
        List<List<Integer>> res = generate(numRows);
        System.out.println(res);
    }
}
