package tut05_res.xref1;


import utils.DomainConstraint;
import utils.NotPossibleException;

/**
 * @overview
 *  Represent a line in a text-based document.
 *  
 * @attributes
 *  lineNo  Integer int
 *  
 * @object
 * 
 * @abstract_properties
 *  mutable(lineNo) = false /\ optional(lineNo)=false /\ min(lineNo)=1
 *  
 * @author dmle
 */
public class Line {
  @DomainConstraint(type="Integer",mutable=false,optional=false)
  private int lineNo;
  
  /**
   * @effects 
   *  if lineNo is valid
   *    set this.lineNo = lineNoe
   *  else
   *    throws NotPossibleException
   */
  public Line(int lineNo) throws NotPossibleException {
    if (lineNo >= 1 ) {
      this.lineNo = lineNo;
    } 
    else {
      throw new NotPossibleException("lineNo is invalid");
    }
  }
  
  /**
   * @effects 
   *  return this.lineNo
   */
  public int getLineNo() {
    return lineNo;
  }
  
  /**
   * @effects return lineNo as String
   */
  @Override
  public String toString() {
    return String.valueOf(lineNo);
  }
  
  /**
   * @effects 
   *  if another is a Line that has the same lineNo as this.lineNo
   *    return true
   *  else
   *    return false
   */
  @Override
  public boolean equals(Object another) {
    if (another.equals(this.lineNo)) {
      return true;
    }
    return false;
  }
}
