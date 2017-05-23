package learning.io.designit.structural;

import learning.io.designit.AbstractTestClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by wz on 5/23/17.
 */
public class SortAdapterTest extends AbstractTestClass{

    @Autowired
    private Adapter adapter;

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

        Adapter.SortAdapter sortAdapter = adapter.new SortAdapter();
        numbers = sortAdapter.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) return 1;
                else if(o1 < o2) return -1;
                else return 0;
            }
        });

        System.out.println(numbers);
    }

}