package bg.softuni.collection;

import bg.softuni.interfaces.Emergency;

public class EmergencyRegister {

    private static final Integer INITIAL_SIZE = 16;

    private Emergency[] emergencyQueue;
    private int nextIndex;

    public EmergencyRegister() {
        this.emergencyQueue = new Emergency[INITIAL_SIZE];
        this.nextIndex = 0;
    }

    private void checkIfResizeNeeded() {
        if(this.nextIndex == this.emergencyQueue.length) {
            this.resize();
        }
    }

    private void resize() {
        Emergency[] newArray = new Emergency[2 * this.nextIndex];

        for (int i = 0; i < this.nextIndex; i++) {
            newArray[i] = this.emergencyQueue[i];
        }

        this.emergencyQueue = newArray;
    }

    public void enqueueEmergency(Emergency emergency) {
        this.checkIfResizeNeeded();

        this.emergencyQueue[this.nextIndex] = emergency;
        this.nextIndex++;
    }

    public Emergency dequeueEmergency() {
        Emergency removedElement = this.emergencyQueue[0];

        for (int i = 0; i < this.nextIndex - 1; i++) {
            this.emergencyQueue[i] = this.emergencyQueue[i + 1];
        }

        this.nextIndex--;

        return removedElement;
    }

    public Emergency peekEmergency() {
        Emergency peekedElement = this.emergencyQueue[0];
        return peekedElement;
    }

    public Boolean isEmpty() {
        return this.nextIndex == 0;
    }
}
