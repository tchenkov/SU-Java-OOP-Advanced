package L03_Generics_Lab.P04_ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 33, 6, 4, -47, 8, 9, 5);
        System.out.println(ListUtils.getMin(integers));
        System.out.println(ListUtils.getMax(integers));
    }
}
