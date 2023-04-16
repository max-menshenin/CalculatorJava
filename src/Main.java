public class Main {

    static String ArabicToRoman(int aNumber) {
        if (aNumber < 1 || aNumber > 3999) {
            return "-1";
        }

        int[] aArray = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rArray = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String rNumber = "";

        for (int i = 0; i < aArray.length; i++) {
            while (aNumber >= aArray[i]) {
                rNumber += rArray[i];
                aNumber -= aArray[i];
            }
        }

        return rNumber;
    }

    public static String calc(String input) {
        return "";
    }

    public static void main(String[] args) {
    }
}