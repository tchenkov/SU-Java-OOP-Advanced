package L03_Generics_Lab.P01_JarOfT;

import java.util.Stack;

public class Jar<T> {
    private Stack<T> jar;
    
    public Jar() {
        this.jar = new Stack<>();
    }
    
    public void add(T element){
        this.jar.push(element);
    }
    
    public T remove(){
        return this.jar.pop();
    }
}
