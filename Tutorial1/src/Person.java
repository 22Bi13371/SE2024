package src;
import utils.DomainConstraint;


/*
 * @overview Person whose will own mobilephone(s)
 * @atrributes
 *  id      Integer int
 *  name    String 
 *  phone   MobilePhone
 * @object A typical Person is p=<i, n>, where id(i), name(n)
 * @abstractt_properties
 * mutable(id)=false /\ optional(id)=false /\ min(id)=1 /\
 * mutable(name)=true /\ optional(name)=false /\ max(name)=30 /\
 * mutable(phone)=true /\ optional(phone)=true
 */



public class Person {
    //atributes
    @DomainConstraint(mutable = false, optional = false, min = 1)
    private int id;

    @DomainConstraint(mutable = true, optional = false, max = 30)
    private String name;

    @DomainConstraint(mutable = true, optional = true)
    private MobilePhone phone;

}
