import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * Given five positive integers, find the minimum and maximum values that can
 * be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of
 * two space-separated long integers.
 *
 */

public class MinMaxSum {

    public static void main(String[] args) {
        var nums = new ArrayList<Integer>();
        nums.add(793810624);
        nums.add(895642170);
        nums.add(685903712);
        nums.add(623789054);
        nums.add(468592370);
        Calculator.minMaxSum(nums);
    }
}

class Calculator {
    public static void minMaxSum(List<Integer> nums) {
        var max = 0L;
        var min = 0L;

        Collections.sort(nums);

        // min
        for (int i = 0; i < nums.size() - 1; i++) {
            min += nums.get(i);
        }

        // max
        for (int i = 1; i < nums.size(); i++) {
            max += nums.get(i);
        }

        System.out.println(min + " " + max);
    }
}