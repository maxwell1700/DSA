package project7;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //recursion

      //  int n = 40;
      //  boolean [] arr = new boolean[n + 1];

     //  sieve(n,arr);

        //System.out.println(hcf(4,9));

       // System.out.println(factorialRecursion(7));

        //System.out.println(sumNumRecursion(134));

      // revNumRecursion(12345);
      //  System.out.println(sum);
       // int [] arr = {1,2,8,7,12};
        //System.out.println(arrRecursion(arr, 0));

     //   int [] arr = {1,2,3,4,4,5,6,7};
       // List<Integer>list = new ArrayList<>();
       // System.out.println(listRecursion(arr,4, 0,list));

        int [] arr = {4,3,2,1,};
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;

        while (c * c <= n){
            if(n % c == 0){
                return  false;
            }
            c++;
        }

        return true;
    }


    static void sieve(int n, boolean[]arr){
        for (int i = 2; i*i <=n ; i++) {
            if(!arr[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }

    }

    static int hcf(int a , int b){
        if(a == 0){
            return b;
        }
        return hcf(b%a,a);
    }


    static int factorialRecursion(int n){
        if(n == 0){
            return 1;
        }
       return n * factorialRecursion(n-1);
    }


    static int sumNumRecursion(int n ){
        if (n == 0){
            return 0;
        }
        return n % 10 + sumNumRecursion(n /= 10);

    }
    static int sum = 0;
    static void revNumRecursion(int n ){
        if (n == 0){
            return;
        }
      int remNum = n / 10;
        sum = sum * 10 +  n%10 ;
        revNumRecursion(remNum);
    }

    static boolean arrRecursion(int [] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index + 1] && arrRecursion(arr, index + 1);
    }

    static List<Integer> listRecursion(int[] arr, int target, int index, List<Integer> list){

        if(index == arr.length - 1){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return listRecursion(arr, target, index + 1, list);
    }

    static void selectionSortRecurision(int[]arr, int r , int c, int Max){

    }


}
