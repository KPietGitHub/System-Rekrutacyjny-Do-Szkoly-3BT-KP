package utilities;

public class DataValidator {


    public static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static boolean isWithinRange(int value, int min, int max) {
        return value >= min && value <= max;
    }

    public static boolean isWithinRange(double value, double min, double max) {
        return value >= min && value <= max;
    }
}