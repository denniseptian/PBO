package com.modul5.soal1;

import java.util.LinkedList;

public class ArrayStackLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> items = new LinkedList<Integer>();
		
		items.push(1);
		items.push(2);
		items.push(3);
		items.push(4);
		items.push(5);
		
		System.out.println(items.size());
		System.out.println(items.peek());
		System.out.println(items.pop());
		System.out.println(items.size());
		System.out.println(items.pop());
		System.out.println(items.pop());
		System.out.println(items.pop());
		System.out.println(items.pop());
	}
}
