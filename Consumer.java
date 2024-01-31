public class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            try {
                this.c.consumeItem();
            } catch (Exception e) {

                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }

}
