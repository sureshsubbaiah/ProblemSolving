package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Sum of two items in a list the result should be equal to k value.
 */
public class SumOfTwoK {

    /**
     * O(n) solution for sum of two
     *
     * @param list
     * @param k
     */
    public void sumOfTwo(final List<Integer> list, final int k) {
        final Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            int val = k - list.get(i);
            set.add(val);
            if (set.contains(list.get(i)) && val!=list.get(i)) { // contains method of hashset has time complexity O(1)
                System.out.println("(" + val + "," + list.get(i) + ")");
            }
        }
    }

    /**
     * O(n2)
     *
     * @param list
     * @param k
     */
    public void sumOfTwo_On2(final List<Integer> list, final int k) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                if (sum == k)
                    System.out.println("(" + list.get(i) + "," + list.get(j) + ")");
            }
        }
    }

    public static void main(final String[] args) {
        final List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(0);
        int k = 4;

        final SumOfTwoK sumOfTwoK = new SumOfTwoK();
        sumOfTwoK.sumOfTwo(list,k);
//        sumOfTwoK.sumOfTwo_On2(list, k);

        list.sort((o1, o2) -> o1-o2);


    }
}