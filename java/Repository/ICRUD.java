package Repository;

import java.util.List;

public interface ICRUD <T> {
      
    void save(T t);
    void update(T t,long id);
    void delete(long id);
    List<T> findAll();
    void saveAll(List<T> t );
    int findId();
}
