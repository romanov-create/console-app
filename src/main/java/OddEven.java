import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class OddEven {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println("Even Numbers are : " + oddOrTwin(list).get(true));
        System.out.println("ODD Numbers are : " + oddOrTwin(list).get(false));
    }

    public static Map<Boolean, List<Integer>> oddOrTwin(List<Integer> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("please, fill in the collections of numbers");
        }

        return list.stream()
                .collect(groupingBy(n -> n % 2 == 0));
    }

}
