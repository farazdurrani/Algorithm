package com.algorithm.dynamiclist;

public class StackTest {
public static void main(String[] args) {
    Stack<Integer> s = new Stack<>("My Stack");
    s.push(1);
    s.print();
    s.push(2);
    s.print();
    System.out.println(s.pull() + " removed");
    s.print();
    System.out.println(s.pull() + " removed");
    s.print();
}
}
