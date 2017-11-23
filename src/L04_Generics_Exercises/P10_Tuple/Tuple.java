package L04_Generics_Exercises.P10_Tuple;

public class Tuple<T1, T2> {
    private T1 item1;
    private T2 item2;
    
    public Tuple(T1 item1, T2 item2) {
        this.setItem1(item1);
        this.setItem2(item2);
    }
    
    private void setItem1(T1 item1) {
        this.item1 = item1;
    }
    
    private void setItem2(T2 item2) {
        this.item2 = item2;
    }
    
    public T1 getItem1() {
        return this.item1;
    }
    
    public T2 getItem2() {
        return this.item2;
    }
    
    @Override
    public String toString() {
        
        return this.item1 + " -> " + this.item2;
    }
}
