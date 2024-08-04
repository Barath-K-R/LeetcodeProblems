package MathAndGeometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobotBoundedInCircle {
    public static boolean isRobotBounded(String instructions) {
        int dirx = 0, diry = 1;
        int x = 0, y = 0;

        for (int i = 0; i < instructions.length(); ++i) {
            if (instructions.charAt(i) == 'G') {
                x += dirx;
                y += diry;
            } else if (instructions.charAt(i) == 'L') {
                int temp = dirx;
                dirx = -1 * diry;
                diry = temp;
            } else {
                int temp = -1 * dirx;
                dirx = diry;
                diry = temp;
            }
        }
        System.out.println(dirx+" "+diry);
        if ((x == 0 && y == 0) || (dirx != 0 || diry != 1))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String instructions = "GL";
        System.out.println(isRobotBounded(instructions));
    }
}
