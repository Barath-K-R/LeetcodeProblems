package MathAndGeometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        String res = "";
        List<String> characters = new ArrayList<>(Arrays.asList("I", "V", "X", "L", "C", "D", "M"));
        List<Integer> values = new ArrayList<>(Arrays.asList(1, 5, 10, 50, 100, 500, 1000));
        while (num > 0) {

            int digits = (int) Math.pow(10, (int) Math.log10(num));

            int temp = (num / digits) * digits;
            if (num / digits == 4 || num / digits == 9) {
                res = res + characters.get(values.indexOf(digits)) + characters.get(values.indexOf(temp + digits));
            } else {
                while (temp > 0) {
                    int index = 0;
                    if (temp < 1000)
                        index = values.indexOf(digits) + 1;
                    else
                        index = values.indexOf(digits);
                    if (temp - values.get(index) >= 0) {
                        res = res + characters.get(index);
                        temp -= values.get(index);
                    } else {
                        res = res + characters.get(index - 1);
                        temp -= values.get(index - 1);
                    }

                }
            }
            num = num % digits;
        }
        return res;

    }

    public static void main(String[] args) {
        int num = 58;
        System.out.println(intToRoman(num));
    }
}