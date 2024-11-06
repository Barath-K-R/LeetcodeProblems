import java.util.*;

/**
 * practise
 */
public class practise {

    public static void recursion(int[]arr,int i,List<Integer>curr,List<Integer> res,int sum,int k){
        if(sum==k)
            res.addAll(curr); 
        if(i>=arr.length)
            return;
        curr.add(arr[i]);
        recursion(arr, i+1, curr, res, sum+arr[i], k);
        curr.remove(arr[i]);
        recursion(arr, i+1, curr, res, sum, k);

    }
    public static void main(String[] args) {
        List<Integer>res=new ArrayList<>(),curr=new ArrayList<>();
        int[]arr={3,1,2};
        recursion(arr,0,curr,res,0,4);
        System.out.println(res);
    }
}