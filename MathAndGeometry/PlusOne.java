package MathAndGeometry;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[] { 1 };
        }
        boolean carry = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                carry = true;
            } else {
                digits[i] += 1;
                carry = false;
                break;
            }
        }

        if (carry) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = { 9, 9, 9, 9 };
        int[] res = plusOne(digits);
        for (int n : res)
            System.out.println(n);
    }
}
