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
	 * [3] Add anything else you think belongs to this interface 
	 */
	
	public void add();


}
