package main;

import edu.uprm.cse.datastructures.set.ArraySet;
import edu.uprm.cse.datastructures.set.Set;

public class Main {

	private static Object[] sets1 = new Object[3];
	private static Set<String> S1 = new ArraySet<>();
	private static Set<String> S2 = new ArraySet<>();
	private static Set<String> S3 = new ArraySet<>();
	private static Set<String> B = new ArraySet<>();
	private static Set<String> C = new ArraySet<>();

	public static void main(String[] args) {
		S1.add("Joe");
		S3.add("Mike");
		S2.add("Ned");
		S3.add("Amy");
		S3.add("Pol");

		B.add("Joe");
		B.add("Ned");
		B.add("Amy");
		B.add("Pol");
		B.add("Mike");
		
		C.add("Joe");
		C.add("Ned");
		C.add("Amy");
		C.add("Pol");
		//C.add("Mike");

		sets1[0] = S1;
		sets1[1] = S2;
		sets1[2] = S3;

		boolean result1 = isPartition(sets1, B);
		System.out.println("It's " + result1 + " that the array of sets is a partition of B\n");
		
		boolean result2 = isPartition(sets1, C);
		System.out.println("It's " + result2 + " that the array of sets is a partition of C");
	}
	public static boolean isPartition(Object [] theSets, Set <String> B) {
		
		
		for (int i = 0; i < theSets.length; i++) {
			if(((Set<String>) theSets[i]).isEmpty()) {
				return false;
			}
		}
		
		Set<String> total = (Set<String>)theSets[0];
		
		for (int i = 0; i < theSets.length; i++) {
			for (int j = 0; j < theSets.length; j++) {
				
				if(i == j) continue;
				if(!((Set<String>) theSets[i]).intersection((Set<String>)theSets[j]).isEmpty()) {
					return false;
				}
				
				total = total.union(((Set<String>)theSets[j]));
			}
		}
		
		return(((total.difference(B))).isEmpty() && (B.difference(total).isEmpty()));
	
		
	}

}
