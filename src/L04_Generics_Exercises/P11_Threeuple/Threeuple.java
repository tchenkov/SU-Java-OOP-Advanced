package L04_Generics_Exercises.P11_Threeuple;

public class Threeuple<T1, T2, T3> {
    private T1 item1;
    private T2 item2;
    private T3 item3;
    
    public Threeuple(T1 item1, T2 item2, T3 item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }
    
    @Override
    public String toString() {
        return this.item1 + " -> " + this.item2 + " -> " + this.item3;
    }
}
