package ProduceConsumer2;

public class ProduceThread extends Thread {
    private MyService p;

    public ProduceThread(MyService p) {
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            p.produce();
        }
    }
}
