class Communicate {
    public static void main(String[] args) throws Exception {
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);
        
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        
        t2.start();  // Start consumer thread
        t1.start();  // Start producer thread
    }
}

class Producer extends Thread {
    StringBuffer buffer = new StringBuffer();
    
    public void run() {
        synchronized(buffer) {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.append("Item " + i + " ");
                    System.out.println("Produced Item " + i);
                    Thread.sleep(100);  // Simulate production time
                }
                buffer.notify();  // Notify consumer that production is done
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Producer producer;
    
    Consumer(Producer producer) {
        this.producer = producer;
    }
    
    public void run() {
        synchronized(producer.buffer) {
            try {
                producer.buffer.wait();  // Wait until production is finished
                System.out.println("Consumed: " + producer.buffer.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
