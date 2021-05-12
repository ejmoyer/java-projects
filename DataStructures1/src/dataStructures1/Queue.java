package dataStructures1;

import java.util.Arrays;

public class Queue {
	int[] queue;
	int queueSize = 10;
	int front = -1;
	int rear = -1;
	
	public void enqueue(int newVal) {
		if (queue == null) {
			queue = new int[1];
			queue[0] = newVal;
			front = queue[0];
			rear = queue[0];
		} else if (queue.length == queueSize) {
			System.out.println("Queue Overflow!");
			return;
		} else {
			// if the stack isn't full, add a new thing on top
			queue = Arrays.copyOf(queue, queue.length + 1);
			queue[queue.length - 1] = newVal;
			rear = queue.length - 1;
			System.out.println("Value enqueued!");
		}
	}
	
	public void dequeue() {
		if (queue.length == 1) {
			queue = null;
			front = -1;
			rear = -1;
		} else if (queue == null) {
			System.out.println("Underflow! Add a value before dequeueing!");
			return;
		} else {
			int[] copyArr;
			copyArr = Arrays.copyOf(queue, queue.length - 1);
			for (int i = 0, x = 0; i < queue.length;i++) {
				if (i == 0) {
					continue;
				} else {
				copyArr[x++] = queue[i];
				}
			}
			queue = copyArr;
			front = queue[0];
		}
	}
	
	public Boolean isEmpty() {
		// check if array is empty and return true if yes, false if no
		if (queue == null) {
			System.out.println("Queue is empty.");
			return true;
		} else {
			System.out.println("Queue is not empty.");
			return false;
		}
	}
	
	public Boolean isFull() {
		// check if stack size = array size and then return true or false
		if (queue.length == queueSize) {
			System.out.println("Queue is full.");
			return true;
		} else {
			System.out.println("Queue is not full.");
			return false;
		}
	}
	
	public int peek(int index) {
		// look at a certain array index and return the number
		System.out.println("Peeked value: ");
		System.out.println(queue[index]);
		return queue[index];
	}
	
	public int count() {
		// look at the amount of elements in an array and return how many
		return queue.length;
	}
	
	public void change(int index, int newVal) {
		queue[index] = newVal;
		System.out.println("Index changed.");
	}
	
	public void display() {
		System.out.println(Arrays.toString(queue));
	}
}

