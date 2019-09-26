package ProduceConsumer1;

import java.util.ArrayList;

public class Consumer {
    private Object object;
    private ArrayList<Integer> list;//用list存放生产之后的数据,最大容量为1,疑问：并没有限定最大容量

    public Consumer(Object object,ArrayList<Integer> list){
        this.object=object;
        this.list=list;
    }

    public void consumer(){
        synchronized (object){
            try {
                Thread.sleep(3000);
                //只有list不为空时才会去进行消费操作
                while (list.isEmpty()) {
                    System.out.println("消费者:" + Thread.currentThread().getName() + "waiting");
                    object.wait();
                }
                list.clear();
                System.out.println("消费者:" + Thread.currentThread().getName() + "Runnable");
                object.notifyAll();//去唤醒因object调用wait方法处于阻塞状态的线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
