package a1_22BI13371;

import utils.NotPossibleException;
import utils.AttrRef;

/**
 * @overview UndergradStudent is a Student that is studying a bachelor program
 * 
 * @abstract_properties
 * 	P_Student
 * 
 */

 /**
 * @overview UndergradStudent is a student that will attend a university at the undergraduate level
 * @attributes
 * 	id			    	Integer   int
 * 	name			    String
 * 	phoneNumber		String
 * 	address			  String
 * @object 
 * 	a typical UndergradStudent is s=<i, n, p, a>,
 *  	where id(i), name(n), phoneNumber(p), address(a)
 * @abstract_properties
 *  P_Student /\
 * 	mutable(id)=false /\ optional(id)=false /\ min(id)=10^5 /\ max(id)=10^8
 * 	
 */

public class UndergradStudent extends Student {
  private final int maxid = 100000000;
  private final int minid = 100000;

  // constructor methods
  /**
   * @modifies this.id, this.name, this.phoneNumber, this.address
   * 
   * @effects
   *  if i, n, p, a are valid
   *      initialise this as UndergradStudent<i,n,p,a>
   *  else
   *      throw NotPossibleException
   */
  public UndergradStudent(
      @AttrRef("id") int i,
      @AttrRef("name") String n,
      @AttrRef("phoneNumber") String p,
      @AttrRef("address") String a) throws NotPossibleException {
      super(i, n, p, a);
      
  }

  @Override
  public String toString() {
      return "UndergradStudent(" + getName() + ", id: " + getID() + ")";
  }
  
  // helper
  /**
   * 
   * @effects
   *  if i is valid
   *      return true
   *  else
   *      return false
   */
  protected boolean validateID(int i) {
    if (minid < i && i < maxid)
      return true;
    else
      return false;
  }
}
