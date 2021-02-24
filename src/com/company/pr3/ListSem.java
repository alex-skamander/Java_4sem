package com.company.pr3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;

public class ListSem<T> {
    private final Semaphore semaphore;
    private List arraylist;

    ListSem(int limit) {
        this.arraylist = Collections.synchronizedList(new ArrayList());
        semaphore = new Semaphore(limit);
    }

    public ListSem(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public boolean add(T t) throws InterruptedException {
        boolean added = false;
        semaphore.acquire();
        try {
            added = arraylist.add(t);
            return added;
        } finally {
            if (!added)
                semaphore.release();
        }

    }

    public boolean remove(T t) {
        boolean wasRemoved = arraylist.remove(t);
        if (wasRemoved)
            semaphore.release();
        return wasRemoved;
    }

    public void remove(int index) {
        arraylist.remove(index);
        semaphore.release();
    }

    public List getArraylist() {
        return arraylist;
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }
}

