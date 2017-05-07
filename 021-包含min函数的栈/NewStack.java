package 剑指offer.包含min函数的栈;

import java.util.Stack;

/**
 * Created by 窦博涵 on 2017/5/6.
 */
public class NewStack {


    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> minData = new Stack<>();
    Integer min = null;

    public void push(int node) {

        if (min != null) {
            if (node < min) {
                min = node;
                minData.push(min);
            }
            data.push(node);

        } else {
            min = node;
            data.push(node);
            minData.push(node);
        }
    }

    public void pop() {

        int num1 = data.pop();
        int num2 = minData.pop();
        if (num1 != num2)
            minData.push(num2);


    }

    public int top() {

        return data.peek();

    }

    public int min() {

        return minData.peek();

    }

    public static void main(String[] args) {

        NewStack newStack = new NewStack();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            newStack.push(array[i]);
        }
        System.out.println(newStack.min());


    }
}
