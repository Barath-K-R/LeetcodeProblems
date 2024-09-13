package graphs;
import java.util.*;

public class DetectCycleInUndirectedGraphDFS {
    public static boolean dfs(int[]curr,List<List<Integer>>adjList,Set<Integer>visited){
        visited.add(curr[0]);
        for(int i=0;i<adjList.get(curr[0]-1).size();++i){
            if(adjList.get(curr[0]-1).get(i)==curr[1])
            continue;
            if(visited.contains(adjList.get(curr[0]-1).get(i)))
            return true;

            if(dfs(new int[]{adjList.get(curr[0]-1).get(i),curr[0]}, adjList, visited))
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        List<List<Integer>>adjList=new ArrayList<>();
        adjList.add(new ArrayList<>(Arrays.asList(2,3)));//0
        adjList.add(new ArrayList<>(Arrays.asList(1,5)));//1
        adjList.add(new ArrayList<>(Arrays.asList(1,4,6)));
        adjList.add(new ArrayList<>(Arrays.asList(3)));
        adjList.add(new ArrayList<>(Arrays.asList(2,7)));
        adjList.add(new ArrayList<>(Arrays.asList(3,7)));
        adjList.add(new ArrayList<>(Arrays.asList(5,4)));
        Set<Integer>visited=new HashSet<>();
        System.out.println(dfs(new int[]{1,-1},adjList,visited));
    }
}
