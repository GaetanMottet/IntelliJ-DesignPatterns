package StacksAndQueues;

import java.util.List;

public class Stack<E> {
    List<E> myStack ;
    public void push(E element) {
        myStack.add(element) ;
    }

    public E pop() {
        if(myStack.size() > 0) {
            E myElement = myStack.get(myStack.size() - 1);
            myStack.remove(myStack.size()-1) ;
            return myElement;
        }

        return null;
    }
}
