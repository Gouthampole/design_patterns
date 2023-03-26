package com.goutham.Creational.ObjectPool.ex1;

import java.util.*;

public class ObjectPool2<T> {
        private static ObjectPool2 instance;
    List<T> notInUse,inUse;
    private ObjectPool2(){
        notInUse=new ArrayList<>();
        inUse=new ArrayList<>();
    }

    public static ObjectPool2 getInstance(){
        if(instance==null)
            instance=new ObjectPool2();
        return instance;
    }

     T create(){
        T t=null;
        return t;
     }
    boolean validate(T t){
        return true;
    }
     void dead(T t){};

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
