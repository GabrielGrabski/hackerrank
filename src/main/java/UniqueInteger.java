import java.util.Arrays;
import java.util.List;

public class UniqueInteger {

    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 2, 1, 4, 6, 6);
        UniqueIntegerResult.lonelyinteger(list);
    }
}

class UniqueIntegerResult {

    public static int lonelyinteger(List<Integer> list) {
        var unique = 0;

        for (int referenceNumber : list) {
            var repeat = 0;
            for (int comparableNumber : list) {
                if (referenceNumber == comparableNumber) {
                    repeat++;
                }
            }
            if (repeat == 1) {
                unique = referenceNumber;
                break;
            }
        }

        System.out.println(unique);
        return unique;
    }
}