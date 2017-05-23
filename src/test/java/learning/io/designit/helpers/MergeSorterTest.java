package learning.io.designit.helpers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wz on 5/23/17.
 */
public class MergeSorterTest {
    @Test
    public void sort() throws Exception {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(14);
        numbers.add(3);
        numbers.add(25);
        numbers.add(56);
        numbers.add(22);
        numbers.add(1);
        System.out.println(Arrays.deepToString(numbers.toArray()));
        MergeSorter<Integer> mergeSorter = new MergeSorter<>();

        Integer[] arr = new Integer[numbers.size()];
        Integer[] sorted = mergeSorter.sort(numbers.toArray(arr), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) return 1;
                else if(o1 < o2) return -1;
                else return 0;
            }
        });

        System.out.println(Arrays.deepToString(sorted));
    }

}