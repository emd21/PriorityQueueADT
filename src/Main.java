// This main class will test out the Binary Heap and ensure contracts are being upheld


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, and welcome to our Priority Queue ADT");

        // creating a priority queue with capacity 3:
        BinaryHeap queue = new BinaryHeap(10);

        System.out.println("The capacity of the queue is: " + queue.getCapacity());
        System.out.println("The size of the queue is: " + queue.getSize());

        // adding to the queue:
        queue.insert("twelve",12);
        queue.insert("eleven",11);
        queue.insert("ten",10);
        queue.insert("nine",9);
        queue.insert("nine the second",9);
        queue.insert("nine the third",9);
        queue.insert("nine the fourth",9);

        // checking the size capacity of the queue:
        System.out.println("The capacity of the queue is: " + queue.getCapacity()); // capacity is still 3
        System.out.println("The size of the queue is: " + queue.getSize()); // size is 4

        // checking the first element:
        System.out.println("The element with the smallest key is: " + queue.min());
        // removing the first element:
        queue.remove();
        // now checking the second element:
        System.out.println("The element with the smallest key now is: " + queue.min());
        // and we continue ensuring FIFO works:
        queue.remove();
        System.out.println("The element with the smallest key now is: " + queue.min());
        queue.remove();
        System.out.println("The element with the smallest key now is: " + queue.min());
        queue.remove();
        System.out.println("The element with the smallest key now is: " + queue.min());
        queue.remove();
        System.out.println("The element with the smallest key now is: " + queue.min());
        queue.remove();
        System.out.println("The element with the smallest key now is: " + queue.min());
        queue.remove();
        //System.out.println("Is the queue empty? " + queue.isEmpty());
        // keep going for null pointer exception:
        System.out.println("The element with the smallest key now is: " + queue.min());
        queue.remove();


        testContracts();

    }

    public static void testContracts (){

        BinaryHeap queue = new BinaryHeap(3);

        queue.insert("twelve",12);
        queue.insert("eleven",11);
        queue.insert("ten",10);
        queue.insert("nine",9);
        queue.insert("twelve the second",12);
        queue.insert("eleven the second",11);


    }
}