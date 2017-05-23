package learning.io.designit.structural;

import learning.io.designit.helpers.MergeSorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by wz on 5/23/17.
 */
@Component
public class Adapter {
    class SortAdapter<T> {
        public List<T> sort(List<T> list , Comparator<T> comparator){
            MergeSorter<T> sorter = new MergeSorter<>();
            T[] array = (T[]) new Object[list.size()];
            list.toArray(array);
            sorter.sort(array, comparator);
            return Arrays.asList(array);
        }
    }
}
