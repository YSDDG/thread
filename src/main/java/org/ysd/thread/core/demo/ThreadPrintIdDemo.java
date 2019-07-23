package org.ysd.thread.core.demo;

/**
 * @author HanZhijie
 * @date 2019/7/19 09:48
 */
public class ThreadPrintIdDemo extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName());
    }

    public ThreadPrintIdDemo(String name) {
        this.setName(name);
    }

    public static void main(String[] args) {
//        ThreadPrintIdDemo threadPrintIdDemoA = new ThreadPrintIdDemo("A");
//        ThreadPrintIdDemo threadPrintIdDemoB = new ThreadPrintIdDemo("B");
//        ThreadPrintIdDemo threadPrintIdDemoC = new ThreadPrintIdDemo("C");
//        try {
//            for (int i = 0; i < 10; i++) {
//                {
//                    threadPrintIdDemoA.start();
//                    threadPrintIdDemoA.join();
//                    threadPrintIdDemoA.interrupt();
//                    threadPrintIdDemoB.start();
//                    threadPrintIdDemoB.join();
//                    threadPrintIdDemoB.interrupt();
//                    threadPrintIdDemoC.start();
//                    threadPrintIdDemoC.join();
//                    threadPrintIdDemoC.interrupt();
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        Thread th = Thread.currentThread();
        while (true) {
            if (th.isInterrupted()) {
                break;
            }
            System.out.println(111);
            // 省略业务代码无数
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
