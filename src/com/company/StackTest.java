package com.company;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @org.junit.jupiter.api.Test
    void isEmpty()
    {
        Stack<Integer> s = new Stack<>();
        assertTrue(s.isEmpty());

        s.push(1);
        assertFalse(s.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void push() throws Exception {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < 10; i++)
        {
            s.push(i);
        }
        assertEquals(9, s.peek());
        s.pop();
        assertEquals(8, s.peek());
    }

    @org.junit.jupiter.api.Test
    void pop() throws Exception {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);

        assertEquals(2,s.peek());
        s.pop();
        assertEquals(1, s.peek());


        //checking exception
        assertThrows(Exception.class, () ->
        {
            Stack<Integer> st = new Stack<>();
            st.pop();
        }, "Stack empty: pop");

    }

    @org.junit.jupiter.api.Test
    void peek() throws Exception {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        assertEquals(2, s.peek());

        //checking exception
        assertThrows(Exception.class, () -> {
            Stack<Integer> st = new Stack<>();
            st.peek();
        }, "Stack empty: peek");
    }
}