package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class ListAdapterForQueue<E> implements MyQueue<E> {

    List<E> data;

    public ListAdapterForQueue(List<E> list1) {
        this.data = list1;
    }

    public ListAdapterForQueue() {
        this(new ArrayList<E>());
    }

    @Override
    public void enQueue(E element) {
        data.add(element);
    }

    @Override
    public E deQueue() {
        return data.remove(0);
    }

    public String toString(){
        return data.toString();
    }
}
