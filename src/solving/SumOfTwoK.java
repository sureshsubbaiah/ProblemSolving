package solving;

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
     * @param list
     * @param k
     */
    public void sumOfTwo(List<Integer> list, int k){
        final Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            int val = k - list.get(i);
            set.add(val);
            if (set.contains(list.get(i))) { // contains method of hashset has time complexity O(1)
                System.out.println("(" + val + "," + list.get(i) + ")");
            }
        }
    }

    public static void main(final String[] args) {
        final List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(0);
        list.add(9);
        int k = 7;

        final SumOfTwoK sumOfTwoK = new SumOfTwoK();
        sumOfTwoK.sumOfTwo(list,k);

    }
}
