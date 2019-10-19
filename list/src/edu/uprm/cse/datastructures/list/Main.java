package edu.uprm.cse.datastructures.list;

public class Main {

	public static void main(String[] args) {
		
		SinglyLinkedList<String> listy = new SinglyLinkedList<String>();
		listy.add("Joe");
		listy.add("Ned");
		listy.add("Ron");
		listy.add("Ned");
		listy.add("Joe");
		listy.add("Amy");
		removeDuplicates(listy);
		for (int i = 0; i < listy.size(); i++) {
			System.out.println(listy.get(i));
		}
	
	}
	
	public static void removeDuplicates(SinglyLinkedList<String> L) {
		SinglyLinkedList<String> result = new SinglyLinkedList<String>();
		for (int i = 0; i < L.size(); i++) {
			if(L.firstIndexOf(L.get(i)) != L.lastIndexOf(L.get(i))){
				int temp = L.lastIndexOf(L.get(i));
				L.remove(temp);
			}
		}
	}
	
	
	public static boolean isSorted(SinglyLinkedList<String> L) {
		for (int i = 0; i < L.size() -1; i++) {
			if(!(L.get(i).compareTo(L.get(i + 1)) < 0)) {
				return false;
			}
		}
		
		return true;
	}

	public int Replacer(List<String> L, String x, String y) {
		L = new ArrayList <String> (L.size());
		int count = 0;
		for (int i = 0; i < L.size(); i++) {
			if(L.get(i).equals(x)) {
				L.replace(i, y);
				count ++;
			}
		}
		
		return count;
		
	}

}
