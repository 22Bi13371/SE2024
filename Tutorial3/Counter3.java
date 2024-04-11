package Tutorial3;

public class Counter3 extends Counter {
    public Counter3(int n) {
        this.value = n;
    }
    
    public void incr(int n) {
        // TODO Auto-generated method stub
        if(n > 0) {
            this.value += n;
        }
    }
}
