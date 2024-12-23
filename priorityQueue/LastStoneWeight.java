package priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
     public static int lastStoneWeight(int[] stones) {
        Comparator<Integer> descendingOrder = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b-a; // Reverse the natural order
            }
        };
        PriorityQueue<Integer> heap = new PriorityQueue<>(descendingOrder);
        for(int stone:stones){
            heap.offer(stone);
        }
        while(heap.size()>1){
            int smashstone=heap.poll()-heap.poll();
            if(smashstone>0)
            heap.offer(smashstone);
        }
        return heap.size()>0?heap.poll():0;
    }
    public static void main(String[] args) {
        int[]stones={2,3,6,2,4};
        System.out.println(lastStoneWeight(stones));
    }
}
