import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median {

    public static void main(String[] args) {

    }
}

class MedianResult {
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        var medianIndex = arr.size() / 2;
        return arr.get(medianIndex);
    }

}