package Sort;

public class InsertSort {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] array = {1, 2, 3, 5, 5 ,2};
        solution.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static class Solution {
        public void sort(int [] array) {
            for (int i = 1; i < array.length; i++) {
                int insertIndex = i - 1;
                int current = array[i];
                while(insertIndex > 0 &&  array[insertIndex] > current) {
                    array[insertIndex + 1] = array[insertIndex];
                    insertIndex--;
                }
                array[insertIndex] = current;
            }
        }
    }
}
