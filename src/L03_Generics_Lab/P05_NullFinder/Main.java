package L03_Generics_Lab.P05_NullFinder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1 , null , 5 , 6 , null);
        System.out.println(ListUtils.getNullIndices(integers));
    }
}
