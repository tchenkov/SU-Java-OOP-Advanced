package L06_IteratorsAndComparators_Exercises.P08_PetClinics;

import java.util.Arrays;
import java.util.Iterator;

public class Clinic {
    private Pet[] rooms;
    private Iterator<Integer> addPetIterator;
    
    public Clinic(int size) {
        this.setRooms(size);
        this.addPetIterator = new AddPetIterator();
    }
    
    private void setRooms(int size) {
        if (size < 1 || size % 2 == 0) {
            throw new IllegalArgumentException(Errors.INVALID_OPERATION);
        }
        this.rooms = new Pet[size];
    }
    
    public boolean add(Pet pet) {
        while (this.addPetIterator.hasNext()) {
            int index = this.addPetIterator.next();
            if (this.rooms[index] == null){
                this.rooms[index] = pet;
                return true;
            }
        }
        
        return false;
    }
    
    public boolean releasePet() {
        int index = this.getReleaseIndex();
        if (index < 0){
            return false;
        }
        this.rooms[index] = null;
        return true;
    }
    
    public boolean hasEmptyRooms() {
        return Arrays.asList(this.rooms).contains(null);
    }
    
    public String print(int roomNumber) {
        int index = roomNumber - 1;
        return this.rooms[index] != null ?
                this.rooms[index].toString() :
                "Room empty";
    }
    
    private int getReleaseIndex() {
        int start = this.rooms.length / 2;
        int length = this.rooms.length;
        for (int i = 0; i < length; i++) {
            int index = (i + start) % length;
            if (this.rooms[index] != null) {
                return index;
            }
        }

        return -1;
    }
    
    private final class AddPetIterator implements Iterator<Integer> {
        int index = rooms.length / 2;
        int counter = 0;
        
        @Override
        public boolean hasNext() {
            return this.counter < rooms.length;
        }
        
        @Override
        public Integer next() {
            this.index = (this.counter % 2 != 0) ?
                    this.index - this.counter :
                    this.index + this.counter;
            this.counter++;
            
            return this.index;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder output = new StringBuilder();
        for (Pet room : this.rooms) {
            output.append(
                    room != null ?
                            room :
                            "Room empty"
            ).append(System.lineSeparator());
        }
        return output.toString().trim();
    }
}
