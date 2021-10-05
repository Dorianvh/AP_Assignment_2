package nl.vu.labs.phoenix.ap;

public interface SetInterface<T extends Comparable<T>> {

	/*
	 * Elements : Objects of type T
	 * Structure: none
	 * Domain   : all sets with minimum 0 and no maximum elements
	 *
	 * Constructors:
	 *
	 * Set();
	 * PRE  -
	 * POST - A new Set-object has been made and is the empty Set.
	 *
	 * Set (Set src);
	 * PRE  -
	 * POST - A new Set-object has been made and contains a copy of the elements src.
	 *
	 */
	
	/**
	 * Hint:
	 * @return
	 * 	true  - element was inserted
	 * 	false - element was already present 
	 */

	boolean add(T element);
		/* PRE -
		   POST -   true  - element was inserted
	  	  			false - element was already present
		 */

	T get();
		/*  PRE  - Set is not empty
	   		POST - Returns a copy of a random element
		 */

	boolean remove(T t);
		/*  PRE  -
  			POST - Element is not in the set
    	 */

	int size();
		/*PRE -
		  POST - the size of the zet is returned
		 */

	SetInterface<T> copy();
			/* PRE  -
			   POST - A new Set-object has been made and contains a copy of the elements src.
			 */
	/*
	 * [3] Methods for set operations 
	 * 	   -- Add methods to perform the 4 basic set operations 
	 * 		  (union, intersection, difference, symmetric difference)
	 */

	SetInterface<T> intersection(SetInterface<T> set2);
		/*  PRE  -
			POST - returns a new set with copies ofThe intersection of set and set2 is returned
		 */


	SetInterface<T> union(SetInterface<T> set2);
		/*  PRE  -
			POST - Success: Returns a new set containing copies of all the elements in both sets
			 	   Failure: the union of set and set2 consists of more elements than MAX_ELEMENTS
		 */

	SetInterface<T> difference(SetInterface<T> set2);
		/*  PRE  -
			POST - Returns a new set containing copies of the elements in set that are not in set2
		 */

	SetInterface<T> symmetricDifference(SetInterface<T> set2);
		/*  PRE  -
			POST - Success: Returns a new set containing copies of the elements in set1 and set2 that are not in their intersection
			 	 - failure: the symmetricdifference of set and set2 consists of more elements than MAX_ELEMENTS
		 */
	
	/* 
	 * [4] Add anything else you think belongs to this interface 
	 */

	boolean checkForPresence(T element);
		/* PRE  -
		   POST - Returns true if element is contained in set
  		    	- Returns false if element is not contained in set
		 */
	
}
