package project4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // int[] nums = {12, 345, 2, 6, 23, 78, 456, 4};
       // System.out.println(numOfEven(nums));

        int [][] accounts = {
                {1,10,10},
                {3,2,1},
                {2,6,7}
        };

        maxWealth(accounts);
    }

    static int numOfEven(int[] nums) {

        int count = 0;
        String[] v = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            String str1 = String.valueOf(nums[i]);
            v[i] = str1;
        }
        for (int i = 0; i < v.length; i++) {
            int value = v[i].length();
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static void maxWealth(int [][] accounts){
        int max = 0;
        int largest = 0;
        for (int row = 0; row < accounts.length ; row++) {

                int sum = Arrays.stream(accounts[row]).sum();
                System.out.println("Bank account " + row  + " has " + sum);
                if(sum > max){
                    max = sum;
                    largest = row;
                }

            }
        System.out.println("the largest account is " + largest);
        }

}
