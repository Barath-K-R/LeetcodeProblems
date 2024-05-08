package intervals;

import java.util.ArrayList;

public class InserInterval {
    public static int[][] solution(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> resList = new ArrayList<>();
        int[][] res = new int[intervals.length][2];
        int newindex = 0, resindex = 0;

        for (int i = 0; i < intervals.length; ++i) {

            if (intervals.length == 0) {
                resList.add(newInterval);
                newindex += 2;
                break;
            }
            if (i == intervals.length)
                break;
            if (newindex < 2)
                System.out.println("-------" + newInterval[newindex]);
            if (newindex == 0 && newInterval[newindex] < intervals[i][newindex]) {
                System.out.println("start is lesser so adding 1");
                resList.add(resindex, new int[2]);
                resList.get(resindex)[newindex] = newInterval[newindex];
                newindex++;
            }
            if (newindex < 2 && intervals[i][0] > newInterval[1]) {
                System.out.println("end is lesser");
                if (newindex == 0) {
                    System.out.println("newindex==0 so adding both");
                    resList.add(resindex, newInterval);
                    newindex += 2;
                    resindex++;
                } else {
                    System.out.println("newindex==1 so adding only 2");
                    resList.get(resindex)[newindex++] = newInterval[1];
                    System.out.println(resList.get(resindex)[1]);
                    resindex++;
                }
            }
            if (newindex < 2 && (newInterval[0] >= intervals[i][0] && newInterval[0] <= intervals[i][1])
                    && (newInterval[1] >= intervals[i][0] && newInterval[1] <= intervals[i][1])) {
                System.out.println("two new interval fitted inside the curr interval");
                resList.add(resindex, intervals[i]);
                newindex += 2;
                resindex++;
            } else if (newindex < 2 && newInterval[newindex] >= intervals[i][0]
                    && newInterval[newindex] <= intervals[i][1]) {
                System.out.println("matched with intervals");
                if (newindex == 0) {
                    System.out.println("newindex == 0 -- " + resindex);
                    resList.add(new int[2]);
                    resList.get(resindex)[newindex++] = intervals[i][0];
                    System.out.println(resList.get(resindex)[0]);
                } else {
                    System.out.println("newindex == 1 --- " + resindex);
                    resList.get(resindex)[newindex++] = intervals[i][1];
                    System.out.println(resList.get(resindex)[1]);
                    resindex++;
                }

            } else {
                System.out.println("nothing matched");
                if (newindex == 1)
                    continue;
                else {
                    System.out.println("resindex=" + resindex);
                    resList.add(resindex, intervals[i]);
                    System.out.println(resList.get(resindex)[0] + " " + resList.get(resindex)[1]);
                    resindex++;
                }

            }
        }
        if (newindex == 1)
            resList.get(resindex++)[newindex++] = newInterval[1];
        else if (newindex == 0)
            resList.add(resindex++, newInterval);

        System.out.println("reslist=" + resList);
        res = resList.toArray(new int[resList.size()][]);
        return res;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 5 } };
        int[] newinterval = { 0, 3 };
        int[][] res = solution(intervals, newinterval);
        for (int[] row : res) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}
