package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class ListAdapterForStack<E> implements MyStack<E> {

    List<E> data;

    public ListAdapterForStack() {
        this(new ArrayList<E>());
    }

    public ListAdapterForStack(List<E> list2) {
        this.data = list2;
    }

    @Override
    public void push(E element) {
        data.add(0, element);
    }

    @Override
    public E pop() {
        E element = data.get(0);
        data.remove(0);
        return element;
    }
}
