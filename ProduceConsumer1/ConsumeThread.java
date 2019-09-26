package ProduceConsumer1;

public class ConsumeThread extends Thread{
    private Consumer c;
    public ConsumeThread(Consumer c){
        this.c=c;
    }

    @Override
    public void run() {
        while (true) {
            c.consumer();
        }
//        c.consumer();如果不加while循环,则只会执行一次,结果为:
//        生产者:生产者1Runnable
//        消费者:消费者2Runnable
//        生产者:生产者2Runnable
//        消费者:消费者1Runnable
    }
}
