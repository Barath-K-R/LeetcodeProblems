    package dynamicprogramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrogJump {
        
        public static boolean canCross(int[] stones) {
           if (stones == null || stones.length == 0) 
            return false;
        
            Map<Integer, Set<Integer>> dp = new HashMap<>();
            for (int stone : stones) {
                dp.put(stone, new HashSet<>());
            }
            dp.get(0).add(1); 

            for (int i = 0; i < stones.length; i++) {
                int currentStone = stones[i];
                Set<Integer> jumps = dp.get(currentStone);
                for (int jump : jumps) {
                    int nextStone = currentStone + jump;
                    if (nextStone == stones[stones.length - 1]) {
                        return true; // Reached the last stone
                    }
                    if (dp.containsKey(nextStone)) {
                        if (jump - 1 > 0) {
                            dp.get(nextStone).add(jump - 1);
                        }
                        dp.get(nextStone).add(jump);
                        dp.get(nextStone).add(jump + 1);
                    }
                }
            }
            return false; // If we can't reach the last stone
        }
        public static void main(String[] args) {
            int[]stones={0,2};
            System.out.println(canCross(stones));
        }
    }
