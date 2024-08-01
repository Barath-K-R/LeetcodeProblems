package MathAndGeometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobotBoundedInCircle {
    public static boolean isRobotBounded(String instructions) {
        List<List<Integer>>values=new ArrayList<>();
        values.add(Arrays.asList(0,1));
        values.add(Arrays.asList(-1,0));
        values.add(Arrays.asList(0,-1));
        values.add(Arrays.asList(1,0));
        int direcionIndex=0;
        int[]currentPosition={0,0};
        Set hashset=new HashSet<>();
        for(int i=0;i<instructions.length();++i){
            if(instructions.charAt(i)=='G'){
                System.out.println("going up");
                currentPosition[0]=currentPosition[0]+values.get(direcionIndex).get(0);
                currentPosition[1]=currentPosition[1]+values.get(direcionIndex).get(1);
                if(hashset.contains(Integer.toString(currentPosition[0])+Integer.toString(currentPosition[1])))
                return true;
                hashset.add(Integer.toString(currentPosition[0])+Integer.toString(currentPosition[1]));
                System.out.println(hashset);
            }
            else{
                if(instructions.charAt(i)=='L'){
                    System.out.println("changing left");
                    direcionIndex=(direcionIndex-1)<0?values.size()-1:direcionIndex-1;
                }
                else{
                    System.out.println("changing right");
                    direcionIndex=(direcionIndex+1)>=values.size()?0:direcionIndex+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String instructions="GL";
        System.out.println(isRobotBounded(instructions));
    }
}
