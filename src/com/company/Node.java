package com.company;

public class Node <T>
{
    public T data;
    public Node next = null;

    public Node(T data)
    {
        this.data = data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return this.data;
    }

    public Node getNext()
    {
        return this.next;
    }

}
