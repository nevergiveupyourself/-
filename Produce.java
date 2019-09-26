package ProduceConsumer1;

import java.util.ArrayList;

public class Produce {
    public Object object;
    public ArrayList<Integer> list;//用list存放生产之后的数据,最大容量为1,疑问：并没有限定最大容量

    //通过构造函数引入ArrayList和Object
    public Produce(Object object, ArrayList<Integer> list) {
        this.object = object;
        this.list = list;
    }

    public void produce() {//该方法不需要传入object和list,已通过构造函数传入
        synchronized (object) {
            try {
                Thread.sleep(3000);
                //只有list为空时才会去进行生产操作
                while (!list.isEmpty()) {
                    System.out.println("生产者:" + Thread.currentThread().getName() + "waiting");
                    object.wait();//此处需要try/catch
                }
                int value = 9999;
                list.add(value);
                System.out.println("生产者:" + Thread.currentThread().getName() + "Runnable");
                object.notifyAll();//去唤醒因object调用wait方法而处于阻塞状态的线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
