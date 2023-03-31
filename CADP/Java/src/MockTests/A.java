package MockTests;
public class A {
    private int a = 1;
    
    public void primero(){
        segundo();
    }
    
    public void segundo(){
        System.out.println(a);
    }
}
