import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestCommanSubSequence {
    public static void main(String args []){
        Integer[] givenArray = {5, 1, 22, 25, 6, -1, 8, 10};
        Integer[] givensequence = {22, 25, 6};
        List<Integer> array= Arrays.asList(givenArray);
        List<Integer> sequence= Arrays.asList(givensequence);


        System.out.println(test(array, sequence));
    }
    static boolean test(List<Integer> array, List<Integer>sequence) {
        int j = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == sequence.get(j)) {
                j++;
            }
            System.out.println(j);
         /*   if (sequence.size() == j) {
                break;
            }*/
        }
        if (sequence.size() == j) {
            return true;
        } else {
            return false;
        }
    }

}
