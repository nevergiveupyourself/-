package ProduceConsumer2;

import java.util.ArrayList;

public class MyService {
    private ArrayList<Integer> list=new ArrayList<Integer>();

    synchronized public void produce() {
        try {
            Thread.sleep(3000);
            while (!list.isEmpty()) {
                System.out.println("生产者:" + Thread.currentThread().getName() + "waiting");
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int value = 9999;
        list.add(value);
        System.out.println("生产者:" + Thread.currentThread().getName() + "Runnable");
        this.notifyAll();
    }

    synchronized public void consumer() {
        try {
            Thread.sleep(3000);
            while (list.isEmpty()) {
                System.out.println("消费者:" + Thread.currentThread().getName() + "waiting");
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.clear();
        System.out.println("消费者:" + Thread.currentThread().getName() + "Runnable");
        this.notifyAll();
    }
}
