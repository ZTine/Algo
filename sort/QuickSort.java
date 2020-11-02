package Sort;

public class QuickSort {
    public static void main(String[] args) {
        
    }
    public static class Solution {
        public void sort(int [] array){

        }
        public void quickSort(int [] array, int left, int right) {
            if(left < right ) {

            }
            return;
        }
        public int partition(int [] array, int left, int right) {
            int pivot = left;
            int index = pivot + 1;
            while (index <= right && array[index] < array[pivot]) {
                if (array[index] > array[pivot]) {
                    while(index < right && array[right] > array[pivot]){
                        right--;
                    }
                    swap(array, index, right);
                }
            }
        }
        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
