package com.offer.algorithm.designpattern;

/**
 * @author pcwl
 * @date 2019/8/16 8:10
 * @description 单例模式
 */
public class Singleton {

    /**
     * 双重校验锁
     */
    private volatile static Singleton singleton;

    private Singleton(){};

    public Singleton getInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * 静态内部类
     */
    public static class SingletonHolder{
        public static final Singleton instance = new Singleton();
    }

    public Singleton getSingleton(){
        return SingletonHolder.instance;
    }
}
