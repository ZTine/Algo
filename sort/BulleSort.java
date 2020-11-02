package Sort;

public class BulleSort {
    public static void main(String[] args) {
        Solution solution = new BulleSort.Solution();
        int [] array = { 3, 2, 5, 6, 9, 2};
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
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length - i; j++) {
                    if(array[j] > array[j + 1]) {
                        int tmp  = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }
        }
    }
    
}
