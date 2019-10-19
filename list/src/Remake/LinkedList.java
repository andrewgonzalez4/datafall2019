package Remake;

import java.util.Iterator;

public class LinkedList<E> implements List<E>{
	
	private static class Node<E>{
		private E element;
		private Node next;
		
		public Node(E elements, Node next) {
			super();
			this.element = element;
			this.next = next;
		}
		
		public Node() {
			super();
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
	}
	
	
	private int currentSize;
	private Node<E> header;
	
	
	public LinkedList() {
		this.currentSize = 0;
		this.header = new Node<>();
	}

///////////////////////////

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return this.currentSize;
	}

	@Override
	public boolean isEmpty() {
		return this.currentSize == 0;
	}

	@Override
	public boolean isMember(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int firstIndexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int lastIndexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(E e) {
		Node<E> newNode = new Node<E>(e,null);
		Node<E> temp = new Node<E>();
		for (temp = this.header.getNext(); temp.getNext() != null; temp = temp.getNext());
		temp.setNext(newNode);
		this.currentSize++;
	}

	@Override
	public void add(E e, int index) {
		if(index  < 0 || (index  > this.currentSize)) {
			throw new IllegalArgumentException();
		}
		
		Node<E> temp = this.header.getNext();
		Node<E> newNode = new Node<E>(e,null);
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
	}

	@Override
	public E get(int index) {
		if(index  < 0 || (index  > this.currentSize)) {
			throw new IllegalArgumentException();
		}
		
		Node<E> temp = this.header.getNext();
		for (int i = 0; i == index; i++) {
			temp = temp.getNext();
		}
		return temp.getElement();
	}

	@Override
	public E remove(int index) {
		if(index  < 0 || (index  > this.currentSize)) {
			throw new IllegalArgumentException();
		}
		
		Node<E> temp = this.header.getNext();
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp.getElement();
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int removeAll(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E replace(int index, E newElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] toArray() {
		Node<E> temp = new Node<E>();
		Object[] newArray = new Object[this.currentSize];
		int i = 0;
		for (temp = this.header.getNext(); temp.getNext() != null; temp = temp.getNext()) {
			newArray[i] = temp.getElement();
			i++;
		}
		
		return newArray;
	}

	
	
}
