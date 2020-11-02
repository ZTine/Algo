package Sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        Solution solution = new SelectSort.Solution();
        int [] array = {1, 2, 4 , 34, 5};
        solution.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    static class Solution {
        public void sort(int [] array) {
            if (array == null) {
                return;
            }
            int split = array.length;
            while(split > 0) {
                int maxIndex = 0;
                for (int i = 0; i < split; i++) {
                    if(array[maxIndex] < array[i]){
                        maxIndex = i;
                    }
                }
                int tmp = array[split - 1];
                array[split - 1] = array[maxIndex];
                array[maxIndex] = tmp;
                split--;
            }
        }
    }
}