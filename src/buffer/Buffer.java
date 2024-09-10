package buffer;

class Buffer {
    private final int[] buffer;
    private final int size;
    private int count;

    public Buffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.count = 0;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (count == size) {
            // Buffer is full, wait for the consumer to consume
            wait();
        }

        buffer[count] = item;
        count++;
        System.out.println("Produced: " + item);

        // Notify the consumer that an item is available
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (count == 0) {
            // Buffer is empty, wait for the producer to produce
            wait();
        }

        int item = buffer[count - 1];
        count--;
        System.out.println("Consumed: " + item);

        // Notify the producer that space is available
        notify();

        return item;
    }
}