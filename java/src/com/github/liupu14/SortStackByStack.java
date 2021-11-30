package com.github.liupu14;

import java.util.Stack;

public class SortStackByStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(2);
        sortStackByStack(stack);
        System.out.println(stack);
    }

    public static void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.empty()){
            int cur = stack.pop();
            while (!help.empty() && help.peek()<cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.empty()){
            stack.push(help.pop());
        }
    }
}
