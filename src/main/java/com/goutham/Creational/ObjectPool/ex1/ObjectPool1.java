package com.goutham.Creational.ObjectPool.ex1;

import java.util.*;

public abstract class ObjectPool1<T> {
//    private static ObjectPool1 instance;
    List<T> notInUse,inUse;
    public ObjectPool1(){
        notInUse=new ArrayList<>();
        inUse=new ArrayList<>();
    }

//    public static ObjectPool1 getInstance(){
//        if(instance==null)
//            instance=new ObjectPool1();
//        return instance;
//    }

    abstract T create();
    abstract boolean validate(T t);
    abstract void dead(T t);

    synchronized T takeObject(){
        T t;
        while (notInUse.size()>0){
            t= notInUse.get(0);
            if(validate(t))
            {
                notInUse.remove(t);
                inUse.add(t);
                return t;
            }
            else {
                notInUse.remove(t);
                t=null;
            }
        }
        t=create();
        inUse.add(t);
        return t;
    }

    synchronized void returnObject(T t){
        inUse.remove(t);
        notInUse.add(t);
    }

}
