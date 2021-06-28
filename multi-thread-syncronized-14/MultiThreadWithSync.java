public class MultiThreadWithSync {

    public static int counter = 0;

    public static synchronized void increment() {
        MultiThreadWithSync.counter++;
    }

    public static void main(String[] args) {
        System.out.println("hello multi-threaded");

        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++) {
                    MultiThreadWithSync.increment();
                }
            }
        });

        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++) {
                    MultiThreadWithSync.increment();
                }
            }
        });

        Thread three = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++) {
                    MultiThreadWithSync.increment();
                }
            }
        });

        Thread four = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++) {
                    MultiThreadWithSync.increment();
                }
            }
        });

        Thread five = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++) {
                    MultiThreadWithSync.increment();
                }
            }
        });

        Thread six = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++) {
                    MultiThreadWithSync.increment();
                }
            }
        });

        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
        six.start();
        try  {
            one.join();
            two.join();
            three.join();
            four.join();
            five.join();
            six.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Counter: " + MultiThreadWithSync.counter);
    }
}
