package src;

import utils.DomainConstraint;

/*
 * @overview A mobilephone will be owned by a person
 * @atrributes
 *  manName     String     
 *  model       String 
 *  color       Character
 *  year        Integer     int
 *  guaranteed  Boolean     boolean
 * @object A typical MobilePhone is mp=<n, m>, where manName(n), model(m)
 * @abstractt_properties
 * mutable(manName)=false /\ optional(manName)=false /\ max(manname)=30 /\
 * mutable(model)=false /\ optional(model)=false /\ max(model)=30 /\
 * mutable(color)=true /\ optional(phone)=true /\
 * mutable(year)=false /\ optional(year)=true /\ min(year)=1973 /\
 * mutable(guaranteed)=true /\ optional(guaranteed)=true 
 */

public class MobilePhone {
    @DomainConstraint(mutable = false, optional = false, max = 30)
    private String manName;
    
    @DomainConstraint(mutable = false, optional = false, max = 30)
    private String model;

    @DomainConstraint(mutable = true, optional = true)
    private Character color;

    @DomainConstraint(mutable = false, optional = true, min = 1973)
    private int year;

    @DomainConstraint(mutable = true, optional = true)
    private boolean guaranteed;
}
