package graphs;

import java.util.*;

public class DetectCycleInUndirectedGraph {
    public static boolean detectCycle(List<List<Integer>>adjList){
        Queue<int[]>q=new LinkedList<>();
        Set<Integer>visited=new HashSet<>();

        q.add(new int[]{1,-1});
        visited.add(1);
        while(!q.isEmpty()){
            int[]last=q.poll();
            for(int i=0;i<adjList.get(last[0]-1).size();++i){
                if(adjList.get(last[0]-1).get(i)==last[1])
                continue;
                if(visited.contains(adjList.get(last[0]-1).get(i)))
                return true;
                q.add(new int[]{adjList.get(last[0]-1).get(i),last[0]});
                visited.add(adjList.get(last[0]-1).get(i));
            }
        }

        return false;
    }
    public static void main(String[] args) {
        List<List<Integer>>adjList=new ArrayList<>();
        adjList.add(new ArrayList<>(Arrays.asList(2,3)));//0
        adjList.add(new ArrayList<>(Arrays.asList(1,5)));//1
        adjList.add(new ArrayList<>(Arrays.asList(1,4,6)));
        adjList.add(new ArrayList<>(Arrays.asList()));
        adjList.add(new ArrayList<>(Arrays.asList(2,7)));
        adjList.add(new ArrayList<>(Arrays.asList(3)));
        adjList.add(new ArrayList<>(Arrays.asList(5)));
        System.out.println(detectCycle(adjList));
    }
}
