package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		Stack s  = new Stack(5);
		s.push(4);
		s.push(1);
		s.push(94);

		s.pop();

		System.out.println(s.peek());
		System.out.println(s.empty());

		s.pop();
		s.pop();

		System.out.println(s.empty());
		System.out.println(s.getSize());

		s.push(6);
		s.push(10);

		System.out.println(s.getSize());



		java.util.Stack<String> stak = new java.util.Stack<>();

		System.out.println(stak.empty());
		stak.push("hejsa");
		System.out.println(stak.empty());
		System.out.println(stak.peek());
		System.out.println(stak.search("hejsa"));
		stak.pop();
		System.out.println(stak.empty());



		Queue q = new Queue(7);
		q.offer(8);
		q.offer(5);
		q.offer(13);

		q.remove();

		System.out.println(q.peek());
		System.out.println(q.empty());

		q.remove();
		q.remove();

		System.out.println(q.empty());
		System.out.println(q.getSize());

		q.offer(9);
		q.offer(25);

		System.out.println(q.getSize());



		java.util.Queue<String> queue = new java.util.LinkedList<>();

		System.out.println(queue.poll());
		queue.offer("hejsa");
		System.out.println(queue.peek());
		System.out.println(queue.element());
		queue.remove();
		System.out.println(queue.poll());

    }
}
