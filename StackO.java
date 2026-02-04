
import java.util.Arrays;

public class StackO<T> implements Stack<T> {

    private T[] stack;
    private int capacidad_inicial = 10;
    private int top;

    public StackO() {
        this.stack = (T[]) new Object[capacidad_inicial];
    }

    @Override
    public void push(T item) {
        if (top == stack.length - 1) {
            resize();
        }
        stack[++top] = item;
    }

    @Override
    public T pop() {
        if (top == -1) {
            throw new UnsupportedOperationException("El stack está vacío");
        }

        return stack[top--];
    }

    @Override
    public T peek() {
        if (top == -1) {
            throw new UnsupportedOperationException("El stack está vacío");
        } else if (isEmpty()) {
            throw new UnsupportedOperationException("El stack está vacío");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void resize() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }
}