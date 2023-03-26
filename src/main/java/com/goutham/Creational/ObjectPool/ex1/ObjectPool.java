package com.goutham.Creational.ObjectPool.ex1;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
    long deadTime;
    Hashtable<T,Long> lock,unlock;
    //unlock=objects which are not in use and lock means objects which are in use

    public ObjectPool(){
        deadTime=50000;
        lock=new Hashtable<>();
        unlock=new Hashtable<>();
    }

    abstract T create();
    abstract boolean validate(T t);
    abstract void dead(T t);

    synchronized T takeOut(){
        long now=System.currentTimeMillis();
        T t;
        if(unlock.size()>0){
            Enumeration<T> e= unlock.keys();
            while (e.hasMoreElements()){
                t=e.nextElement();
                if((now-unlock.get(t))>deadTime){
                    unlock.remove(t);
                    dead(t);
                    t=null;
                }
                else
                {
                    if(validate(t)){
                        unlock.remove(t);
                        lock.put(t,now);
                        return t;
                    }
                    else {
                        unlock.remove(t);
                        dead(t);
                        t=null;
                    }
                }
            }

        }
        t=create();
        lock.put(t,now);
        return t;
    }

    synchronized void takeIn(T t){
        lock.remove(t);
        unlock.put(t,System.currentTimeMillis());
    }

}

