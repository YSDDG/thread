//package org.ysd.thread.core.demo;
//
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
///**
// * @author HanZhijie
// * @date 2019/7/18 13:53
// */
//public class BlockedQueue<T>{
//    final Lock lock =
//            new ReentrantLock();
//    // 条件变量：队列不满
//    final Condition notFull =
//            lock.newCondition();
//    // 条件变量：队列不空
//    final Condition notEmpty =
//            lock.newCondition();
//
//    // 入队
//    void enq(T x) {
//        lock.lock();
//        try {
//            while (!notFull){
//                // 等待队列不满
//                notFull.await();
//            }
//            // 省略入队操作...
//            // 入队后, 通知可出队
//            notEmpty.signal();
//            notEmpty.signalAll();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            lock.unlock();
//        }
//    }
//    // 出队
//    void deq(){
//        lock.lock();
//        try {
//            while (队列已空){
//                // 等待队列不空
//                notEmpty.await();
//            }
//            // 省略出队操作...
//            // 出队后，通知可入队
//            notFull.signal();
//        }finally {
//            lock.unlock();
//        }
//    }
//}
//
