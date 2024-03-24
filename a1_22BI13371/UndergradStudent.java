package a1_22BI13371;

import utils.NotPossibleException;
import utils.AttrRef;

/*
 * @overview UndergradStudent is a Student that is studying a bachelor program
 * @abstract_properties
 * 	P_Student
 */

public class UndergradStudent extends Student {
    private final double maxint = Math.pow(10, 9);
    private final double minint = Math.pow(10, 5) - 1;

    // constructor methods
    /*
     * @effects
     *  if i, n, p, a are valid
     *      initialise this as UndergradStudent<i,n,p,a>
     *  else
     *      throw NotPossibleException
     */
    public UndergradStudent(
        @AttrRef("id") Integer i,
        @AttrRef("name") String n,
        @AttrRef("phoneNumber") String p,
        @AttrRef("address") String a) throws NotPossibleException {
        super(i, n, p, a);
    }

    @Override
    public String toString() {
        return "UndergradStudent(" + getName() + "id: " + getID() + ")";
    }

    @Override
    /**
   * @effects
    *   if i is valid 
    *       return true 
    *   else 
    *       return false
   */
  protected boolean validateID(Integer i) {
    if (minint < i && i < maxint)
      return true;
    else
      return false;
  }
}
