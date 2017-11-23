package L04_Generics_Exercises.P09_CustomListIterator;

import java.util.Collections;

public class CustomListSorter {
    public static <T extends Comparable> void sort(CustomList<T> customList){
        Collections.sort(customList.getList());
    }
}
