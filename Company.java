public class Company {
    int n;
    boolean t = true;

    synchronized public void produceItem(int n) throws Exception {
        if (!t) {
            wait();
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        t = false;
        notify();
    }

    synchronized public int consumeItem() throws Exception {
        if (t) {
            wait();
        }
        System.out.println("Consumed : " + this.n);
        t = true;
        notify();
        return this.n;
    }

}
