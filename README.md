# 常见设计模式代码样例
#生产者消费者模型
#方案一,知识点:ArrayList<Integer>,while循环,synchronized,wait,notifyAll.
#用五个类来实现，分别为Produce(实现生产过程), Consumer(实现消费过程), ProduceThread(实现生产者线程),ConsumeThread(实现消费者线程),Main等。需要注意的是有两个地方。
#(1)用while判断当前list是否为空；
#(2)调用的是object的notifyAll()方法而不是notify()方法。
