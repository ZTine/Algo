package Offer;

import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] numbers = {2, 3, 1, 0, 2 , 5, 3};
        int [] duplication = new int[1];
        boolean flag = solution.duplicate(numbers, numbers.length, duplication);
        System.out.println(flag);
        Arrays.asList(duplication).forEach(System.out::println);
        System.out.println(duplication[0]);

    }
    static class Solution {
                // Parameters:
        //    numbers:     an array of integers
        //    length:      the length of array numbers
        //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
        //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
        //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
        // Return value:       true if the input is valid, and there are some duplications in the array number
        //                     otherwise false
        public boolean duplicate(int numbers[],int length,int [] duplication) {
            if (numbers == null) {
                return false;
            }
            for(int i = 0; i < numbers.length; i++) {
                while(numbers[i] != i){
                    if(numbers[i] == numbers[numbers[i]]) {
                        duplication[0] = numbers[i];
                        return true;
                    }
                    int tmp = numbers[i];
                    numbers[i] = numbers[tmp];
                    numbers[tmp] = tmp;
                }
            }
            return false;
        }
    }

}