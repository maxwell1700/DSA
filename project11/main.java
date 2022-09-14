package project11;

import java.util.*;

public class main {
    public static void main(String[] args) {
        //stack and queue
        //stack: first in last out
        //stack has a fixed size
        //queue: first in first out like real life queue.
        //insert from the back and remove from the front
        //queue is an interface so it doesnt tell you how to do things just what to do

        //internally stack and queue look like array

        Stack<Integer> stack = new Stack<>();

       // Queue<String> queue = new LinkedList<>();

        //deque allows for insertion and deletion from both sides of the queue

        Deque<Integer> deque = new ArrayDeque<>(); // array deque is faster than queue. array deque doesnt have a fixed capacity

        deque.addLast(23);
        deque.addFirst(19);

        System.out.println(deque.removeFirst());

        //dynamic stack just means it can never be full. its size keeps increasing
    }
}
