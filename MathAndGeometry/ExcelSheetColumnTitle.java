package MathAndGeometry;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int quotient = columnNumber, remainder = 0, newquotient = 0;
        while (quotient > 26) {
            remainder = quotient % 26;
            newquotient = quotient / 26;
            if (remainder == 0 && quotient > 26) {
                for (int j = 0; j < newquotient; ++j) {
                    sb.insert(0, "Z");
                }
            }
            if (remainder != 0) {
                char c = (char) (remainder + 'A' - 1);
                sb.insert(0, Character.toString(c));
            }
            quotient = newquotient;
        }
        if (quotient != 0)
            sb.insert(0, (char) (quotient + 'A' - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        int columnNumber = 52;
        System.out.println(convertToTitle(columnNumber));
    }

}
