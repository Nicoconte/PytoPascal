package utils;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Utils {

    /**
     * @Task Simplify stdout statement
     * */
    public static void print(Object value) { System.out.println(value); }

    /**
     * @Task Verify if the value is unique in array
     * @param arr Object[]
     * @return true if it is unique, otherwise, false
     * */
    public static boolean isUnique(Object[] arr, Object value) {
        return Collections.frequency(Arrays.asList(arr), value) == 1;
    }

    public static String getVariableValues(Object [] arr, int initial) {
        String output = "";
        for(int i = initial + 1; i < arr.length; i++) {
            output += arr[i].toString();
        }
        return output;
    }

    public static boolean isInteger(Object value) {
        try {
            Integer n;
            n = Integer.parseInt((String) value);
            return n instanceof Integer;

        } catch (Exception e){
            return false;
        }
    }

    public static boolean isFloat(Object value) {
        try {
            Float f;
            f = Float.parseFloat((String) value);
            return f instanceof Float;

        } catch(Exception e) {
            return false;
        }
    }

    public static boolean isBoolean(Object value) {
        return value.equals("True") || value.equals("False");
    }

    public static boolean isChar(Object value) {
        return value.toString().contains("'") && value.toString().length() == 3;
    }

    /**
     * @Task Get real data type from String.
     * @param value Object
     * @return String
     * */
    public static String getRealType(Object value) {
        if (isInteger(value)) {
            return "integer";
        } else if (isFloat(value)) {
            return "real";
        } else if (isBoolean(value)) {
            return "boolean";
        } else if (isChar(value)) {
            return  "char";
        } else {
            return "string";
        }
    }

    /**
     * @Task Convert buffer reader to string
     * @param reader BufferedReader
     * @return string
     * */
    public static String BufferedReaderToString(BufferedReader reader) {
        return reader.lines().collect(Collectors.joining());
    }

}
