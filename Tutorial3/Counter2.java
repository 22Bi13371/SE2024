package Tutorial3;

/**
 * 
 */
public class Counter2 extends Counter {

    public void incr(){
        if(this.value == 0) {
            this.value++;
        }
        this.value *= 2;
    }
    
}
