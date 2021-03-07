package utils;

import java.util.Arrays;
import java.util.Collections;

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

    public static String nameOf(Object o) {
        return o.getClass().getSimpleName();
    }

    public static String getVariableValues(Object [] arr, int initial) {
        String output = "";
        for(int i = initial + 1; i < arr.length; i++) {
            output += arr[i].toString();
        }
        return output;
    }

}
