package learning.io.designit.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wz on 5/23/17.
 */
public class MergeSorter<T> {

    public T[] sort(T[] array , Comparator<T> comparator){
        int size = array.length;
        mergeSort(array ,comparator);
        return array;
    }

    private void mergeSort(T[] array, Comparator<T> comparator) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        // array is trivially sorted
        // divide
        int mid = n / 2;
        T[] leftHalf = Arrays.copyOfRange(array, 0, mid);
        // copy of first half
        T[] rightHalf = Arrays.copyOfRange(array, mid, n);
        // copy of second half
        // conquer (with recursion)
        mergeSort(leftHalf, comparator);
        // sort copy of first half
        mergeSort(rightHalf, comparator);
        // sort copy of second half
        // merge results
        merge(leftHalf, rightHalf, array, comparator);

        System.out.println(Arrays.deepToString(array));
    }

    private void merge(T[] leftArray, T[] rightArray , T[] list,Comparator<T> comparator){
        int i = 0, j = 0;
        while (i + j < list.length) {
            if (j == rightArray.length || (i < leftArray.length && comparator.compare(leftArray[i], rightArray[j]) < 0)) {
                list[i + j] = leftArray[i++];
            } else {
                list[i + j] = rightArray[j++];
            }
        }
    }
}
