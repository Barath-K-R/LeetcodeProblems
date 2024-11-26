package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }

        int total = 0;
        int res = 0;
        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);

            if (total < 0) {
                total = 0;
                res = i + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
       int[]gas={1,2,3,4},cost={2,2,4,1};
       System.out.println(canCompleteCircuit(gas, cost));
    }
}
