package studentman;

import utils.DomainConstraint;
import utils.NotPossibleException;

import utils.AttrRef;
import utils.DOpt;
import utils.OptType;

/** <pre>
 * @overview Student will attend a university 
 *  </pre>
 *  <pre>
 *  @attributes 
 * 	id			    	Integer   int
 * 	name			    String
 * 	phoneNumber		String
 * 	address			  String  </pre>
 * @object 
 * 	a typical Student is s=<i, n, p, a>,
 *  	where id(i), name(n), phoneNumber(p), address(a)
 * @abstract_properties
 * 	mutable(id)=false /\ optional(id)=false /\ min(id)=1 /\ max(id)=10^9 /\
 * 	mutable(name)=true /\ optional(name)=false /\ min(length)=50
 * 	mutable(phoneNumber)=true /\ optional(phoneNumber)=false /\ length(phoneNumber)=10
 * 	mutable(address)=true /\ optional(address)=false /\ length(address)=100
 *  
 */

public class Student implements Comparable<Student>, studentman.Document {
  private final long maxint = (long)Math.pow(10, 9);

    @DomainConstraint(type="int",mutable=false, optional=false, min = 1, max = 10^9)
    private int id;
    @DomainConstraint(type="String",mutable=true, optional=false, length = 50)
    private String name;
    @DomainConstraint(type="String",mutable=true, optional=false, length = 10)
    private String phoneNumber;
    @DomainConstraint(type="String",mutable=true, optional=false, length = 100)
    private String address;

    // constructor method
    /**<pre>
     * @modifies this.id, this.name, this.phoneNumber, this.address
     * @effects
     *  if i, n, p, a are valid
     *      initialise this as Student<i,n,p,a>
     *  else
     *      throw NotPossibleException
     * </pre>
     */
    public Student(
        @AttrRef("id") int i,
        @AttrRef("name") String n,
        @AttrRef("phoneNumber") String p,
        @AttrRef("address") String a) throws NotPossibleException {
      if(!validateID(i)) {
        throw new NotPossibleException("Student.init: invalid id: " + i);
      }

      if(!validateName(n)) {
        throw new NotPossibleException("Student.init: invalid name: " + n);
      }

      if(!validatePhonenumber(p)) {
        throw new NotPossibleException("Student.init: invalid Phonenumber: " + p);
      }

      if(!validateAddress(a)) {
        throw new NotPossibleException("Student.init: invalid Address: " + a);
      }
      
      // all are valid
      this.id = i;
      this.name = n;
      this.phoneNumber = p;
      this.address = a;

  }

  // methods
  // getters
  /**
   * @effects <tt> return this.id </tt>
   */
  @DOpt(type=OptType.Observer) @AttrRef("id")
  public int getID() {
    return this.id;
  }

  /**
   * @effects <tt> return this.name </tt>
   */
  @DOpt(type=OptType.Observer) @AttrRef("name")
  public String getName() {
    return this.name;
  }

  /**
   * @effects <tt> return this.phoneNumber </tt>
   */
  @DOpt(type=OptType.Observer) @AttrRef("phoneNumber")
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  /**
   * @effects <tt> return this.address </tt>
   */
  @DOpt(type=OptType.Observer) @AttrRef("address")
  public String getAddress() {
    return this.address;
  }
  
  // setters
  /**
   * @modifies this.name
   * 
   * @effects <pre>
   *  if name is valid
   *    set this.name = name
   *    return true
   *  else
   *    return false
   * </pre.
   */
  @DOpt(type=OptType.Mutator) @AttrRef("name")
  public boolean setName(String name) {
    if (validateName(name)) {
      this.name = name;
      return true;
    } else {
      return false;
    }
  }
  /**
   * @modifies this.phoneNumber
   * 
   * @effects <pre>
   *  if phoneNumber is valid
   *    set this.phoneNumber = phoneNumber
   *  return true
   *     else
   *  return false
   * </pre>
   */
  @DOpt(type=OptType.Mutator) @AttrRef("phoneNumber")
  public boolean setPhoneNumber(String phoneNumber) {
    if (validatePhonenumber(phoneNumber)) {
      this.phoneNumber = phoneNumber;
      return true;
    } else {
      return false;
    }
  }
  /**
   * @modifies this.address
   * 
   * @effects <pre>
   *  if address is valid
   *    set this.address = address
   *  return true
   *     else
   *  return false
   * </pre>
   */
  @DOpt(type=OptType.Mutator) @AttrRef("address")
  public boolean setAddress(String address) {
    if (validateAddress(address)) {
      this.address = address;
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
    return "Student(" + name + ", id: " + id + ")";
  }

  @Override
  public String toHtmlDoc() {
    return "<html>\n" + "<head><title>Student:" + getID() + "-" + getName() + "</title></head>\n" + "<body>\n" + getID() + " " + getName() + " " + getPhoneNumber() + " " + getAddress() + "\n</body></html>";
  }

  /**
   * @requires Student other
   * 
   * @effects
   * return this.name.compareTo)other.name
   */
  @Override
  public int compareTo(Student other) {
    return this.name.compareTo(other.name);
  }
  
  // validation methods - helper
  /**
   * @effects <pre>
   *  if <i, n, p, a> is a valid tuple
   *    return true
   *  else
   *    return false
   * </pre>
   */
  protected boolean repOK(int i, String n, String p, String a) {
    if (validateID(i) && validateName(n) && validatePhonenumber(p) && validateAddress(a)) {
      return true;
    }
    else {
      return false;
    }
  }

  /**
   * @effects <pre>
   *  if i is valid
   *    return true
   *  else
   *    return false
   * </pre>
   */
  protected boolean validateID(int i) {
    if (0 > i || i > maxint){
      return false;
    }
      return true;
  }

  /**
   * @effects <pre>
   *  if n is valid
   *    return true
   *  else
   *    return false
   * </pre>
   */
  protected boolean validateName(String n) {
    if (n == null || n.length() > 50)
      return false;
    else
      return true;
  }

  /**
   * @effects <pre>
   *  if p is valid
   *    return true
   *  else
   *    return false
   * </pre>
   */
  protected boolean validatePhonenumber(String p) {
    if (p == null || p.length() > 10)
      return false;
    else
      return true;
  }

  /**
   * @effects <pre>
   *  if a is valid
   *    return true
   *  else
   *    return false
   * </pre>
   */
  protected boolean validateAddress(String a) {
    if (a == null || a.length() > 100)
      return false;
    else
      return true;
  }
}
