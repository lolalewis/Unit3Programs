package Lesson8.SamplePrograms;

public class QuizReview {

    public static void main(String[] args) {
        /*
        5 Defs - Parallel Arrays, 2D Array, ragged Array, Physical vs Logical size
        
        Coding:
        Write a method that adds up (and returns the total) of all numbers in a 2d array
        
        Write a method that counts how many of a certian number are in a 1D array
        
        1 CodingBat (1 of 2) we'll do both today
         */

        int nums[][] = new int[4][5];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = i * 10 + j;
                System.out.print(nums[i][j] + "|\t");
            }
            System.out.println("");
        }
        System.out.println("The total of all numbers is");
        int sum = 0;
        //code to sum up all the numbers in array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        System.out.println("" + sum);
        System.out.println("\nProgram 2\n");
        int x[] = {7, 4, 8, 9, 6, 7, 5, 6, 9, 10, 7, 3, 7, 4, 8, 0, 1, 7};
        //         0 1 2 3 4 5 6 7 8 9 10 11121314151617
        int y[] = {7, 8, 9, 4, 5};

        int numx7 = count7(x);
        int numy7 = count7(y);
        System.out.format("There are %d 7s in x and %d 7s in y\n", numx7, numy7);

        System.out.println("\n CodingBat review\n");
        int cb1[] = fizzArray3(11, 18);
        System.out.println("[");
        for (int i = 0; i < cb1.length; i++) {
            System.out.print(cb1[i] + ",");
        }
        System.out.println("]");
        
        int cb2[] = {6,2,5,3};
        cb2 = shiftLeft(cb2);
        
        System.out.println("[");
        for (int i = 0; i < cb2.length; i++) {
            System.out.print(cb2[i] + ",");
        }
        System.out.println("]");
    }

    public static int count7(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                total++;
            }
        }
        return total;
    }

    public static int[] fizzArray3(int start, int end) {
        int result[] = new int[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            result[index] = i;
            index++;
        }
        return result;
    }

    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

}
