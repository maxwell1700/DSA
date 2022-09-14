package project9;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //all subsets are governed by taking some elements and ignoring others
//subSeq("","abc");
       int[]arr = {1,2,3};
       subseq2(arr);


    }

    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        subSeq(p + c, up.substring(1));
        subSeq(p,up.substring(1));
    }


    static List<List<Integer>> subseq2(int[] arr){
        //non recusrion way
        // you need to create a arraylist that contains integer arraylist with the various valid combination of numbers
        // question [1,2,3]
        //make your outer arraylist {} that will hold all integer list answer
        //first answer is an empty integer list "{{},}"
        //then to get your second answer:
        // 1) take the size of the outer list. there 1 as it as one empty list in it
        //2) create x = size new inner list. so now there are two list inside the outer list
        // {{},{}}
        //3) use a loop to look through [1,2,3] and add the numbers in them to the newly create inner list
        //{{},{1}}
        //4) then repeat steps 2 for next loop e.g number 2
        //{{},{1},{2},{1,2}}
        //{{},{1},{2},{1,2},{3},{1,3},{2,3},{1,2,3}}
        List<List<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int n : arr) {
            int size = outer.size();
            for (int i = 0; i < size ; i++) {
                 List<Integer>internal = new ArrayList<>(outer.get(i));// takes a copy of the ith list. // setting the capacity is different from the size
                System.out.println(internal);
                internal.add(n);
                System.out.println(internal);
                outer.add(internal);
                System.out.println(outer);
            }
        }


        return outer;
}}