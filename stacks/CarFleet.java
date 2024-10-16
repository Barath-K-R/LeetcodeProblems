package stacks;

/**
 * CarFleet
 */
import java.util.*;

public class CarFleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int[][]combine=new int[position.length][2];
        for(int i=0;i<position.length;++i){
            combine[i][0]=position[i];
            combine[i][1]=speed[i];
        }

        Arrays.sort(combine, java.util.Comparator.comparingInt(o -> o[0]));
        Stack<Double>st=new Stack<>();
        for(int j=combine.length-1;j>=0;--j){
            double time=(double)(target-combine[j][0])/combine[j][1];
            if(!st.isEmpty() && time<=st.peek())
            continue;
            else
            st.push(time);
        }
        return st.size();
    }
    public static void main(String[] args) {
        int target=12;
        int[]position={10,8,0,5,3},speed={2,4,1,1,3};
        System.out.println(carFleet(target, position, speed));
    }
}