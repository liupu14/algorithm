package com.github.liupu14;

import java.util.Stack;

public class GetMinStack {
    public static void main(String[] args) {
        GetMinStack getMinStack = new GetMinStack();
        getMinStack.push(9);
        getMinStack.push(4);
        getMinStack.push(2);
        System.out.println(getMinStack.getMin());
        getMinStack.pop();
        System.out.println(getMinStack.getMin());
    }

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    public GetMinStack(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newValue){
        stackData.push(newValue);
        if (stackMin.empty()){
            stackMin.push(newValue);
        } else if(newValue<=this.getMin()){
            stackMin.push(newValue);
        }
    }

    public void pop(){
        if (this.stackData.empty()){
            throw new RuntimeException("stack is empty");
        } else {
            int value = stackData.pop();
            if(value==this.getMin()){
                stackMin.pop();
            }
        }
    }

    public int getMin(){
        if(stackMin.empty()){
            throw new NullPointerException("empty stack");
        } else {
            return stackMin.peek();
        }
    }
}
