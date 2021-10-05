package com.company;

public class Stack <T> implements ReferenceBasedStack <T>
{
    private Node top;

    public Stack()
    {
        this.top = null;
    }

    public boolean isEmpty()
    {
        return (this.top == null);
    }

    public void push(Object item)
    {
        Node n = new Node(item);
        n.next = top;
        top = n;
        //System.out.println(top.data);
        //System.out.println(top.getNext());
    }



    public T pop() throws Exception
    {
        if(!isEmpty())
        {
            Node n = this.top;
            this.top = this.top.next;
            return (T) n.data;
        }
        else
            throw new Exception("Stack empty: pop");
    }


    public T peek() throws Exception {
        if(!isEmpty())
            return (T) this.top.data;
        else
            throw new Exception("Stack empty: peek");
    }


}
