package L03_Generics_Lab.P02_GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {
    public static <T> T[] create(int length, T item) {
        // casting parent to child throws ClassCastException
        //T[] array = (T[]) new Object[length];
        T[] array = (T[]) Array.newInstance(item.getClass(), length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        
        return array;
    }
    
    public static <T> T[] create(Class<T> type, int length, T item) {
        T[] array = (T[]) Array.newInstance(type, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
    
        return array;
    }
}
