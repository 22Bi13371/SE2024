package a1_22BI13371;

import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.DOpt;
import utils.OptType;
import utils.AttrRef;


/**
 * @overview PostgradStudent is a student that will attend a university at the postgraduate level
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
    private final int maxid = 1000000000;
    private final int minid = 100000000 + 1;

    @DomainConstraint(type="double",mutable=true, optional=false, min=0.0, max=4.0)
    private double gpa;
    // constructor methods
    /**
     * @modifies this.id, this.name, this.phoneNumber, this.address
     * @effects
     *  if i, n, p, a are valid
     *      initialise this as PostgradStudent<i,n,p,a>
     *  else
     *      throw NotPossibleException
     */
    public PostgradStudent(
        @AttrRef("id") int i,
        @AttrRef("name") String n,
        @AttrRef("phoneNumber") String p,
        @AttrRef("address") String a) throws NotPossibleException {
        super(i, n, p, a);
    }

    

    // methods
    // Getters
    /**
    * @effects return this.gpa
    */
  @DOpt(type=OptType.Observer) @AttrRef("gpa")
  public double getGPA() {
    return this.gpa;
  }
      
  // Setters
  /**
   * @modifies this.gpa
   * 
   * @effects
   *  if gpa is valid
   *    set this.gpa = gpa
   *    return true
   *  else
   *    return false
   */
  @DOpt(type=OptType.Mutator) @AttrRef("gpa")
  public boolean setGpa(double gpa) {
    if (validateGPA(gpa)) {
      this.gpa = gpa;
      return true;
    } else {
      return false;
    }
  }

    @Override
    public String toString() {
        return "PostgradStudent(" + getName() + ", id: " + getID() + ")";
    }

    // validation methods
  /*
   * @effects
   *  if <i, n, p, a> is a valid tuple
   *    return true
   *  else
   *    return false
   */
  protected boolean repOK(Integer i, String n, String p, String a, Float g) {
    return validateID(i) && validateName(n) && validatePhonenumber(p) && validateAddress(a) && validateGPA(g);
  }

/**
   * @effects
    *   if id is valid 
    *       return true 
    *   else 
    *       return false
   */
  @Override
  protected boolean validateID(int i) {
    if (minid > i || i > maxid)
      return false;
    else
      return true;
  }

  /**
   * @effects
    *   if g is valid 
    *       return true 
    *   else 
    *       return false
   */
  protected boolean validateGPA(double g) {
    if (mingpa > g || g > maxgpa)
      return false;
    else
      return true;
  }
}
