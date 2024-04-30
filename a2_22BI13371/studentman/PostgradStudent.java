package studentman;

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
     * @modifies this.id, this.name, this.phoneNumber, this.address, this.gpa
     * @effects
     *  if i, n, p, a, g are valid
     *      initialise this as PostgradStudent<i,n,p,a,g>
     *  else
     *      throw NotPossibleException
     */
    public PostgradStudent(
        @AttrRef("id") int i,
        @AttrRef("name") String n,
        @AttrRef("phoneNumber") String p,
        @AttrRef("address") String a,
        @AttrRef("gpa") double g) throws NotPossibleException {
        super(i, n, p, a);
        if(!validateGPA(g)) {
          throw new NotPossibleException("Student.init: invalid gpa: " + g);
        }

        // all are true
        this.gpa = g;
    }

    

    // methods
    // Getters
    /**
    * @effects return this.gpa
    */
  @DOpt(type=OptType.Observer) @AttrRef("gpa")
  public double getGpa() {
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
  public boolean setGpa(double g) {
    if (validateGPA(g)) {
      this.gpa = g;
      return true;
    } else {
      return false;
    }
  }

  // default
  /**
   * @effects
   * return this.name, this.id
   */
  @Override
  public String toString() {
      return "PostgradStudent(" + getName() + ", id: " + getID() + ")";
  }

  /**
   * @effects
   * return a HTML document
   */
  @Override
  public String toHtmlDoc() {
    return "<html>\n" + "<head><title>PostgradStudent:" + getID() + "-" + getName() + "</title></head>\n" + "<body>\n" + getID() + " " + getName() + " " + getPhoneNumber() + " " + getAddress() + " " + getGpa() + "\n</body></html>";
  }

  // validation methods
  /*
   * @effects
   *  if <i, n, p, a> is a valid tuple
   *    return true
   *  else
   *    return false
   */
  protected boolean repOK(Integer i, String n, String p, String a, double g) {
    if (validateID(i) && validateName(n) && validatePhonenumber(p) && validateAddress(a) && validateGPA(g)) {
      return true;
    }
    else {
      return false;
    }
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
