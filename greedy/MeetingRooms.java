package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeetingRooms {
     class Interval {
        public int start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));

        System.out.println(intervals);
        for (int i = 1; i < intervals.size(); i++) {
            Interval i1 = intervals.get(i - 1);
            Interval i2 = intervals.get(i);

            if (i1.end > i2.start) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        MeetingRooms gs = new MeetingRooms();

        List<MeetingRooms.Interval> intervals = new ArrayList<>();
        intervals.add(gs.new Interval(0, 30));
        intervals.add(gs.new Interval(5, 10));
        intervals.add(gs.new Interval(15, 20));

        boolean result = gs.canAttendMeetings(intervals);
        System.out.println(result);
    }
}
