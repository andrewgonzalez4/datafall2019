package edu.uprm.cse.datastructures.set.test;

import edu.uprm.cse.datastructures.set.ArraySet;
import edu.uprm.cse.datastructures.set.Set;

public class PartitionTest {


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
	public static boolean isPartition(Object[] Sets, Set<String> S) {
		//Checks if none of the sets in the array are empty
		for (int i = 0; i < Sets.length; i++) {
			Set<String> temp1 = (Set<String>) Sets[i];
			if(temp1.isEmpty()) {
				System.out.println("Set " + (i+1) + " is Empty");
				return false;
			}
		}
		//Checks that none of the sets in the array intersect with one another
		Set<String> union = (Set<String>) Sets[0];
		for (int i = 0; i < Sets.length; i++) {
			Set<String> temp2 = (Set<String>) Sets[i];
			for (int j = 0; j < Sets.length; j++) {
				if(i == j) {
					continue;
				}
				
				if(!temp2.intersection((Set<String>) Sets[j]).isEmpty()) {
					System.out.println("Set " + (i+1) + " intersects Set " + (j+1));
					return false;
				}
				union = union.union((Set<String>) Sets[i]);
			}
		}
		//Cheks if the union of the sets inside the array is equal to the target Set
		if(!union.isSubset(S) || !S.isSubset(union)) {
			System.out.println("The union of the sets in the array is not the same as the target set");
			return false;
		}
		return true;
	}

}
