package a1_22BI13371;

import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.AttrRef;


/*
 * @overview Student will attend a university
 * @attributes
 *  A_Student
 *  gpa     Float   double
 * @object 
 * 	a typical PostgradStudent is s=<i, n, p, a, g>,
 *  	where id(i), name(n), phoneNumber(p), address(a), gpa(g)
 * @abstract_properties
 * 	P_Student /\
 *  mutable(gpa)=true /\ optional(gpa)=False /\ min(gpa)=0.0 /\ max(gpa)=4.0
 */

public class PostgradStudent extends Student {
    private final double mingpa = 0.0;
    private final double maxgpa = 4.0;

    @DomainConstraint(type="double",mutable=true, optional=false, min=0.0, max=4.0)
    private double gpa;
    // constructor methods
    /*
     * @effects
     *  if i, n, p, a, g are valid
     *      initialise this as PostgradStudent<i,n,p,a,g>
     *  else
     *      throw NotPossibleException
     */
    public PostgradStudent(
        @AttrRef("id") Integer i,
        @AttrRef("name") String n,
        @AttrRef("phoneNumber") String p,
        @AttrRef("address") String a,
        @AttrRef("gpa") double g) throws NotPossibleException {
        super(i, n, p, a);
        if(!validateGPA(g)) {
            throw new NotPossibleException("PostgradStudent.init: invalid gpa: " + g);
          }
        
        // all are valid
        this.gpa = g;
    }

    

    // methods
    @Override
    public String toString() {
        return "PostgradStudent(" + getName() + "id: " + getID() + ")";
    }

    // validation methods
  /*
   * @effects
   *  if <i, n, p, a> is a valid tuple
   *    return true
   *  else
   *    return false
   */
  protected boolean validate(Integer i, String n, String p, String a, Float g) {
    return validateID(i) && validateName(n) && validatePhonenumber(p) && validateAddress(a) && validateGPA(g);
  }

  /**
   * @effects
    *   if g is valid 
    *       return true 
    *   else 
    *       return false
   */
  protected boolean validateGPA(double g) {
    if (mingpa < g && g < maxgpa)
      return true;
    else
      return false;
  }
}
