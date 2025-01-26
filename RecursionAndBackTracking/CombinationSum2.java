package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0,res, new ArrayList<>());
        return res;
    }

    private static void dfs(int[] candidates, int target, int i,List<List<Integer>> res, List<Integer> cur) {
        if (target==0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (target<0 || i == candidates.length) {
            return;
        }

        cur.add(candidates[i]);
        dfs(candidates, target-candidates[i], i + 1,res, cur);
        cur.remove(cur.size() - 1);

        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }
        dfs(candidates, target, i + 1,res, cur);
    }
    public static void main(String[] args) {
        int[]candidates={2,2,5,6,6 ,9};
        int target=9;
        List<List<Integer>>res=combinationSum2(candidates, target);
        System.out.println(res);
    }
}
