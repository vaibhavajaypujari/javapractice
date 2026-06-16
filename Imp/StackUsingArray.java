package Imp;

public class StackUsingArray {

	static int MAX = 5;
	static int[] stack = new int[MAX];
	static int top = -1;

	public static void push(int value) {

		if (top == MAX - 1) {
			System.out.println("Stack Overflow");
			return;
		}

		stack[++top] = value;
		System.out.println(value + " pushed");
	}

	public static void pop() {

		if (top == -1) {
			System.out.println("Stack Underflow");
			return;
		}

		System.out.println(stack[top--] + " popped");
	}

	public static void display() {

		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.print("Stack: ");

		for (int i = top; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
	}

	public static void main(String[] args) {

		push(10);
		push(20);
		push(30);

		display();
		System.out.println();

		pop();

		display();
	}
}
