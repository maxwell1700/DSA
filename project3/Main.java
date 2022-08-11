package project3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class Main {

    public static void main(String[] args) {

       int [] candies = {12,1,12};

        System.out.println(Arrays.toString(candyArr(candies, 10)));
        /*int[][] arr = {
                {1, 5},
                {7, 3},
                {3, 5}
        };*/
        //wealthArr(arr);

       // int  [] ex = {1,1,2,2};
       // System.out.println(Arrays.toString(shuffleArr(ex)));

        //int []arr = {1, 2, 1};
        //System.out.println(Arrays.toString(concArray(arr)));
        //arrayMethod(arr);
        // int [] arr = new int [7]; // 7 is the size . default to 7 zero
        //or
        //int []  bee = {1, 2,3,4,5} ;
        // primitive data types e.g. int, char, byte are stored in stack memory
        // 2d arrays
        //  int [][] x = new int[3][]; // first array size specifies the amount of rows. This is an array of arrays
        /*int [][] x = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
      /*  { [
            [1,2,3],// 0
            [4,5,6], // 1    x[1][0] = 4
            [7,8,9] // 2
            ]
        }*/

        /*  { [
            [1,2,3],// 0
            [4,5], // 1    x[2][3] = 10
            [7,8,9, 10] // 2
            ]
        }*/

        //ArrayList<Integer> list = new ArrayList<>();

    }

    public static int[] arrayMethod(int[] num) {
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i] = num[num[i]];
        }
        return ans;
    }

    public static int[] concArray(int[] nums) {
        int[] sol = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            sol[i] = nums[i];
            sol[i + nums.length] = nums[i];
        }

        return sol;
    }

    public static int[] sumArray(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }

        return runningSum;

    }

    public static void wealthArr(int[][] arr) {
        int wealth = 0;
        for (int i = 0; i < arr.length; i++){
            int sum = Arrays.stream(arr[i]).sum();
            if (sum > wealth ){
                wealth = sum;
            }
        }
        System.out.println(wealth);
    }

    public static int[] shuffleArr(int [] nums){
        int n = nums.length / 2;
        int count = 0;
        int [] newArr = new int[nums.length];

        for (int i = 0; i < nums.length; i ++){

           if(i % 2 != 0){
               newArr[i] = nums[n];
               n++;
           }else{
               newArr[i] = nums[count];
               count++;
           }
        }
        return newArr;
    }


    public static boolean[] candyArr(int [] candies, int extra){
        boolean [] result = new boolean[candies.length];
        int num = 0;
        int max;

        for (int i = 0; i < candies.length; i++ ){
           max = Math.max(num, candies[i]);
           num = max;
        }
        for (int x = 0; x < result.length;x++){
            result[x] = candies[x] + extra == Math.max(candies[x] + extra ,num) ;
        }

      return result;

    }


}

