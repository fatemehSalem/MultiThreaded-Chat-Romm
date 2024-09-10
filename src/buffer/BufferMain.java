package buffer;

public class BufferMain {
    public static class Main {
        public static void main(String[] args) {
            Buffer buffer = new Buffer(10);

            Thread producerThread = new Thread(new Producer(buffer));
            Thread consumerThread = new Thread(new Consumer(buffer));

            producerThread.start();
            consumerThread.start();

            try {
                producerThread.join();
                consumerThread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
