package arrays;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public static boolean isPathCrossing(String path) {
        Set set=new HashSet<>();
        int r=0,c=0;
        set.add("0 0");
        for(int i=0;i<path.length();++i){
            if(path.charAt(i)=='N')
            r++;
            else if(path.charAt(i)=='E')
            c++;
            else if(path.charAt(i)=='S')
            r--;
            else
            c--;
            
            if(!set.contains(r+" "+c))
            set.add(r+" "+c);
            else{
                System.out.println(set);
                System.out.println(r+" "+c);
               return true;
            }
        }
        System.out.println(set);
        return false;
    }

    public static void main(String[] args) {
        String path="NEEEEEEEEEENNNNNNNNNNWWWWWWWWWW";
        System.out.println(isPathCrossing(path));
    }
}
