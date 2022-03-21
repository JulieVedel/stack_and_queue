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
    }
}
