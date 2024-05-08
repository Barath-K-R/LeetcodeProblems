package arrays;

public class ReplaceElementsWithGreatestElement {
    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; --i) {
            int tempmax = max;
            if (arr[i] > max)
                max = arr[i];
            arr[i] = tempmax;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        int[] res = replaceElements(arr);
        for (int n : res)
            System.out.println(n);
    }
}
