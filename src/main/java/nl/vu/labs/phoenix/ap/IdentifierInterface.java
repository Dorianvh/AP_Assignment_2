package nl.vu.labs.phoenix.ap;

/** @elements
 *    name
 *  @structure
 *    linear
 *  @domain
 *    all posible values of name
 *  @constructor
 *
 *  Identifier()
 *  @precondition
 *    --
 *  @postcondition
 *    There is a new empty Identifier object.
 *
 *    Identifier(Name n)
 *  *  @precondition
 *  *    --
 *  *  @postcondition
 *  *    There is a new Identifier with element n.
 *
 **/

public interface IdentifierInterface {
	/* 
	 * [2] Mandatory methods. Make sure you do not modify these!
	 * 	   -- Complete the specifications of these methods
	 */
	
	public String value();
	
	/* 
	 * PRE: Identifier is not empty
    POST:the value of the element is returned
	 */
	
	public void add(name n);
	/*
    PRE:
    POST:n is add to the end of row of elements
     */


}
