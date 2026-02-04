//Esta clase fue utilizada para comprobar el funcionamiento con un ArrayList

import java.util.ArrayList;

public class StackA<T> implements Stack<T> {

    private ArrayList<T> stack;

    public StackA() {
        this.stack = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public T pop() {
        if (stack.isEmpty()) {
            throw new UnsupportedOperationException("El stack está vacío");
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public T peek() {
        if (stack.isEmpty()) {
            throw new UnsupportedOperationException("El stack está vacío");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

}
