package graphs;
import java.util.*;
public class NumberOfProvinces {
    public static void dfs(int n,List<List<Integer>>adjList,int[]visited){
        if(visited[n]==1)
        return;
        visited[n]=1;
        for(int i=0;i<adjList.get(n-1).size();++i){
           if(visited[adjList.get(n-1).get(i)]==0)
            dfs(adjList.get(n-1).get(i),adjList,visited);
        }
    }
    public static int findCircleNum(int[][] isConnected) {
        int count=0;
        List<List<Integer>>adjList=new ArrayList<>();
        for(int i=0;i<isConnected.length;++i ){
            adjList.add(new ArrayList());  
            for(int j=0;j<isConnected[i].length;++j){
                if(isConnected[i][j]==1 && j!=i){
                    adjList.get(i).add(j+1);
                }
            }
        }
        int[]visited=new int[isConnected.length+1];
        for(int k=1;k<visited.length;++k){
           if(visited[k]==0){
                count++;
                dfs(k,adjList,visited);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][]isConnected={{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(findCircleNum(isConnected));
    }
}
