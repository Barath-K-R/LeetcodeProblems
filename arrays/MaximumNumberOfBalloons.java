package arrays;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
    public static int maxNumberOfBalloons(String text) {
        String balloon = "balloon";
        HashMap<Character, Integer> originalMap = new HashMap<>(), finalmap = new HashMap<>();
        for (int i = 0; i < balloon.length(); ++i) {
            if (originalMap.containsKey(balloon.charAt(i))) {
                originalMap.put(balloon.charAt(i), originalMap.get(balloon.charAt(i)) + 1);
            } else
                originalMap.put(balloon.charAt(i), 1);
        }
        for (int j = 0; j < text.length(); ++j) {
            if (originalMap.containsKey(text.charAt(j)) && finalmap.containsKey(text.charAt(j))) {
                finalmap.put(text.charAt(j), finalmap.get(text.charAt(j)) + 1);
            } else if (originalMap.containsKey(text.charAt(j)) && !finalmap.containsKey(text.charAt(j)))
                finalmap.put(text.charAt(j), 1);
        }
        if(finalmap.size()!=originalMap.size())
        return 0;
        int min = Integer.MAX_VALUE;
        System.out.println(originalMap);
        System.out.println(finalmap);
        for (Map.Entry<Character, Integer> entry : finalmap.entrySet()) {
            System.out.println(entry.getValue()+" "+originalMap.get(entry.getKey()));
            System.out.println(entry.getValue() / originalMap.get(entry.getKey()));
            min = Math.min(min, entry.getValue() / originalMap.get(entry.getKey()));
        }
        if(min==Integer.MAX_VALUE)
        return 0;
        return min;
    }

    public static void main(String[] args) {
        String text = "lloo";
        System.out.println("ans="+maxNumberOfBalloons(text));
    }
}
