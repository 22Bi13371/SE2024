package Tutorial3;


public class Program {
    public static void main(String[] args) throws InterruptedException {
        Counter3 value = new Counter3(10);

        while (true) {
            value.incr(10);

            System.out.println(value.get());
            
            Thread.sleep(500);
        }
    }
    
}
