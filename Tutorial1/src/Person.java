package src;
import utils.NotPossibleException;
import utils.AttrRef;
import utils.DOpt;
import utils.OptType;
import utils.DomainConstraint;


/*
 * @overview Person whose will own mobilephone(s)
 * @atrributes
 *  id      Integer     int
 *  name    String 
 *  phone   MobilePhone
 * @object A typical Person is p=<i, n>, where id(i), name(n)
 * @abstractt_properties
 * mutable(id)=false /\ optional(id)=false /\ min(id)=1 /\
 * mutable(name)=true /\ optional(name)=false /\ max(name)=30 /\
 * mutable(phone)=true /\ optional(phone)=true
 */



public class Person {
    // atributes
    // State space
    private final int minID = 1;

    @DomainConstraint(mutable = false, optional = false, min = 1)
    private int id;

    @DomainConstraint(mutable = true, optional = false, length = 30)
    private String name;

    @DomainConstraint(mutable = true, optional = true)
    private MobilePhone phone;

    // methods
    // behavior space

    // constructor methods
    /*
     * @effects
     *  if i, n, are valid
     *      initialise this as Person<i,n>
     *  else
     *      throw NotPossibleException
     */
    public Person(
        @AttrRef("id") int i,
        @AttrRef("name") String n) throws NotPossibleException {
      if(!validateID(i)) {
        throw new NotPossibleException("Person.init: invalid id: " + i);
      }
      if(!validateName(n)) {
        throw new NotPossibleException("Person.init: invalid name: " + n);
      }
      
      // all are valid
      this.id = i;
      this.name = n;
  }

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
     * @effects <tt> return this.phone </tt>
     */
    @DOpt(type=OptType.Observer) @AttrRef("phone")
    public MobilePhone getPhone() {
        return this.phone;
    }

    /**
   * @effects <pre>
   *  if aname is valid
   *    set this.name = name
   *  return true
   *     else
   *  return false
   * </pre>
   */
  @DOpt(type=OptType.Mutator) @AttrRef("name")
  public boolean setName(String name) {
    if (validateName(name)) {
      this.name = name;
      return true;
    } 
    else {
      return false;
    }
  }

  /**
   * @effects <pre>
   *  if phone is valid
   *    set this.phone = phone
   *  return true
   *     else
   *  return false
   * </pre>
   */
  @DOpt(type=OptType.Mutator) @AttrRef("phone")
  public boolean setPhone(MobilePhone phone) {
    if (validatePhone(phone)) {
        this.phone = phone;
        return true;
      } 
      else {
        return false;
      }

  }

  // validation methods
  /*
   * @effects <pre>
   *  if this satisfies abstract properties
   *    return true
   *  else
   *    return false
   * </pre>
   */
  protected boolean repOK(int i, String n, MobilePhone p) {
    if (validateID(i) && validateName(n) && validatePhone(p)) {
        return true;
    } else {
        return false;
    }
  }

    /**
    * @effects <pre>
    *   if i is valid 
    *       return true 
    *   else 
    *       return false 
    * </pre>
    */
  protected boolean validateID(int i) {
    if (minID > i) {
        return false;
    }
    return false;
  }

    /**
    * @effects <pre>
    *   if name is valid 
    *       return false 
    *   else 
    *       return true
    * </pre>
    */
  protected boolean validateName(String name) {
    if (name == null) {
        return false;
    }
    if (name.length() == 0) {
        return false;
    }
    if (name.length() > 30) {
        return false;
    }
    return true;
  }

    /**
    * @effects <pre>
    *   if phone is valid 
    *       return false 
    *   else 
    *       return true
    * </pre>
    */
    protected boolean validatePhone(MobilePhone phone) {
        if (phone == null) {
            return false;
        }

        // if (!phone.repOK()) {
        //     return false;
        // }
        if (name.length() == 0) {
            return false;
        }
        if (name.length() > 30) {
            return false;
        }
        return true;
    }

    //default - toString
    public String tosString() {
        return "Person <id=" + this.id + ", name=" + this.name + ", phone=" + this.phone +">";
    }
}
