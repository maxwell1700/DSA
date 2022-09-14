package project8;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // merge sort: divide array into two and sort individually - array left and array right
        // sort each array individually
        //new merged array  of size left + right will be needed for new merge
        // put two pointers at 0 index of left and right
        // compare which index holds the smallest number and add it to new array at its index
        // then increment the smallest index

        //while i && j < k


        //if one array ends before the other add the remaining elements of the larger array to k

    int [] arr = {10,4,1,7,3,2,6};

        //arr = merge(arr);

        //System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }



    static int [] merge(int[]arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int []left =merge(Arrays.copyOfRange(arr,0,mid));//last parameter is excluded
        int []right =merge(Arrays.copyOfRange(arr,mid ,arr.length ));

        return mergeSort(right,left);
    }

    static int[] mergeSort(int [] right, int [] left){

        int [] merged = new int[right.length + left.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < right.length && j < left.length){
            if (right[i] < left[j]){
                merged[k] = right[i];
                i++;
            }else{
                merged[k] = left[j];
                j ++;
            }
            k++;
        }

        while(i < right.length){
            merged[k] = right[i];
            i++;
            k++;
        }

        while(j < left.length){
            merged[k] = left[j];
            j++;
            k++;
        }

        return merged;
    }


    static void quickSort(int [] arr, int s, int e){
        if(s >= e){
            return;
        }

        int low = s;
        int hi = e;
        int m = s + (e - s)/2;

        int pivot = arr[m];

        while(low <= hi){

            while(arr[low] < pivot){
                low++;
            }
            while(arr[hi] > pivot){
                hi--;
            }
        if(low <= hi){
            int temp = arr[low];
            arr[low] = arr[hi];
            arr[hi] = temp;
            low++;
            hi--;
        }

        }
        quickSort(arr,low,e);
        quickSort(arr,s,hi);

    }
}
