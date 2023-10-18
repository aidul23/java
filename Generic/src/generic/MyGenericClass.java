package generic;

public class MyGenericClass<T> {
    T value;

    public MyGenericClass(T value) {
        this.value = value;
    }
    
    public void getValue() {
        System.out.println(value);
    }
}
