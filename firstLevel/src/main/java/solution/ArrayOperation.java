package solution;

import java.util.ArrayList;
import java.util.List;

public class ArrayOperation {
    public static int countUniqueNumbers(int[] arr) {
        List<Integer> uniqueNums = new ArrayList<Integer>();

        for (int i: arr) {
            if (!uniqueNums.contains(i)) {
                uniqueNums.add(i);
            }
        }
        return uniqueNums.size();
    }
}
