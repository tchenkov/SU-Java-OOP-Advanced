package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.repositories;

import java.util.Map;

public interface Repository<T> {
    void add(T element);
    
    Map<String ,T> findAll();
}
