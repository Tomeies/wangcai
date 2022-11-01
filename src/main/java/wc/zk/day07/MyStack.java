package wc.zk.day07;

/**
 * 栈的实现 进栈出栈
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-01 09:44:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-01      zk           v1.0.0               新建
 **/
public class MyStack {
    //先进后出 10 20 30 40 出来的顺序是相反的
    private int maxSize;
    private long[] stackArray;
    private int top;
    public MyStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    public void push(long j) {
        stackArray[++top] = j;
    }
    public long pop() {
        return stackArray[top--];
    }
    public long peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public static void main(String[] args) {
        MyStack theStack = new MyStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
