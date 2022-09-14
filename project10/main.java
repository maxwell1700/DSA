package project10;

public class main {
    public static void main(String[] args) {
        //Linked list
        // not a fixed array
        //think node  are stored in different places in memory and are linked to each other
        //not [1,2,3,4,5,]
        //more sp [1] --> [2] --> [3] --> [4] ...(single linked list as 1 only knows 2 but 2 doesnt know 1 same for the next nodes)
        // head first node tail last node
        // cant do list.get(index) as theres no context in linked list of how large it is
        // so you make a reference to the HEAD and run an increment loop x amount of times to get the xth node
        // to add new node: create node and state TAIL.next is == to new node. new node == tail

        // try not to move head unless youre adding a new element to the linked list
        // otherwise create a temp node that point to head value to run processes
        // then if not null make temp == temp.next (remember each node only knows the next node)
        // for tail make tail.next == new node. then make tail == new node. size ++(size of list increases)

        //to delete its just making head = head.next. reduce size
        //to delete the tail point tail to second to last value by running loop, then make tail.next == null. reduce size

        //double linked list can go next and previous

        //circular there are no nodes pointed to null and the tail has next to the head
    }
}
