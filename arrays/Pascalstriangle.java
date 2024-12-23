	package arrays;

import java.util.ArrayList;
import java.util.List;

public class Pascalstriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		for(int i=0;i<numRows;++i){
			List<Integer>list=new ArrayList<>();
			list.add(1);
			for(int j=1;j<i;++j){
			  int value=res.get(i-1).get(j-1)+res.get(i-1).get(j);
			  list.add(value);
			}
			if(i!=0)
			list.add(1);
			res.add(list);
		}
		return res;
	}

    public static void main(String[] args) {
        int numRows = 8;
        List<List<Integer>> res = generate(numRows);
        System.out.println(res);
    }
}
