package employee;

public class Restaurant {

    public static void main(String[] args) {
        Waiter w = new Waiter();
        Cook c = new Cook();
        
        w.work();
        w.cleaning();
        c.work();
        c.cleaning();
    }
}
