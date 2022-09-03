package project6;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int [] arr = {3,1,5,4,2};

        Bubble(arr);

        System.out.println(Arrays.toString(arr));
        // sort methods
        //bubble sort is sinking sort and exchange sort.
        //bubble sort compares if element  is less than previous element. if it is swap them.
        // with every pass largest element is placed at the end

    }

    static void Bubble(int[]arr){
        //firt pass checks all arr elements. arr.length -1
        //second pass checks arr.length - 2
        // third pass checks arr.length -3..
        // we want to check if j is < j -1
        //if it is swap and then increment j
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 1; j <= arr.length-1-i ; j++) {
                int temp = arr[j];
                if(arr[j] < arr[j - 1]){
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }
}
