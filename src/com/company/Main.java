package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	    Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());

    }
}
