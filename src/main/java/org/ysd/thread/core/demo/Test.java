package org.ysd.thread.core.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HanZhijie
 * @date 2019/7/16 15:51
 */
public class Test {

    long value = 0L;

    synchronized long get() {
        return value;
    }

    synchronized void addOne() {
        value += 1;
    }


    private int count = 0;

    private void add() {
        int idx = 0;
        while (idx++ < 10000000) {
            count += 1;
        }
    }

    public static int calc() throws Exception {
        final Test test = new Test();
        List<Thread> ths = new ArrayList<>(989);
        for (int i = 0; i < 989; i++) {
            Thread th = new Thread(() -> {
                test.addOne();
                test.add();
            });
            ths.add(th);
            th.start();
        }
        Thread th1 = new Thread(() -> {
//            test.addOne();
            test.add();
        });
        Thread th2 = new Thread(() -> {
            test.add();
//            test.addOne();
        });

        th1.start();
        th2.start();
        th1.join();
        th2.join();
        for (int i = 0; i < ths.size(); i++) {
            ths.get(i).join();
        }
        System.out.println(test.get());
        return test.count;
    }

    public static void main(String[] args) throws Exception {
//        long c = calc();
    }
}

