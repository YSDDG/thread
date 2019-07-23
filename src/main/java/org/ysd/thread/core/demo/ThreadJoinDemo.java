package org.ysd.thread.core.demo;

import org.apache.tomcat.jni.Thread;

/**
 * @author HanZhijie
 * @date 2019/7/19 09:15
 */
public class ThreadJoinDemo implements Runnable {

    private String printLetter;

    public static void printLetter(String letter) {
        System.out.println(letter);
    }

    public ThreadJoinDemo(String printLetter) {
        this.printLetter = printLetter;
    }

    @Override
    public void run() {
        printLetter(printLetter);
    }

    public static void main(String[] args) {
        ThreadJoinDemo threadJoinDemoA=new ThreadJoinDemo("A");
        ThreadJoinDemo threadJoinDemoB=new ThreadJoinDemo("B");
        ThreadJoinDemo threadJoinDemoC=new ThreadJoinDemo("C");
        for (int i = 0; i < 1000000; i++) {
            threadJoinDemoA.run();
            threadJoinDemoB.run();
            threadJoinDemoC.run();
            System.out.println("-----------------------");
        }
    }
}
