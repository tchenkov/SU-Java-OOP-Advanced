package L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy;

import L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Implementations.AddCollectionImpl;
import L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Implementations.AddRemoveCollectionImpl;
import L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Implementations.MyListImpl;
import L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Interfaces.AddCollection;
import L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Interfaces.AddRemoveCollection;
import L02_InterfacesAndAbstraction_Exercises.P09_CollectionHierarchy.Interfaces.MyList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split("\\s+");
        int numberOfDisplayElements = Integer.parseInt(br.readLine());
    
    
        AddCollection addCollection = new AddCollectionImpl();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollectionImpl();
        MyList myList = new MyListImpl();
    
        AddCollection[] addCollections = new AddCollection[3];
        addCollections[0] = addCollection;
        addCollections[1] = addRemoveCollection;
        addCollections[2] = myList;
        
        for (int i = 0; i < 3; i++) {
            List<Integer> additionIndexes = new ArrayList<>();
    
            for (int j = 0; j < arr.length; j++) {
                additionIndexes.add(addCollections[i].add(arr[j]));
            }
    
            System.out.println((Arrays.toString(additionIndexes.toArray())).replaceAll("[\\[\\],]", ""));
        }
        
        List<Object> removedElementsFromAddRemoveCollection = new ArrayList<>(numberOfDisplayElements);
        List<Object> removedElementsFromMyList = new ArrayList<>(numberOfDisplayElements);
    
        for (int i = 0; i < numberOfDisplayElements; i++) {
            try {
                removedElementsFromAddRemoveCollection.add(addRemoveCollection.remove());
                removedElementsFromMyList.add(myList.remove());
            } catch (IndexOutOfBoundsException iobe) {}
        }
    
        System.out.println(
                (Arrays.toString(removedElementsFromAddRemoveCollection.toArray())).replaceAll("[\\[\\],]", "")
        );
        System.out.println(
                (Arrays.toString(removedElementsFromMyList.toArray())).replaceAll("[\\[\\],]", "")
        );
    }
}
