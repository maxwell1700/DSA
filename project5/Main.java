package project5;

import javax.swing.table.JTableHeader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // binary search is the search in a sorted array i.e ascending or descending order array
       int[] arr = {4,5,6,7,8,9,10 ,0,1,2};
        System.out.println(findPivot(arr));

    }


    static int findPivot(int [] nums){

        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(nums[mid] < nums[mid -1]){
                return mid -1;
            }
            if(nums[mid] <= nums[start]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = 1;
        int ans = nums[nums.length -1];

        while (end <= nums.length -1)
        {
            int mid = start + (end - start ) / 2;

            if(nums[mid] == nums[mid + 1] || nums[mid] == nums[mid - 1])

            {
                start = mid + 1;

                end = end + (end - start + 1) * 2;
            }

            else
            {
                ans = nums[mid];
                return ans;
            }
        }

        return ans;

    }

    static int specArray(int[] nums) {
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    count++;
                }
            }
            if (i == count) {
                return i;
            } else {
                count = 0;
            }
        }
        return -1;
    }

    static int search(int[] nums, int target) {


        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = ((start + end)+ 1)/2;

            if(target == nums[mid]){
                return mid;

            }  else if(target > nums[mid]){
                start = mid;
            }

            if(target < nums[mid] ){
                end = mid-1;
            }

        }


        return -1;
    }

   static int shipWithinDays(int[] weights, int days) {

        int max = 0;
        int min = 0;

        for(int w :  weights){

            min = Math.max(w,min);
            max = max + w;
        }
        int retVal = 0;
        while (min <= max){

            int mid = (min + max) / 2;



               if(numberOfDays(weights, mid) > days){

                        min = mid + 1;
                 } else {
                   retVal = mid;
                   max = mid - 1;
               }

        }


        return retVal;
    }

 static int numberOfDays(int [] weights, int capacity){
        int numDays = 1;
        int sum = 0;

    for (int w: weights) {
        sum = sum + w;

        if(sum > capacity){
            numDays++;
            sum = w;
        }
    }

        return numDays;
}

static int ceiling(int [] num, int target){ // smallest number >= target
        int tempNum = num[num.length - 1];
        int startP = 0;
        int endP = num.length -1;
        int mid = num.length / 2;

        if(num[mid] == target){
            tempNum = num[mid];
        }

        if(num[mid] < target){
            startP = mid + 1;
        }

    if(num[mid] > target){
        endP = mid;
    }

    while (startP <= endP){

        if(num[startP] >= target && num[startP] <= tempNum){
            tempNum = num[startP];
        }
        startP++;
    }

        return tempNum;
}
    static int floor(int [] num, int target) { // biggest number <= target
        int tempNum = 0;
        int startP = 0;
        int endP = num.length - 1;
        int mid = num.length / 2;

        if (num[mid] == target) {
            tempNum = num[mid];
        }

        if (num[mid] < target) {
            startP = mid + 1;
        }

        if (num[mid] > target) {
            endP = mid - 1;
        }

        while (startP <= endP) {

            if (num[startP]<= target && num[startP] >= tempNum) {
                tempNum = num[startP];
            }
            startP++;
        }

        return tempNum > 0 ? tempNum : -1;
    }


    static char letter(char[]letters, char target){

        char templetter = letters[letters.length - 1];
        int startP = 0;
        int endP = letters.length - 1;
        int mid = letters.length / 2;
        if (target >= letters[endP]) {
            return letters[startP];

        }
        if (letters[mid] == target) {
            templetter = letters[mid];
        }

        if (letters[mid] < target) {
            startP = mid + 1;
        }

        if (letters[mid] > target) {
            endP = mid;
        }

        while (startP <= endP) {

            if (letters[startP] > target && letters[startP] < templetter) {
                templetter = letters[startP];
            }
            startP++;
        }
        return templetter;
    }



    static  int [] searchRange(int [] nums, int target)
    {
        int [] arr = new int[2];

            arr[0] = search(nums, target, true);
            arr[1] = search(nums, target, false);


            return arr;
    }






    static int search(int [] nums, int target, boolean firstIndex)

    {
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while (start <= end)
        {
            int mid = start + (end - start)/ 2;

            if(nums[mid] > target){
                end = mid - 1;
            }
// only run if previous if is false
           else if(nums[mid] < target){
                start  = mid +1 ;

            }
           // only run if else if is false
            else if(firstIndex)
            {
                ans = mid;
                end = mid -1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }

        }

        return ans;
    }


}