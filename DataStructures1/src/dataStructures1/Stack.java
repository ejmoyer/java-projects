package dataStructures1;

import java.util.Arrays;

public class Stack {
	int[] stack;
	int stackSize = 10;
	int top = -1;
	int[] copyArr;
	// stack size limit will be 10
	
	public void push(int newVal) {
		if (stack == null) {
			stack = new int[1];
			stack[0] = newVal;
			top = newVal;
		} else if (stack.length == stackSize) {
			// if the stack is full, print overflow and break out of the method with return
			System.out.println("Overflow! Pop a value before adding another!");
			return;
		} else {
			// if the stack isn't full, add a new thing on top
			stack = Arrays.copyOf(stack, stack.length + 1);
			stack[stack.length - 1] = newVal;
			top = stack.length - 1;
			System.out.println("Value pushed!");
		}
	}
	
	public void pop() {
		if (stack.length == 1) {
			stack = null;
			top = -1;
		} else if (stack == null) {
			System.out.println("Underflow! Add a value before popping!");
			return;
		} else {
			copyArr = Arrays.copyOf(stack, stack.length - 1);
			/*
			for (int i = 0, x = 0; i < stack.length;i++) {
				if (stack[i] == top) {
					break;
				} else {
				copyArr[x++] = stack[i];
				}
				*/
			
			}
			stack = copyArr;
			top = stack[stack.length - 1];
		}
	
	public Boolean isEmpty() {
		// check if array is empty and return true if yes, false if no
		if (stack == null) {
			System.out.println("Stack is empty.");
			return true;
		} else {
			System.out.println("Stack is not empty.");
			return false;
		}
	}
	
	public Boolean isFull() {
		// check if stack size = array size and then return true or false
		if (stack.length == stackSize) {
			System.out.println("Stack is full.");
			return true;
		} else {
			System.out.println("Stack is not full.");
			return false;
		}
	}
	
	public int peek(int index) {
		// look at a certain array index and return the number
		System.out.println("Peeked value: ");
		System.out.println(stack[index]);
		return stack[index];
	}
	
	public int count() {
		// look at the amount of elements in an array and return how many
		return stack.length;
	}
	
	public void change(int index, int newVal) {
		stack[index] = newVal;
		System.out.println("Index changed.");
	}
	
	public void display() {
		System.out.println(Arrays.toString(stack));
	}
}
