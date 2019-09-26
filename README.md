# 常见设计模式代码样例
#生产者消费者模型ProduceConsumer1
#方案一:
#用五个类来实现，分别为Produce(实现生产过程), Consumer(实现消费过程), ProduceThread(实现生产者线程),ConsumeThread(实现消费者线程),Main等。需要注意的是有两个地方。
#(1)用while判断当前list是否为空；
#(2)调用的是object的notifyAll()方法而不是notify()方法。
#知识点:ArrayList<Integer>,while循环,synchronized,wait,notifyAll。
#方案二:
#用四个类实现，分别为MyService(实现生产和消费过程用synchronized关键字实现同步)，ProduceThread(实现生产者线程),ConsumeThread(实现消费者线程),Main。需要注意的也是方法一中的两个地方while和notifyAll()。
