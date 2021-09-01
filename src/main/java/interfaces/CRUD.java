package interfaces;

import java.util.List;

public interface CRUD<T> {
    List<T> getAll();
    String create(T t);
    String read(T t);
    String update(T t);
    String delete(T t);
}
