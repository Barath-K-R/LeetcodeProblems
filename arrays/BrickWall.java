package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
    public static int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxGaps = 0;

        for(List<Integer> row : wall) {
            int pos = 0;
            for(int i=0; i<row.size()-1; i++) {
                pos += row.get(i);
                map.put(pos, map.getOrDefault(pos, 0)+1);
                maxGaps = Math.max(maxGaps, map.get(pos));
            }
        }

        return wall.size() - maxGaps;
    }
    public static void main(String[] args) {
        List<List<Integer>> wall =new ArrayList<>();
        wall.add(new ArrayList<>(Arrays.asList(1)));
        wall.add(new ArrayList<>(Arrays.asList(1)));
        wall.add(new ArrayList<>(Arrays.asList(1)));
        
        System.out.println(leastBricks(wall));
    }
}
