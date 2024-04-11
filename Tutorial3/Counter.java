package Tutorial3;


/**
 * 
 */
public class Counter {
    // TODO: domainconstraint
    protected int value;

    /**
     * 
     */
    public Counter() {
        this.value = 0;
    }

    /**
     * 
     * @return
     */
    public int get() {
        return this.value;
    }

    /**
     * 
     */
    public void incr() {
        this.value++;
    }
    
}
