package demo;

public class PrintDemo {
        public static void main(String[] args) {
            final PrintDemo demo2 = new PrintDemo();
            Thread t1 = new Thread(demo2::print1);
            Thread t2 = new Thread(demo2::print2);

            t1.start();
            t2.start();
        }

        public synchronized void print2() {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println(i);
                this.notify();
                try {
                    this.wait();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }

        public synchronized void print1() {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i);
                this.notify();
                try {
                    this.wait();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    }

