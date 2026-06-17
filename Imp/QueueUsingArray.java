package Imp;

public class QueueUsingArray {

	static int MAX = 5;
	static int[] queue = new int[MAX];

	static int front = -1;
	static int rear = -1;

	public static void enqueue(int value) {

		if (rear == MAX - 1) {
			System.out.println("Queue Overflow");
			return;
		}

		if (front == -1) {
			front = 0;
		}

		queue[++rear] = value;

		System.out.println(value + " added");
	}

	public static void dequeue() {

		if (front == -1 || front > rear) {
			System.out.println("Queue Underflow");
			return;
		}

		System.out.println(queue[front] + " removed");

		front++;

		if (front > rear) {
			front = rear = -1;
		}
	}

	public static void display() {

		if (front == -1) {
			System.out.println("Queue is empty");
			return;
		}

		System.out.print("Queue: ");

		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {

		enqueue(10);
		enqueue(20);
		enqueue(30);

		display();

		dequeue();

		display();
	}
}
