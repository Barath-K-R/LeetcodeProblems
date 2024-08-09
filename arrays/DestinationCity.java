package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        HashMap<String,String>map=new HashMap<>();
        String temp="";
        for(int i=0;i<paths.size();++i){
            map.put(paths.get(i).get(0),paths.get(i).get(1));
            if(i==paths.size()-1)
            temp=paths.get(i).get(1);
        }
        while(map.containsKey(temp)){
            temp=map.get(temp);
        }
        return temp;
    }
    public static void main(String[] args) {
        List<List<String>>paths=new ArrayList<>();
        paths.add(new ArrayList<>());
        paths.get(0).add("b");
        paths.get(0).add("c");
        paths.add(new ArrayList<>());
        paths.get(1).add("a");
        paths.get(1).add("b");
        paths.add(new ArrayList<>());
        paths.get(2).add("d");
        paths.get(2).add("f");
        paths.add(new ArrayList<>());
        paths.get(3).add("c");
        paths.get(3).add("d");
        System.out.println(destCity(paths));

    }
}
