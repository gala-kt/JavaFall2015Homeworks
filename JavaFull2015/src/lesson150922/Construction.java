package lesson150922;

import java.util.ArrayDeque;
import java.util.Deque;

public class Construction {

	static class MyStack extends ArrayDeque {

		@Override
		public void push(Object o) {
			addLast(o);
		}

		@Override
		public Object pop() {
			return removeLast();

		}
	}

	public static void main(String[] args) {
//		Deque deque = new MyStack();
		Deque deque = new ArrayDeque();

		process(deque);
	}

	private static void process(Deque deque) {
		deque.push("one");
		deque.push("two");
		deque.push("three");

		System.out.println(deque.removeFirst());

	}
}
