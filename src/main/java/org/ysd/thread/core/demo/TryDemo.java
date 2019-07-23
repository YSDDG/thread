package org.ysd.thread.core.demo;

/**
 * @author HanZhijie
 * @date 2019/7/15 15:58
 */
public class TryDemo {

    public static void main(String[] args) {
        try{
            System.exit(1);
        }finally {
            System.out.println("print from finally");
        }
    }
}
