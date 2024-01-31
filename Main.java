public class Main {
    // Producer Consumer Problem...
    // Synchonized, Inter-thread communications
    public static void main(String[] args) {
        Company com = new Company();
        Producer p = new Producer(com);
        Consumer c = new Consumer(com);
        p.start();
        c.start();
    }
}