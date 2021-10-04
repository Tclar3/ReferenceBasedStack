package com.company;

public interface ReferenceBasedStack <T>
{
    public boolean isEmpty();

    public void push(T item);

    public T pop() throws Exception;

    public T peek() throws Exception;


}
