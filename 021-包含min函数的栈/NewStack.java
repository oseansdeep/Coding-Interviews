
import java.util.Stack;


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

 
}
