package ProduceConsumer2;

public class ConsumeThread extends Thread {
    private MyService c;

    public ConsumeThread(MyService c) {
        this.c = c;
    }

    @Override
    public void run() {
        while(true){
            c.consumer();
        }
    }
}
