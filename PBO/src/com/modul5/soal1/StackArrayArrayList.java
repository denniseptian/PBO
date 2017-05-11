package com.modul5.soal1;

import java.util.ArrayList;

public class StackArrayArrayList {
	private int maxsize;
	private int top;
	private ArrayList items = new ArrayList();
	//private int[] items;

	public void push(int item) {
		items.add(item);
		top++;
	}

	public int pop() {
		if (isEmpty())
			throw new ArrayStackException("Underflow Error");
		return (int) items.get(--top);
	}

	public boolean isEmpty() {
		return (top == 0);
	}

	public static class ArrayStackException extends RuntimeException {
		public ArrayStackException(String message) {
			super(message);
		}
	}

	public static void main(String[] args) {
		StackArrayArrayList stack = new StackArrayArrayList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		// stack.push(4); //overflow error
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}