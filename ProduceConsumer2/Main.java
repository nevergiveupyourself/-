package ProduceConsumer2;

public class Main {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ProduceThread[] pt = new ProduceThread[2];
        ConsumeThread[] ct = new ConsumeThread[2];
        for (int i = 0; i < 2; i++) {
            pt[i] = new ProduceThread(myService);
            pt[i].setName("生产者" + (i + 1));
            ct[i] = new ConsumeThread(myService);
            ct[i].setName("消费者" + (i + 1));
            pt[i].start();
            ct[i].start();
        }
    }
}
