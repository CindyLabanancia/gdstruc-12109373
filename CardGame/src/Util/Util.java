package Util;

public class Util {

    public static boolean isInt(String text) {
        try{
            Integer.parseInt(text);
        }catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static int convertToInt(String text) {
        return Integer.parseInt(text);
    }
}
