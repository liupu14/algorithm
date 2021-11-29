package com.github.liupu14;

import java.util.Stack;

public class StackToQueue {
    public static void main(String[] args) {
        StackToQueue queue = new StackToQueue();
        queue.add(5);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    public StackToQueue(){
        this.pushStack = new Stack<Integer>();
        this.popStack = new Stack<Integer>();
    }

    public void popToPush(){
        if(popStack.empty()){
            while (!pushStack.empty()){
                popStack.push(pushStack.pop());
            }
        }
    }

    public void add(int newValue){
        pushStack.push(newValue);
        popToPush();
    }

    public int poll(){
        if(popStack.empty() && pushStack.empty()){
            throw new RuntimeException("stack is empty");
        } else {
            popToPush();
            return popStack.pop();
        }
    }

    public int peek(){
        if(popStack.empty() && pushStack.empty()){
            throw new RuntimeException("stack is empty");
        } else {
            popToPush();
            return popStack.peek();
        }
    }
}

