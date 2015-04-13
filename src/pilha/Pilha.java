package pilha;

public interface Pilha {
    public void push(int v) throws Exception;
    public void pop() throws Exception;
    public boolean isEmpty();
    public void empty();
}
