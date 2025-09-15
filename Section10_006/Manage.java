package Section10_006;

public interface Manage<T> {
    void add(T item);
    void update(int index ,T item);
    void delete(int item);
    void display();
}
