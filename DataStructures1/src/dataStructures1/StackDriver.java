package dataStructures1;

public class StackDriver {

	public static void main(String[] args) {
		Stack stack1 = new Stack();
		stack1.isEmpty();
		for (int x = 0;x < 10;x++) {
			stack1.push(x);
		}
		stack1.display();
		stack1.isFull();
		stack1.change(0, 11);
		stack1.display();
		stack1.count();
		stack1.peek(8);
		stack1.pop();
		stack1.display();
	}
}
