package project6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        int[] arr = {1,1};
        String ans = cycle(arr).toString();
        System.out.println(ans);

        // sort methods
        //bubble sort is sinking sort and exchange sort.
        //bubble sort compares if element  is less than previous element. if it is swap them.
        // with every pass largest element is placed at the end

    }

    static void Bubble(int[] arr) {
        //firt pass checks all arr elements. arr.length -1
        //second pass checks arr.length - 2
        // third pass checks arr.length -3..
        // we want to check if j is < j -1
        //if it is swap and then increment j
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j <= arr.length - 1 - i; j++) {
                int temp = arr[j];
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }


    static void selection(int[] arr) {
        //in first case: find the lagest num in arr.length - 1 - > then swap with the last index element
        // in seconf find the largest num in arr. length -1 -1 -> then swap with the last index element
        //in 3rd find the largest num in arr.length -1 -2  - > swap with the last index element
        for (int i = 0; i <= arr.length - 1; i++) {
            int end = arr.length - 1 - i;
            int largestNum = findLargestNum(arr, 0, end);
            swap(arr, largestNum, end);
        }

    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findLargestNum(int[] arr, int start, int end) {
        int largest = start;
        for (int i = start; i <= end; i++) {
            if (arr[largest] < arr[i]) {
                largest = i;
            }

        }
        return largest;
    }

    static void insertion(int [] arr){
        //outer loop run from i = 0 to i < length - 1
        //inner loop frun from j = 1 whilst j is greater than 0
        // if j is less than j -1 swap else break
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j =  i + 1 ; j > 0 ; j--) {
                if(arr[j] < arr[j -1]){
                    swap(arr, j , j - 1);
                }else break;
            }
        }
    }


    static List<Integer> cycle(int[]arr){

        int i = 0;
        while(i < arr.length) {
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]){
                    swap(arr,i, correctIndex );
                }else{
                    i++;
                }
            }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j] != j + 1){
                ans.add(j + 1);
            }
        }

        return ans;

    }

    static int cycleQ1(int[] arr){
            int i = 0;
            int n = arr.length;

            while (i < n){
                int temp = 0;

                if(arr[i] < n && arr[i] != i){
                    temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                }else{
                    i++;
                }
            }

        for (int j = 0; j < arr.length ; j++) {
            if(j != arr[j]) {

                return j;
            }
        }

        return n;

    }
}
