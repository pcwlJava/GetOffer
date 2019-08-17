package com.offer.algorithm.others;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author pcwl
 * @date 2019/8/16 8:32
 * @description 交替打印多线程
 */
public class PrintABCUseLock {

    private int times;
    private int state;
    private Lock lock = new ReentrantLock();

    public PrintABCUseLock(int times){
        this.times = times;
    }

    public void printA(){
        print("A", 0);
    }

    public void printB(){
        print("A", 1);
    }

    public void printC(){
        print("A", 2);
    }

    public void print(String name, int targetState){
        for(int i = 0; i < times; i++){
            lock.lock();
            if(state % 3 == targetState){
                state++;
                i++;
                System.out.println("线程：" + name + "，第 " + i + " 打印");
            }
            lock.unlock();
        }
    }
}
