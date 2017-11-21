package L03_Generics_Lab.P03_GenericScale;

public class Scale<T extends Comparable> {
    private T left;
    private T right;
    
    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }
    
    public T getHeavier(){
        if (left.compareTo(right) > 0){
            return left;
        }
        
        if (left.compareTo(right) < 0){
            return right;
        }
        
        return null;
    }
}
