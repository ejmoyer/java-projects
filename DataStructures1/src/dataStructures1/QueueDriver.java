package dataStructures1;

public class QueueDriver {

	public static void main(String[] args) {
		Queue queue1 = new Queue();
		queue1.isEmpty();
		for (int i = 0; i < 10;i++) {
			queue1.enqueue(i);
		}
		queue1.isFull();
		queue1.display();
		queue1.dequeue();
		queue1.display();
		queue1.peek(1);
		queue1.change(1, 5);
		queue1.display();
		queue1.count();
	}
}
